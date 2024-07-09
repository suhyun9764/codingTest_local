package BAEKJOON.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem_4963 {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int[][] map;
    private static boolean[][] visited;
    private static int w;
    private static int h;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w==0&&h==0)
                return;
            getIslandNumber(w,h);
        }
    }

    private static void getIslandNumber(int w, int h) throws IOException {
        int answer = 0;
        map = new int[h][w];
        visited = new boolean[h][w];
        for(int i=0;i<h;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<w;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(map[i][j]==1&&visited[i][j]==false) {
                    dfs(i, j);
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    private static void dfs(int i, int j) {
        visited[i][j] = true;
        List<int[]> nearLands = getNearLands(i,j);

        if(nearLands.isEmpty())
            return;
        for(int[] nearLand : nearLands){
            dfs(nearLand[0],nearLand[1]);
        }

    }

    private static List<int[]> getNearLands(int i, int j) {
        List<int[]> nearLands = new ArrayList<>();
        int[] x = {0,-1,-1,-1,0,1,1,1};
        int[] y = {1,1,0,-1,-1,-1,0,1};

        for(int t=0;t<8;t++){
            int a = i+y[t];
            int b = j+x[t];

            if(a>=0&&a<h&&b>=0&&b<w){
                if(visited[a][b]==false&&map[a][b]==1) {
                    nearLands.add(new int[]{a, b});
                    visited[a][b] = true;
                }
            }
        }

        return nearLands;
    }
}
