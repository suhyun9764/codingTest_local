package BAEKJOON.bruteforce;

public class Problem_4673 {
	public static void main(String[] args) {
		Boolean[] arr = new Boolean[10001];

		for(int i=1;i<10001;i++){
			char[] charArray = String.valueOf(i).toCharArray();
			int result = i;
			for(int c = 0;c<charArray.length;c++){
				result+=Integer.parseInt(String.valueOf(charArray[c]));
			}
			if(result<=10000)
				arr[result] = true;
		}

		for(int i=1;i<10001;i++){
			if(arr[i]==null)
				System.out.println(i);
		}
	}
}
