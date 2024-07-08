package b_4179;

import java.util.*;
import java.io.*;
public class Main {
	
	static int R, C, time;
	static boolean[][] visited;
	static char[][] maze;
	static int[][] fire;
	static int road = 0; // . 칸 개수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken()); // 행 개수
		C = Integer.parseInt(st.nextToken()); // 열 개수
		maze = new char[R][C];
		fire = new int[R][C];
		time = 0; // 미로 탈출 시간
		
		for (int i=0; i<R; i++) {
			st = new StringTokenizer(br.readLine());
			String tmp = st.nextToken();
			for (int j=0; j<tmp.length(); j++) {
				maze[i][j] = tmp.charAt(j);
				if (maze[i][j] == '.') road++;
				if (maze[i][j] == 'F') fire[i][j] = 0;
				else if (maze[i][j] == '#') fire[i][j] = 10001;
				else fire[i][j] = 1001;
			}
		}
		visited = new boolean[R][C];
		// 불이 퍼져 .이 없어질 때까지 bfs 호출
		// 1초 후, 2초 후 불의 위치를 표기
		while (road!=0) {
			time++;
			bfs(time);
			for (int i=0; i<R; i++) {
				for (int j=0; j<C; j++) {
					if (maze[i][j] == '.' && !visited[i][j]) road--;
				}
			}
		}
		for (int i=0; i<R; i++) {
			System.out.println(Arrays.toString(fire[i]));
		}
		
	}

	private static void bfs(int x) {
		Queue<int[]> q = new LinkedList<>();
		for (int i=0; i<R; i++) {
			for (int j=0; j<C; j++) {
				if (maze[i][j]=='F') {
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
				
				if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
					continue;
				}
				if (!visited[nx][ny] && maze[nx][ny]!='#') {
					visited[nx][ny] = true;
					fire[nx][ny] = x;
				}
			}
		}
	}


}
