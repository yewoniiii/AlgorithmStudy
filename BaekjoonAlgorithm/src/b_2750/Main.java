package b_2750;

import java.util.*;
public class Main {

	static void swap(int[] arr, int idx1, int idx2) {
		int t = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = t;
	}
	
	static void bubbleSort(int[] arr, int n) {
		for (int i=0; i<n-1; i++) {
			for (int j=n-1; j>i; j--) {
				if (arr[j-1] > arr[j]) {
					swap(arr, j-1, j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		bubbleSort(arr, N);
		
		for (int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}
