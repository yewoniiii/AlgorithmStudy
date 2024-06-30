package b_2606;

import java.util.*;
public class Main {

	static int n, m, u, v;
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // 컴퓨터의 개수 
		m = sc.nextInt(); // 간선의 개수
		
		visited = new boolean[n+1];
		arr = new ArrayList[n+1];
		for (int i=0; i<=n; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for (int i=0; i<m; i++) {
			u = sc.nextInt();
			v = sc.nextInt();
			arr[u].add(v);
			arr[v].add(u);
		}
		
		dfs(1);
		int cnt = 0;
		for (int i=0; i<visited.length; i++) {
			if (visited[i]) {
				cnt++;
			}
		}
		System.out.println(cnt-1); // 1번 컴퓨터는 카운팅에서 제외 
		
		sc.close();
	}

	private static void dfs(int x) {
		if (visited[x]) {
			return;
		}
		visited[x] = true;
		for (int i=0; i<arr[x].size(); i++) {
			int y = arr[x].get(i);
			if (!visited[y]) dfs(y);
		}
	}
}
