package b_11047;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] coinTypes = new int[N];
		int cnt = 0;
		
		for (int i=0; i<N; i++) {
			coinTypes[i] = sc.nextInt();
		}
		
		for (int i=coinTypes.length-1; i>=0; i--) {
			if (coinTypes[i] > K) {
				continue;
			}
			cnt += K / coinTypes[i];
			K = K % coinTypes[i];
		}
		System.out.println(cnt);
		sc.close();
	}
}
