package b_2566;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		
		for (int i=0; i<arr.length; i++) {
			String[] line = br.readLine().split(" ");
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(line[j]);
			}
		}
		int max = 0;
		int idx_r=0;
		int idx_c=0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					idx_r = i+1;
					idx_c = j+1;
					continue;
				}
			}
		}
		if (max==0) {
			idx_r = 1;
			idx_c = 1;
		}
		
		System.out.println(max);
		System.out.print(idx_r+" "+idx_c);
	}
}
