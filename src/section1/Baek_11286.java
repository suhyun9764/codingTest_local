package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baek_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->{
           int firstNum = Math.abs(o1);
           int secNum = Math.abs(o2);
           if(firstNum==secNum){
               return o1>o2?1:-1;
           }
            return firstNum-secNum;
        });

        for(int i=0;i<n;i++){
            int request  = Integer.parseInt(br.readLine());
            if(request==0){
                if(queue.isEmpty()){
                    System.out.println("0");
                }else {
                    System.out.println(queue.poll());
                }
                }
            else {
                queue.add(request);
            }
        }
    }
}
