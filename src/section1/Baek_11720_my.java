package section1;

import java.util.Scanner;

public class Baek_11720_my {
    public static void main(String[] args) {

        int N = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] arr = new int[100];
        long sum  = 0;

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            sum +=arr[i];
        }

        System.out.println();


    }
}
