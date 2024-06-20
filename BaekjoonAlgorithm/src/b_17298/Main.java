package b_17298;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] A = new int[N];
        int[] NGE = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 3, 5, 2, 7
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                NGE[stack.pop()] = A[i];
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            NGE[stack.pop()] = -1;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(NGE[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
