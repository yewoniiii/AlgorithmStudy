package b_1427;

import java.util.*;
public class Main {

	static void swap(int[] arr, int idx1, int idx2) {
		int t = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = t;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] arr = new int[s.length()];
		
		for (int i=0; i<s.length(); i++) {
			arr[i] = Character.getNumericValue(s.charAt(i));
		}
		
		for (int i=0; i<arr.length-1; i++) {
			int max = i;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			swap(arr, i, max);
		}
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		sc.close();
	}

}
