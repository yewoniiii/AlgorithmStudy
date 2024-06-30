package b_1647;

import java.io.*;
import java.util.*;

class Edge implements Comparable<Edge> {
	private int distance;
	private int nodeA;
	private int nodeB;
	
	public Edge(int distance, int nodeA, int nodeB) {
		this.distance = distance;
		this.nodeA = nodeA;
		this.nodeB = nodeB;
	}
	
	public int getDistance() {
		return this.distance;
	}
	
	public int getNodeA() {
		return this.nodeA;
	}
	
	public int getNodeB() {
		return this.nodeB;
	}
	
	// 거리(비용)가 짧은 것이 높은 우선 순위를 가지도록 설정 
	@Override
	public int compareTo(Edge other) {
		return Integer.compare(this.distance, other.distance);
	}
}
public class Main {
	
	private static int N, M;
	private static int[] parent;
	private static ArrayList<Edge> edges = new ArrayList<>();
	private static int result = 0;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

		
		// 부모 테이블 상에서 부모를 자기 자신으로 초기화 
		parent = new int[N+1];
		for (int i=1; i<=N; i++) {
			parent[i] = i;
		}
		
		// 간선에 대한 정보를 edges에 저장
		for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            edges.add(new Edge(cost, a, b));
        }
		
		// cost(edges[i][0])를 기준으로 정렬
		Collections.sort(edges);
		
		// 최소 신장 트리에 포함되는 간선 중에서 비용이 가장 큰 간선
		int max = 0;
		
		for (Edge edge : edges) {
			int cost = edge.getDistance();
			int a = edge.getNodeA();
			int b = edge.getNodeB();
			// 사이클이 발생하지 않는 경우(서로소 집합일 경우) 집합에 포함
			if (findParent(a) != findParent(b)) {
				unionParent(a,b);
				result += cost;
				max = cost;
			}
		}
		
		System.out.println(result - max);
	}

	private static void unionParent(int a, int b) {
		a = findParent(a);
		b = findParent(b);
		if (a<b) parent[b] = a;
		else parent[a] = b;
	} 

	private static int findParent(int x) {
		if (parent[x]==x) return x;
		return parent[x] = findParent(parent[x]);
	}

}
