package Section1_3;

import java.util.Scanner;

public class Section1_3_MyVer {
	
	public String solution(String str) {
		String[] stringArray = str.split(" ");
		String answer = stringArray[0];
	
		for (int i = 1; i < stringArray.length; i++) {
			if(answer.length() < stringArray[i].length()) answer = stringArray[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Section1_3_MyVer myVer = new Section1_3_MyVer();
		
		String str = scanner.nextLine();
		
		System.out.println(myVer.solution(str));
		scanner.close();
		
	}
}
