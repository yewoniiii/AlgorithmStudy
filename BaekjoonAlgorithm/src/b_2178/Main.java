package b_2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main {
	
	static int[][] map;
	static int N;
	static int M;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 }; //x방향배열-상하
    static int[] dy = { 0, 0, -1, 1 }; //y방향배열-좌우
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			for(int j=0; j<M; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		visited = new boolean[N][M];
		visited[0][0] = true;
		bfs(0, 0);
		System.out.println(map[N-1][M-1]);
	}
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		
		while(!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0; i<4; i++) { // 상하좌우 순으로 다음 좌표 접근 
				int nextX = nowX + dx[i]; // 이동할 다음 x 좌표 
				int nextY = nowY + dy[i]; // 이동할 다음 y 좌표 
				
						// 이동 방향의 다음 좌표가 영역을 벗어나면 다른 방향을 적용 
		                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                		    continue;
		                
		                // 다음 좌표가 영역 이내라도 0이 있는 곳이면 다른 방향을 적용 
        		        if (visited[nextX][nextY] || map[nextX][nextY] == 0)
                    		continue;
        		        
        		        // 다음 좌표가 영역 이내이고 0이 아닌 곳
        		        // 이동할 좌표로 큐에 등록 
		                q.add(new int[] {nextX, nextY});
		                
		                // 이동 횟수를 맵에 저장 
        		        map[nextX][nextY] = map[nowX][nowY] + 1;
        		        
        		        // 방문 표시 
                		visited[nextX][nextY] = true;
			}
		}
	}
}