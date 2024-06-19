package s_1210;

import java.io.*;
import java.util.*;
public class Main {
	
	
	static int[][] map;
	static int N=100, arriveX, arriveY, answer;
	
	static int[] dx = {0,0,-1}; // x : 행 이동. 위로만 이동 가능  
	static int[] dy = {-1,1,0}; // y : 열 이동. 좌/우로 이동 가능 

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.setIn(new FileInputStream("input_1210.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 고속 문자열 결합기 
		StringTokenizer st;
		
		for (int tc=0; tc<10; tc++) {
			int t = Integer.parseInt(br.readLine());
			
			map = new int[N][N];
			for (int i=0; i<N; i++) {
				// StringTokenizer : 공백을 기준으로 글자를 나눔 
				st = new StringTokenizer(br.readLine());
				for (int j=0; j<N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if (map[i][j] == 2) { // 도착지점(2)를 저장
						arriveX = i;
						arriveY = j;
					}
				}
			}
			
			move(arriveX, arriveY); // 도착지에서 출발지로 역으로 검색 시작 
			sb.append("#"+t+" "+answer+"\n");
		}
		System.out.println(sb.toString());
	}
	
	public static void move(int x, int y) {
		
		// x<-arriveX(99), y<-arriveY(ex. 13)
		while (true) { // 무한 반복. 몇 번만에 도착할 지 모르기 때문에 
			if (x==0) { // 행 번호가 0에 이르면 도착한 것으로 판단 
				answer = y; // 도착했을 때 y값이 행 번호. 
				break; // 무한 반복 종료 
			}
			
			// x!=0 이면 아래 코드 실행  
			
//			static int[] dx = {0,0,-1}; // x : 행 이동. 위로만 이동 가능  
//			static int[] dy = {-1,1,0}; // y : 열 이동. 좌/우로 이동 가능 
			for (int i=0; i<3; i++) {
				// nx = 98+0 (좌, 우로 움직일 때는 위아래 행 변화 없음 
				int nx = x+dx[i]; // nextX : 다음으로 이동할 x값 
				int ny = y+dy[i]; // nextY : 다음으로 이동할 y값 
				
				if (range(nx,ny) && map[nx][ny]==1) {
					map[x][y] = 3; // 현재 위치를 3으로 설정 (지나간 길 표시할 용도)
					x = nx; y= ny; // 다음으로 갈 좌표를 현재 좌표로 지정 
				}
			}
		}
	}
	
	public static boolean range(int x, int y) {
		return x>=0 && x<N && y>=0 && y<N;
	}

}
