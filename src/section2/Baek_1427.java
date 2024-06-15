package section2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baek_1427 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        Character[] array = new Character[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            char buf = 0;
            int bufI = 0;
            for (int j = i; j < arr.length; j++) {
                if (buf < arr[j]) {
                    buf = arr[j];
                    bufI = j;
                }
            }
            arr[bufI] = arr[i];
            arr[i] = buf;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
