package BAEKJOON.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2468 {
    private static int N;
    private static char[][] localMap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        localMap = new char[N][N];
        for(int i = 0; i<N;i++){
            localMap[i] = br.readLine().toCharArray();
        }




    }
}
