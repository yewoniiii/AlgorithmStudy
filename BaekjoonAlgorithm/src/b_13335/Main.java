package b_13335;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int w = sc.nextInt();
		int L = sc.nextInt();
		
		Queue<Integer> truck = new LinkedList<>();
		for (int i=0; i<n; i++) {
			truck.offer(sc.nextInt()); // 트럭 무게 입력 받기
		}
		
		Queue<Integer> bridge = new LinkedList<>();
		int ans = 0;
		int weight = 0;
		
		for (int i=0; i<w; i++) {
			bridge.add(0);
		}
		
		while (!bridge.isEmpty()) {
			weight -= bridge.poll();
			ans++;
			if (!truck.isEmpty()) {
				if (truck.peek()+weight <= L) {
					weight = truck.peek()+weight;
					bridge.add(truck.poll());
				} else {
					bridge.add(0);
				}
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
