package b_25206;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double sum = 0; // 학점 총합 
		double grade_score = 0; // 학점 x 과목평점 합 
		
		for (int i=0; i<20; i++) {
			String line = br.readLine();
			String[] parts = line.split(" ");
			String name = parts[0];
			double score = Double.parseDouble(parts[1]);
			String grade = parts[2];
			
			switch (grade) {
            case "A+":
                grade_score += 4.5 * score;
                sum += score;
                break;
            case "A0":
                grade_score += 4.0 * score;
                sum += score;
                break;
            case "B+":
                grade_score += 3.5 * score;
                sum += score;
                break;
            case "B0":
                grade_score += 3.0 * score;
                sum += score;
                break;
            case "C+":
                grade_score += 2.5 * score;
                sum += score;
                break;
            case "C0":
                grade_score += 2.0 * score;
                sum += score;
                break;
            case "D+":
                grade_score += 1.5 * score;
                sum += score;
                break;
            case "D0":
                grade_score += 1.0 * score;
                sum += score;
                break;
            case "F":
                grade_score += 0 * score;
                sum += score;
                break;
            default:
                break;
        }
    }

    // 총 평점을 계산하여 출력
    if (sum == 0) {
        System.out.println(0.0);
    } else {
        double average = grade_score / sum;
        System.out.printf("%.6f%n", average);
    }
	}

}
