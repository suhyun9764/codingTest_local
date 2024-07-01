package BAEKJOON.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1018 {

    private static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        board = new char[n][m];

        for(int i=0;i<n;i++){
            board[i] = br.readLine().toCharArray();
        }

        int minChangeNum = 64;

        for(int i=0;i<n-7;i++){
            for(int j=0;j<m-7;j++){
                int changeNum = getHaveToChangeNum(i,j);
                if(minChangeNum > changeNum)
                    minChangeNum = changeNum;
            }
        }

        System.out.println(minChangeNum);

    }

    private static int getHaveToChangeNum(int i, int j) {
        char firstColor = board[i][j];
        int changeNum = 0;
        for(int n = i;n<i+8;n++){
            for(int m = j;m<j+8;m++){
                if(i%2==n%2){
                    if(j%2==m%2){
                        if(board[n][m]!=firstColor)
                            changeNum++;
                    }else{
                        if(board[n][m]==firstColor)
                            changeNum++;
                    }
                }
                else if(i%2!=n%2){
                    if(j%2==m%2){
                        if(board[n][m]==firstColor)
                            changeNum++;
                    }
                    else{
                        if(board[n][m]!=firstColor)
                            changeNum++;
                    }
                }
            }
        }

        return changeNum;
    }
}
