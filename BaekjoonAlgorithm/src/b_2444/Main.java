package b_2444;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String emp = " ";
		String star = "*";
		
		
		
		for (int i=1; i<=N; i++) {
			System.out.println(emp.repeat(N-i)+star.repeat(2*i-1));
		}
		
		for (int i = N - 1; i >= 1; i--) {
            System.out.println(emp.repeat(N - i) + star.repeat(2 * i - 1));
        }
	
		sc.close();
	}

}
