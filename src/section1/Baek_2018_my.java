package section1;

import java.util.Scanner;

public class Baek_2018_my {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = i+1;
        }

        int start = 0;
        int end = 0;
        int count =1;
        long sum=1;
        while(end!=N-1){
            if(sum<N){
                end++;
                sum = sum+arr[end];
            }else if(sum>N){
                sum = sum-arr[start];
                start++;
            }else if(sum==N){
                end++;
                sum = sum+arr[end];
                count++;
            }
        }

        System.out.println(count);
    }
}
