package etc;

import java.util.Arrays;

public class forK {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr ={1,5,2,6,3,7,4};
        int[][] commands ={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = solution.solution(arr, commands);
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int[] buf =new int[3];
            for(int j=0;j<3;j++){
                buf[j] = commands[i][j];
            }
            int[] spectrumArr = new int[buf[1]-buf[0]+1];
            int num =0;
            for(int t=buf[0];t<buf[1]+1;t++){
                spectrumArr[num] = array[t-1];
                num++;
            }
            Arrays.sort(spectrumArr);
            answer[i]=spectrumArr[buf[2]-1];
        }
        return answer;
    }
}