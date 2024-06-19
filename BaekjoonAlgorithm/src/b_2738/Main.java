package b_2738;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				B[i][j] = sc.nextInt() + A[i][j];
			}
		}
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
