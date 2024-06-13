package b_10807;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==v) {
				sum+=1;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}