package b_9372;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] result = new int[T];
		
		for (int i=0; i<T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			for (int j=0; j<M; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
			}
			result[i] = N-1;
		}
		
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
			
		
		sc.close();
	}

}
