package section2;

import java.util.Scanner;

public class Baek_1427_lec {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[str.length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(str.substring(i,i+1));
        }

        for(int i=0;i<arr.length;i++){
            int max =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[max]<arr[j]){
                    max =j;
                }
            }
            if(arr[max]<arr[i]){
                int buf = arr[i];
                arr[i] = arr[max];
                arr[max] = buf;
            }

        }

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

}
