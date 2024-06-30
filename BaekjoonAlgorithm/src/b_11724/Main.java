package b_11724;

import java.util.*;
public class Main {
	
	static int N, M;
	static int u, v;
	
	static ArrayList<Integer>[] arr;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new ArrayList[N+1]; // 노드별 연결노드 저장
		
		for (int i=0; i<N+1; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		visited = new boolean[N+1]; // 정점별 방문 여부 
		M = sc.nextInt();
		for (int i=0; i<M; i++) { // 간선의 개수 
			u = sc.nextInt();
			v = sc.nextInt();
			arr[u].add(v); // u번 정점에 v번 정점이 연결되어 있음 
			arr[v].add(u);
		}
		int cnt = 0; // dfs 호출 횟수 카운팅 
		for (int i=1; i<=N; i++) {
			if (!visited[i]) {
				cnt++;
				dfs(i);
			}
		}
		System.out.println(cnt);
	}	
	
	public static void dfs(int x) {
		// 현재 노드를 방문 처리 
		visited[x] = true;
		
		// 현재 노드와 연결된 다른 노드를 재귀적으로 방문 
		for (int i=0; i<arr[x].size(); i++) {
			int y = arr[x].get(i);
			if (!visited[y]) dfs(y);
		}
	}

}
