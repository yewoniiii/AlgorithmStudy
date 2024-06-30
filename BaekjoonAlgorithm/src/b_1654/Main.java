package b_1654;

import java.io.*;
import java.util.*;
public class Main {
	
	static int K, N;
	static int[] arr, idx;
	static int from, to;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		K = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		arr = new int[K];
		
		long max = 0;
		for (int i=0; i<K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] > max) {
				max = arr[i]; // 입력된 값 중 가장 큰 값을 max에 저장
			}
		}
		long pl = 1;
		long pr = max;
		long result = 0;
		
		while (pl <= pr) {
			long pc = (pl + pr) / 2;
			int cnt = 0;
			
			for (int i=0; i<K; i++) {
				cnt += arr[i] / pc; 
			}
			if (cnt >= N) { // N = 11
				pl = pc + 1;
				result = pc;
			} else {
				pr = pc - 1;
			}
		}
		System.out.println(result);
	}
}
