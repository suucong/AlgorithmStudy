package Section1_9;

import java.util.Scanner;

public class Section1_9_MyVer {
	public String solution(String str) {
		int n = 0;
		str = str.replaceAll("[^0-9]", "");
		n = Integer.parseInt(str);
		if(n == 0)	return "";
		else return String.valueOf(n);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Section1_9_MyVer T = new Section1_9_MyVer();
		String str = scanner.nextLine();
		System.out.println(T.solution(str));
	}
}
