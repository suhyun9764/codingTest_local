package BAEKJOON.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_7568 {
    private static int N;
    private static Person[] persons;
    private static int[] answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        answer = new int[N];
        persons = new Person[N];

        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            Person person = new Person(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
            persons[i] = person;
            answer[i] = 1;
        }

        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(persons[i].weight>persons[j].weight
                        &&persons[i].height>persons[j].height){
                    answer[j]+=1;
                }

                if(persons[i].weight<persons[j].weight
                        &&persons[i].height<persons[j].height){
                    answer[i]+=1;
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.printf(answer[i]+" ");
        }
    }

    static class Person{
        int weight;
        int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }
}
