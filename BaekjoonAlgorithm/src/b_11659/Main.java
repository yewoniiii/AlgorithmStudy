package b_11659;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 수의 개수
		int M = sc.nextInt(); // 합을 구해야 하는 횟수 
		int[] arr = new int[N];
		int[] sum = new int[N];
		int[] result = new int[M];
		
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			if (i==0) {
				sum[i] = arr[i];
			} else {
				sum[i] = sum[i-1] + arr[i];
			}
		}
		
		for (int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a==1) {
				result[i] = sum[b-1];
			} else {
			result[i] = sum[b-1] - sum[a-2];
			}
		}
		
		for (int i=0; i<M; i++) {
			System.out.println(result[i]);
		}
		
		sc.close();
	}

}