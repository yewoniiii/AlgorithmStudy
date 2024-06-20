package b_10988;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ans = true;
		
		for (int i=0; i<s.length()/2; i++) {
			if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
				ans = false;
			} 
		}
		
		if (ans) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		sc.close();
	}

}
