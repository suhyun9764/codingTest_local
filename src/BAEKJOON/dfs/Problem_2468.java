package BAEKJOON.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem_2468 {
    private static int N;
    private static int[][] localMap;
    private static boolean[][] visited;
    private static boolean[][] isSank;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        localMap = new int[N][N];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j=0;
            while (st.hasMoreTokens()){
                localMap[i][j++] = Integer.parseInt(st.nextToken());
            }
        }
        int max = 0;

        for(int i=0;i<101;i++){ // 강수량 별
            int safetyZoneNum = 0;
            visited = new boolean[N][N];
            isSank = new boolean[N][N];

            // 잠긴 구역 확인
            checkSankArea(i);
            // 안전 지대 확인
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++){
                    if(isSank[j][k]==false&&visited[j][k]==false){
                        dfs(j,k);
                        safetyZoneNum++;
                    }
                }
            }

            max = Math.max(safetyZoneNum,max);
        }

        System.out.println(max);
    }

    private static void checkSankArea(int n) {
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(localMap[i][j]<=n){
                    isSank[i][j] = true;
                }
            }
        }
    }

    private static void dfs(int j, int k) {
        List<int[]> nearSafeAreas = checkNearSafeArea(j,k);
        if(nearSafeAreas.isEmpty())
            return;

        for (int[] nearSafeArea : nearSafeAreas) {
            dfs(nearSafeArea[0],nearSafeArea[1]);
        }
    }

    private static List<int[]> checkNearSafeArea(int i, int j) {
        int[] x = {0,-1,0,1};
        int[] y = {1,0,-1,0};
        List<int[]> nearSafeAreas = new ArrayList<>();
        for(int n=0;n<4;n++){
            if(0<=i+y[n]&&i+y[n]<N&&0<=j+x[n]&&j+x[n]<N&&isSank[i+y[n]][j+x[n]]==false){
                if(visited[i+y[n]][j+x[n]]==false){
                    nearSafeAreas.add(new int[]{i+y[n],j+x[n]});
                    visited[i+y[n]][j+x[n]] = true;
                }
            }
        }
        return nearSafeAreas;
    }
}
