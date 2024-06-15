package section2;

import java.util.Scanner;

public class Baek_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        for(int i=0;i<n;i++){
            int buf=0;
            for(int j=0;j<n-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = buf;
                }
            }

            if(buf==0)
                break;
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }


    }
}
