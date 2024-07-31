package choosingDice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	static int[][] dice = {{1,2,3,4,5,6},{3,3,3,3,4,4},{1,3,3,4,4,4},{1,1,4,4,5,5}};
	static int[] arr;
	static int[][] AChoice, BChoice;
	static int idx = 0;
	static int n;
	static int[][] ADices, BDices;
	static ArrayList<Integer> A_hap, B_hap;
	
	public static void main(String[] args) {
		n = dice.length; // dice의 길이 (2 or 4 or 6 ..)
		
		// A,BDice 배열 크기 지정을 위한 combi 메서드 실행
		arr = new int[n/2]; // 조합 메서드 실행을 위한 임시 배열 생성
		Combi(0,1);
		AChoice = new int[idx][n/2];
		BChoice = new int[idx][n/2];
		
		// A가 주사위를 선택하는 모든 경우의 수를 ADice 배열에 저장
		// A가 선택하고 남은 주사위를 BDice 배열에 저장
		idx = 0; // combination 메서드 실행을 위해 0으로 초기화
		Combination(0,1);
		
		// A와 B가 가진 주사위에서 나올 수 있는 모든 합을 arraylist에 저장
		int max = 0;
		int ans = 0;
		
		for (int i=0; i<AChoice.length; i++) {
			ADices = new int[n/2][6];
			ADices = returnArr(AChoice[i],0,0);
			
			BDices = new int[n/2][6];
			BDices = returnArr(BChoice[i],0,0);
			
			A_hap = new ArrayList<>();		
			B_hap = new ArrayList<>();
			
			calculateSums(ADices,0,0, A_hap);
			calculateSums(BDices,0,0, B_hap);
			int win = 0;
			Collections.sort(A_hap);
			Collections.sort(B_hap);
			
			for (int j=0; j<A_hap.size(); j++) {
				int a = A_hap.get(j);
				int start = 0;
				int end = B_hap.size()-1;
				while (start < end) {
					int mid = (start + end) / 2;
					if (B_hap.get(mid) < a) {
						start = mid + 1;
					} else {
						end = mid;
					}
				}
				win += start;
			}
			
			
//			
//			for (int j=0; j<A_hap.size(); j++) {
//				int temp = A_hap.get(j);
//				for (int k=0; k<B_hap.size(); k++) {
//					if (temp > B_hap.get(k)) {
//						win++;
//					}
//				}
//			}
			if (win > max) {
				max = win;
				ans = i;
			}
		}
//		for (int[] a : ADices) {
//			System.out.println(Arrays.toString(a));
//		}
		System.out.println(Arrays.toString(AChoice[ans]));
//		System.out.println(A_hap);
//		System.out.println();
//		System.out.println(B_hap);
	}
	private static void calculateSums(int[][] dices, int cnt, int currSum, ArrayList<Integer> hap) {
		if (cnt==dices.length) {
			hap.add(currSum);
			return;
		}
		for (int i=0; i<dices[cnt].length; i++) {
			calculateSums(dices, cnt+1, currSum+dices[cnt][i], hap);
		}
	}
	private static int[][] returnArr(int[] chosen, int cnt, int tmpSum) {
		int[][] result = new int[n/2][6];
		for (int i=0; i<chosen.length; i++) {
			for (int j=0; j<6; j++) {
				result[i][j] = dice[chosen[i]-1][j];
			}
		}
		return result;
	}
	/** Dice 배열 크기 지정 */
	public static void Combi(int cnt, int start) {
		if (cnt==n/2) {
			idx++;
			return;
		}
		for (int i=start; i<=n; i++) {
			arr[cnt] = i;
			Combi(cnt+1, i+1);
		}
	}
	/** ADice, BDice에 조합 배열 삽입 */
	public static void Combination(int cnt, int start) {
		if (cnt==n/2) {
			for (int i=0; i<arr.length; i++) {
				AChoice[idx][i] = arr[i];
			}
			
			for (int a : arr) {
				int bidx = 0;
				for (int i=1; i<=n; i++) {
					if (!contains(arr,i)) {
						BChoice[idx][bidx++] = i;
					}
				}
			}
			idx++;
			return;
		}
		for (int i=start; i<=n; i++) {
			arr[cnt] = i;
			Combination(cnt+1, i+1);
		}
	}
	private static boolean contains(int[] arr, int x) {
		for (int a : arr) {
			if (a == x) {
				return true;
			}
		}
		return false;
	}
}
