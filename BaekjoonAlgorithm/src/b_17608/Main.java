package b_17608;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 막대기의 개수 
		Stack<Integer> st = new Stack<>();
		
		for (int i=0; i<N; i++) {
			st.push(sc.nextInt());
		}
		int last = st.pop();
		int cnt = 1;
		while (!st.isEmpty()) {
			int tmp = st.pop();
			if (tmp > last) {
				last = tmp;
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
