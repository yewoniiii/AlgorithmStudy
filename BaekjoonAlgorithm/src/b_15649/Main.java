package b_15649;

import java.util.*;
import java.io.*;
public class Main {

	static int[] arr;
	static boolean[] visited;
	static int N, M;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); // 3
		M = sc.nextInt(); // 1
		arr = new int[M];
		visited = new boolean[N+1];
		permutation(0);
		
		sc.close();
	}
	
	static void permutation(int cnt) {
		if (cnt==M) {
			for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
		}
		for (int i=1; i<=N; i++) {
			if (visited[i]==false) {
				visited[i] = true;
				arr[cnt]=i;
				permutation(cnt+1);
				visited[i] = false;
			}
		}
	}

}
