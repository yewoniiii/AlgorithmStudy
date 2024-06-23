package b_1759;

import java.io.*;
import java.util.*;

public class Main {
	
	private static int L, C;
	private static char[] arr;
	private static char[] code;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		code = new char[L];
		arr = new char[C];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<C; i++) {
			arr[i] = st.nextToken().charAt(0);
		}
		
		// [a, c, i, s, t, w]
		Arrays.sort(arr);

		combination(0,0);
	}
	
	private static void combination(int start, int tmp) {
		if (tmp==L) {
			if (conditionT(code)) {
				System.out.println(new String(code));
			}
			
			return;
		}
		for (int i=start; i<C; i++) {
			code[tmp] = arr[i];
			combination(i+1, tmp+1);
			}
		}


	private static boolean conditionT(char[] code) {
		int moeum = 0;
		int jaeum = 0;
		for (char c : code) {
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				moeum++;
			} else jaeum++;
		}
		
		if (moeum>=1 && jaeum>=2) return true;
		else return false;
	}
	
}
