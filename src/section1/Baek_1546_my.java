package section1;

import java.util.Scanner;

public class Baek_1546_my {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float[] arr = new float[N];
        float buf=0;
        float sum=0;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            if(buf<arr[i]){
                buf=arr[i];
            }
        }
        for(int i=0;i<N;i++){
            float temp = arr[i];
            arr[i] = temp/buf*100;
            sum += arr[i];
        }

        System.out.println(sum/N);


    }
}
