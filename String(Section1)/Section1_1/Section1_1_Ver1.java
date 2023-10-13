package Section1_1;

import java.util.Scanner;

public class Section1_1_Ver1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine().toUpperCase();
		String input2 = scanner.nextLine().toUpperCase();

		int num = 0;

		for(int i = 0; i < input1.length(); i++) {
			if (input1.charAt(i) == input2.charAt(0))
				num++;
		}

		System.out.println(num);

		scanner.close();

	}
}
