package Practice1;

import java.util.*;

public class ConvTemp {

	public static void main(String[] args) {

		float CelTemp = 0;
		float FahTemp = 0;
		System.out.print("¼·¾¾: ");

		Scanner sc = new Scanner(System.in);
		CelTemp = sc.nextFloat();

		FahTemp = 5 / 9 * (float) (CelTemp * 1.8) + 32;

		System.out.println("È­¾¾: " + FahTemp);
	}

}
