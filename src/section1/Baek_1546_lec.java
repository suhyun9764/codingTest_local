package section1;

import java.util.Scanner;

public class Baek_1546_lec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum=0;
        int max=0;
        int temp =0;
        for(int i=0;i<N;i++){
            temp = sc.nextInt();
            if(temp>max)
                max = temp;
            sum = sum+temp;
        }

        System.out.println(sum*100.0/max/N);
    }
}
