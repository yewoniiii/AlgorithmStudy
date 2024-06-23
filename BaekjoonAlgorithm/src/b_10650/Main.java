package b_10650;

import java.util.*;
public class Main {
	
	private static int N, M;
	private static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		
		combination(0,1);
		
		sc.close();
	}
	
	private static void combination(int cnt, int start) {
		if (cnt==M) {
			for (int i=0; i<M; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for (int i=start; i<=N; i++) {
			arr[cnt] = i;
			combination(cnt+1, i+1);
			
		}
	}

}
