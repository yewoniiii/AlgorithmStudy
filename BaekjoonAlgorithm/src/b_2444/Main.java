package b_2444;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String emp = " ";
		String star = "*";
		
		for (int i=1; i<=N; i++) {
			System.out.println(emp.repeat(N-i)+star.repeat(2*i-1)+emp.repeat(N-i));
		}
		
		for (int i=N+1; i<2*N; i++) {
			int tmp = 0;
			tmp = 2*N - i;
			System.out.println(emp.repeat(N-tmp)+star.repeat(2*tmp-1)+emp.repeat(N-tmp));
		}
	
		sc.close();
	}

}
