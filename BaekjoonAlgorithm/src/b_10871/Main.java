package b_10871;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, X;
		N = sc.nextInt();
		X = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<arr.length; i++) {
			if (X > arr[i]) {
				System.out.print(arr[i]+" ");
			}
		}
		
		sc.close();
	}

}
