package Section1_3;

import java.util.Scanner;

public class Section1_3_Ver2 {
	
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE;
		
		String[] stringArray = str.split(" ");
	
		for (String x : stringArray) {
			int len = x.length();
			if(len > m) {
				m = len;
				answer=x;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Section1_3_Ver2 ver2 = new Section1_3_Ver2();
		
		String str = scanner.nextLine();
		
		System.out.println(ver2.solution(str));
		scanner.close();
		
	}
}
