package b_10811;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();  
		
		int[] arr = new int[N];
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1; // 왼쪽부터 1,2,3,4,5
		}
		
		for (int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			// 구간 [a,b] 순서 뒤집기
			while (a<b) {
				int tmp = arr[a-1];
				arr[a-1] = arr[b-1];
				arr[b-1] = tmp;
				a++;
				b--;
			}
		}
	
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}

}