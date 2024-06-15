package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek_11724 {

    static boolean[] visit;
    static ArrayList<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count =0;
        visit = new boolean[n+1]; // 0은 사용하지 않고 1부터 n까지 사용
        arr = new ArrayList[n+1]; // 0은 사용하지 않고 1부터 n까지 사용

        for(int i=1;i<n+1;i++){
            arr[i] = new ArrayList<Integer>();
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        for(int i=1;i<n+1;i++){
            if(!visit[i]){
                count++;
                DFS(i);
            }
        }

        System.out.println(count);


    }

    private static void DFS(int v) {
        if(visit[v])
            return;
        visit[v] =true;
        for(int i : arr[v]){
            DFS(i);
        }
    }
}
