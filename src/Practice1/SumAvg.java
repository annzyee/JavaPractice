package Practice1;

import java.util.*;

public class SumAvg {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.;
		int[] score = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.print("점수: ");

		for (int i = 0; i < 10; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		avg = (double) sum / score.length;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}
}
