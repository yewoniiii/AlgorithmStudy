package b_2563;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 색종이의 수
		boolean[][] paper = new boolean[100][100];
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt(); // 시작점 x좌표
			int y = sc.nextInt(); // 시작점 y좌표
			for (int j=y-1; j<y+9; j++) {
				for (int k=x-1; k<x+9; k++) {
					paper[j][k] = true;
				}
			}
		}
		int black = 0;
		for (int i=0; i<paper.length; i++) {
			for (int j=0; j<paper[i].length; j++) {
				if (paper[i][j]) black++;
			}
		}
		System.out.println(black);
		sc.close();
	}

}
