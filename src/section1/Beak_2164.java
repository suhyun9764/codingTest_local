package section1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Beak_2164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            queue.add(i);
        }

        while(queue.size()>1){
            queue.poll();
            int s = queue.poll();
            queue.add(s);
        }


        System.out.println(queue.poll());
    }

}
