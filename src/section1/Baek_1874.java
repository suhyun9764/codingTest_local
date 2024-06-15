package section1;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Baek_1874 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int num=1;
        boolean check = true;
        StringBuffer sb = new StringBuffer();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            int s = arr[i];
            if(num<=s){
                while(num<=s){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else{
                int s2 = stack.pop();
                if(s2>s){
                    check = false;
                    break;
                }
                    sb.append("-\n");
            }

        }
        if(check){
            System.out.println(sb.toString());
        }else{
            System.out.println("NO\n");
        }
    }

}
