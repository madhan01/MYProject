package come.test;

import java.util.Scanner;

public class StringTest {
	public static void addGiveInteger() {
		Scanner input = new Scanner(System.in);
		int output = 0;
		System.out.println("Enter number to add");
		while (input.hasNextInt()) {
			int givenNumber = input.nextInt();
			output = givenNumber + output;
			System.out.println("Output is :" + output);
		}
	}

	public static void starPattern(int num) {
		for (int i = 0; i <= num; i++) {

			for (int j = i; j <= num - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void percentage(int house) {
		if (house >= 3) {
			double dHouse = 2.0;
			double pchance = dHouse / house;
			System.out.println("prnt divi   " + Math.round(pchance*100));
		}
	}

	public static void main(String[] args) {
		// addGiveInteger();
		// starPattern(5);
		percentage(2);
	}

}
