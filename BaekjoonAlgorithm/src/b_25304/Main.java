package b_25304;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X, N, a, b;
		X = sc.nextInt();
		N = sc.nextInt();
		
		int total = 0;
		
		for (int i=0; i<N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			total += a*b;
		}
		
		if (total == X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}