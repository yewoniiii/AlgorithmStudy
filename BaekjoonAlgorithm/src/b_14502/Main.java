package b_14502;

import java.util.*;
import java.io.*;
public class Main {
	
	static int N, M, max;
	static int[][] arr;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// dfs로 배열을 돌면서 벽 3개씩 세워보기
		dfs(0);
		// 안전 구역 최댓값 출력
		System.out.println(max);
	}

	private static void dfs(int x) {
		// 벽이 3칸(x==3)이면 bfs로 바이러스 퍼뜨리기 
		if (x==3) {
			int cnt = bfs();
			max = Math.max(max,cnt);
			return;
		}
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				if (arr[i][j] == 0) {
					arr[i][j] = 1;
					dfs(x+1);
					arr[i][j] = 0;
				}
			}
		}
	}
	private static int bfs() {
		Queue<int[]> q = new LinkedList<>();
		visited = new boolean[N][M];
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				if (arr[i][j]==2) {
					visited[i][j] = true;
					q.add(new int[] {i,j});
				}
			}
		}
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		while (!q.isEmpty()) {
			int[] now = q.poll();
			for (int i=0; i<4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
					continue;
				}
				if (!visited[nx][ny] && arr[nx][ny]==0) {
					visited[nx][ny] = true;
					q.add(new int[] {nx, ny});
				}
			}
		}
		int cnt = 0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				if (!visited[i][j] && arr[i][j]==0) {
					cnt++;
				}
			}
		}
		return cnt;
		
	}

}
