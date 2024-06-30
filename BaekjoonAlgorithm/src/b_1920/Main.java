package b_1920;

import java.util.*;
public class Main {
	
	static int N, M;
	static int[] arr1, arr2, result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr1 = new int[N];
		for (int i=0; i<N; i++) {
			arr1[i] = sc.nextInt();
		}
		
		Arrays.sort(arr1);
		
		M = sc.nextInt();
		arr2 = new int[M]; // arr1에서 찾을 숫자 
		for (int i=0; i<M; i++) {
			arr2[i] = sc.nextInt();
		}
		
		result = new int[M];
		for (int i=0; i<M; i++) {
			if (binSearch(arr1, arr2[i])) {
				result[i] = 1;
			} else {
				result[i] = 0;
			}
		}
		
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		sc.close();
	}

	private static boolean binSearch(int[] arr, int key) {
		int pl = 0;
		int pr = N-1;
		boolean yes = false;
		
		while (pl <= pr) {
			int pc = (pl + pr) / 2;
			if (key == arr[pc]) {
				yes = true;
				break;
			}
			if (key < arr[pc]) {
				pr = pc-1;
			} else {
				pl = pc + 1;
			}
		}
		return yes;
	}

}
