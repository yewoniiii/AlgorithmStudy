package b_9086;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] arr = new String[T];
		
		for (int i=0; i<T; i++) {
			String s = sc.next();
			StringBuilder sb = new StringBuilder();
			sb.append(s.charAt(0));
			sb.append(s.charAt(s.length()-1));
			
			arr[i] = sb.toString();
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
