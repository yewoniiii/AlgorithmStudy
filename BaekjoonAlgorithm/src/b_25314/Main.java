package b_25314;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// repeat 함수 사용
//		String s = "long ";
//		System.out.println(s.repeat(N/4)+"int");
		
		String s = "";
		for (int i=1; i<=N/4; i++) {
			s += "long ";
		}
		
		System.out.println(s+"int");
		sc.close();
	}

}