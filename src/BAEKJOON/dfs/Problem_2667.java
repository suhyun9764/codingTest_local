package BAEKJOON.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem_2667{
    private static int N;
    private static char[][] map;
    private static boolean[][] visited;
    private static Queue<Integer> answer = new PriorityQueue<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        visited = new boolean[N][N];
        for(int i=0;i<N;i++){
            map[i] = br.readLine().toCharArray();
        }

        for(int a=0;a<N;a++){
            for(int b=0;b<N;b++){
                if(map[a][b]=='1'&&visited[a][b]==false){
                    bfs(a,b);
                }
            }
        }
        System.out.println(answer.size());
        answer.stream().forEach(System.out::println);


    }

    private static void bfs(int a, int b) {
        int houseNum = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{a, b});
        visited[a][b] = true;

        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int currentA = current[0];
            int currentB = current[1];
            houseNum++;
            findNearHouse(currentA, currentB, queue);

        }

        answer.add(houseNum);
    }

    private static void findNearHouse(int a, int b, Queue<int[]> queue) {
        //위쪽
        if(a-1>=0) {
            if (map[a - 1][b] == '1' && visited[a - 1][b] == false) {
                queue.add(new int[]{a - 1, b});
                visited[a-1][b] = true;
            }
        }
        //왼쪽
        if(b-1>=0) {
            if (map[a][b - 1] == '1' && visited[a][b - 1] == false){
                queue.add(new int[]{a, b - 1});
                visited[a][b-1] = true;
            }

        }
        //아래쪽
        if(a+1<N) {
            if (map[a+1][b] == '1' && visited[a+1][b] == false){
                queue.add(new int[]{a+1, b});
                visited[a+1][b] = true;
            }

        }
        //오른쪽
        if(b+1<N) {
            if (map[a][b+1] == '1' && visited[a][b+1] == false){
                queue.add(new int[]{a, b+1});
                visited[a][b+1] = true;
            }

        }
    }
}
