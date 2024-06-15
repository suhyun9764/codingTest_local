package section1;

import java.util.Scanner;

public class Baek_11720_lec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        char arr[] = s.toCharArray();
        int sum =0;
        for(int i=0;i<N;i++){
            sum += arr[i]-486;
        }

        System.out.println(sum);

    }
}
