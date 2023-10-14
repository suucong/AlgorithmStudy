package Section1_2;

import java.util.Scanner;

public class Section1_2_Ver2 {
	
	public String solution(String str) {
		
		String answer="";
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);
		}
			
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Section1_2_Ver2 myVer = new Section1_2_Ver2();
		
		String str = scanner.nextLine();
		
		System.out.println(myVer.solution(str));
		scanner.close();
		
	}

}
