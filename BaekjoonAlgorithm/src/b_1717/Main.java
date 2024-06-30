package b_1717;

import java.util.*;
public class Main {
	
	static int n, m;
	static int[] parent;
	static int[][] calculate;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		parent = new int[n+1];
		calculate = new int[m][3];
		
		// 부모 테이블 상에서 부모를 자기 자신으로 초기화 
		for (int i=1; i<=n; i++) {
			parent[i] = i;
		}
		
		// m개 줄에 입력되는 (0,a,b) or (1,a,b) 배열을 2차원 배열에 저장 
		for (int i=0; i<m; i++) {
			calculate[i][0] = sc.nextInt();
			calculate[i][1] = sc.nextInt();
			calculate[i][2] = sc.nextInt();
		}
		
		for (int i=0; i<m; i++) {
			if (calculate[i][0] == 0) {
				unionParent(calculate[i][1], calculate[i][2]);
			} else {
				if (findParent(calculate[i][1]) == findParent(calculate[i][2])) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
		
		sc.close();
	}

	private static void unionParent(int a, int b) {
		a = findParent(a);
		b = findParent(b);
		if (a < b) parent[b] = a;
		else parent[a] = b;
	}

	private static int findParent(int x) {
		if (x==parent[x]) return x; 
		return parent[x]=findParent(parent[x]);
	}
}
