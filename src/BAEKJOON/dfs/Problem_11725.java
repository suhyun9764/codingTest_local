package BAEKJOON.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem_11725 {

    private static int N;
    private static ArrayList<Integer>[] map;
    private static boolean[] visited;
    private static int[] parents;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new ArrayList[N + 1];
        for (int i = 0; i < N+1; i++) {
            map[i] = new ArrayList<>();
        }
        visited = new boolean[N + 1];
        parents = new int[N + 1];

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a].add(b);
            map[b].add(a);
        }

        for (int i = 1; i < map.length; i++) {
            if (visited[i] == false)
                dfs(i);
        }

        for (int i = 2; i < N + 1; i++) {
            System.out.println(parents[i]);
        }


    }

    private static void dfs(int i) {
        visited[i] = true;
        List<Integer> children = new ArrayList<>();
        for (Integer child : map[i]) {
            if(visited[child]==false)
                children.add(child);
        }

        if (children.isEmpty())
            return;

        for (Integer ch : children) {
            parents[ch] = i;
            dfs(ch);
        }
    }
}
