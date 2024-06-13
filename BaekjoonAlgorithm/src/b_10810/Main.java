package b_10810;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i=0; i<N; i++) {
			arr[i] = 0;
		}
		
		for (int x=0; x<M; x++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for (int y=i-1; y<j; y++) {
				arr[y] = k;
			} 
		}
		for (int i=0; i<N; i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}

}