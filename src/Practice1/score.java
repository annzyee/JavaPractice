package Practice1;

import java.util.*;

public class score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		
		int i = sc.nextInt();
		

		if (i >= 90 && i <= 100) {
			System.out.println("학점: A");
		} else if (i >= 80 && i < 90) {
			System.out.println("학점: B");
		} else if (i >= 70 && i < 80) {
			System.out.println("학점: C");
		} else if (i >= 60 && i < 70) {
			System.out.println("학점: D");
		} else {
			System.out.println("학점: F");
		}
	}
}
