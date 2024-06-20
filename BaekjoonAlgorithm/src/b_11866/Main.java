package b_11866;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> Josephus = new LinkedList<>();
		
		sc.close();
		if (N==1 && K==1) {
			System.out.print("<"+1+">");
			return;
		}
		
		for (int i=1; i<N+1; i++) {
			q.add(i);
		}
		
		while (!q.isEmpty()) {
			for (int i=0; i<K-1; i++) {
				q.add(q.peek());
				q.poll();
			}
			Josephus.add(q.poll());
		}
		for (int i=0; i<N; i++) {
			if (i==0) {
				System.out.print("<"+Josephus.poll()+",");
			} else if (i==N-1) {
				System.out.print(" "+Josephus.poll()+">");
			} else {
				System.out.print(" "+Josephus.poll()+",");
			}
		}
		
	}
}
