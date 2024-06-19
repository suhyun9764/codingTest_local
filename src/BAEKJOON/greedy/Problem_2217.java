package BAEKJOON.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_2217 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int maxWeight = 0;
		for (int i = 0; i < n; i++) {
			int currentWeight = arr[i] * (n - i);
			if (maxWeight < currentWeight)
				maxWeight = currentWeight;
		}

		System.out.println(maxWeight);

	}
}
