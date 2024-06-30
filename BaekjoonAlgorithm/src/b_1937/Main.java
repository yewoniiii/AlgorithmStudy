package b_1937;

import java.util.*;
import java.io.*;
public class Main {

	private static int n;
	private static int[][] map;
	private static boolean[][] visited;
	private static int[] dx = {-1, 1, 0, 0}; // 상하 이동
	private static int[] dy = {0, 0, -1, 1}; // 좌우 이동 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 대나무 숲의 크기 (1<=n<=500)
		n = Integer.parseInt(br.readLine());
		
		
		int[][] map = new int[n][n];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		visited = new boolean[n][n];
		// 처음 위치 정하는 걸 몬하겟음 ㅠ 
		
		
		
		
	}

}
