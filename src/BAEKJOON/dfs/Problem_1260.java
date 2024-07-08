package BAEKJOON.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem_1260 {
    private static int N;

    private static int M;
    private static int V;
    private static int[][] nodeArr;
    private static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        nodeArr = new int[N+1][N+1];
        check = new boolean[N+1];

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            nodeArr[a][b] = 1;
            nodeArr[b][a] = 1;
        }

        dfs(V);
        System.out.println();
        check = new boolean[N+1];
        bfs(V);
    }

    private static void dfs(int v) {
        check[v] = true;
        System.out.printf(v+" ");

//        if(v==N)
//            return;

        for(int i=1;i<N+1;i++){
            if(nodeArr[v][i]==1&&check[i]==false){
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        check[v] = true;

        System.out.printf(v+" ");
        while (!queue.isEmpty()){
            int current = queue.poll();
            for(int i=1;i<N+1;i++){
                if(nodeArr[current][i]==1&&check[i]==false){
                    queue.add(i);
                    check[i] = true;
                    System.out.printf(i+" ");
                }
            }
        }
    }

}
