package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Baek_12891 {
    private static int[] myArr;
    private static int check = 0;
    private static int[] checkArr;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        char[] Arr = bf.readLine().toCharArray();
        myArr = new int[4];
        checkArr = new int[4];
        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<4;i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i]==0)
                check++;
        }

        int result = 0;

        for(int i=0;i<p;i++){
            add(Arr[i]);
        }

        if(check==4)
            result++;

        for(int end=p;end<s;end++){
            int start = end-p;
            del(Arr[start]);
            add(Arr[end]);
            if(check==4)
                result++;
        }
        System.out.println(result);
    }

    private static void del(char c) {
        switch (c) {
            case 'A':
                if (checkArr[0] == myArr[0])
                    check--;
                myArr[0]--;
                break;
            case 'C':

                if (checkArr[1] == myArr[1])
                    check--;
                myArr[1]--;
                break;
            case 'G':
                if (checkArr[2] == myArr[2])
                    check--;
                myArr[2]--;
                break;
            case 'T':

                if (checkArr[3] == myArr[3])
                    check--;
                myArr[3]--;
                break;
        }
    }

    private static void add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (checkArr[0] == myArr[0])
                    check++;
                break;
            case 'C':
                myArr[1]++;
                if (checkArr[1] == myArr[1])
                    check++;
                break;
            case 'G':
                myArr[2]++;
                if (checkArr[2] == myArr[2])
                    check++;
                break;
            case 'T':
                myArr[3]++;
                if (checkArr[3] == myArr[3])
                    check++;
                break;
        }
    }
}
