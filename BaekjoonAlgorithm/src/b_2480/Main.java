package b_2480;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a==b && b==c) {
			System.out.println(10000+a*1000);
		} else if ((a==b && a!=c) || (a==c && a!=b)) {
			System.out.println(1000+a*100);
		} else if (b==c && a!=b) {
			System.out.println(1000+b*100);
		} else {
			if (a>b && a>c) {
				System.out.println(a*100);
			} else if (b>c && b>a) {
				System.out.println(b*100);
			} else {
				System.out.println(c*100);
			}
		}
		sc.close();
	}

}