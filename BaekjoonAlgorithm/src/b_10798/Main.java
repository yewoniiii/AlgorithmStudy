package b_10798;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] ch = new char[15][5];
		
		for (int i=0; i<5; i++) {
			String s = sc.next();
			for (int j=0; j<s.length(); j++) {
				ch[j][i] = s.charAt(j);
			}
		}
		
		for (int i=0; i<15; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(ch[i][j]);
			}
		}
		
		sc.close();
	}
}


//		
//		for (int i = 0; i < 5; i++) {
//            Arrays.fill(ch[i], '\0');
//        }
//		
//		for (int i=0; i<5; i++) {
//			String s = sc.next();
//			for (int j=0; j<s.length(); j++) {
//				ch[j][i] = s.charAt(j);
//			}
//		}
//		for (int i=0; i<15; i++) {
//			for (int j=0; j<5; j++) {
//				if (ch[i][j]!='\0') {
//					System.out.print(ch[i][j]);
//				}
//			}
//		}