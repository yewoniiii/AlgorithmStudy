package b_5597;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer[] arr = new Integer[30];
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for (int i=0; i<28; i++) {
			int stu = sc.nextInt();
			for (int j=0; j<arr.length; j++) {
				if (arr[j]==stu) {
					arr[j] = 0;
				}
			}
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(Math.min(arr[0],arr[1]));
		System.out.println(Math.max(arr[0],arr[1]));
		
		sc.close();
	}

}