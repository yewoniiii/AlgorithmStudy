package b_10813;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[] arr = new int[N];
		for (int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		for (int x=0; x<M; x++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int cnt = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = cnt;
		}
		for (int i=0; i<N; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}