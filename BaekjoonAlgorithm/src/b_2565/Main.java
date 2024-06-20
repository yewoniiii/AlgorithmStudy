package b_2565;

import java.io.*;
import java.util.*;
public class Main {
	static int result = 0;
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		int[] dp = new int[n];
		
		StringTokenizer st;
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(st.nextToken()); // A 기준 위치 
			arr[i][1] = Integer.parseInt(st.nextToken()); // B 기준 위치 
		}
		
		// A 기준 오름차순 정렬 
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) { // compare : 두 개의 1차원 배열을 넘겨 받음 -> 배열 내 요소 간 크기 비교
				return o1[0] - o2[0]; // 종료 시각 기준 오름차순 정렬
			}
		});
		
		for (int i=0; i<n; i++) {
			
		}
	
		
	}

}
