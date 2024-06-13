package b_3003;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] chess = {1,1,2,2,2,8};
		int[] have = new int[6];
		
		for (int i=0; i<chess.length; i++) {
			have[i] = sc.nextInt();
		}
		
		for (int i=0; i<chess.length; i++) {
			if (chess[i]==have[i]) {
				have[i] = 0;
			} else {
				have[i] = chess[i] - have[i];
			}
			System.out.print(have[i]+" ");
		}
	
		
		sc.close();
	}

}
