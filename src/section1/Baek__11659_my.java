package section1;

import java.util.Scanner;

public class Baek__11659_my {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int M = sc.nextInt();
        long[] arr = new long[N+1];
        arr[0] = 0;
         for(int i=1;i<=N;i++){
             int temp = sc.nextInt();
             arr[i] = arr[i-1] + temp;
         }

         for(int i=0;i<M;i++){
             int a = sc.nextInt();
             int b= sc.nextInt();
             System.out.println(arr[b]-arr[a-1]);
         }
    }
}
