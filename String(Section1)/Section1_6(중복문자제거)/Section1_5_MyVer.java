package Section1_6;

import java.util.Scanner;

public class Section1_5_MyVer {
	
	public String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Section1_5_MyVer main = new Section1_5_MyVer();
		
		String str = scanner.next();
		
		System.out.println(main.solution(str));
	}

}
