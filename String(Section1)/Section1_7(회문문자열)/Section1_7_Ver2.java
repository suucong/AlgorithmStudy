package Section1_7;

import java.util.Scanner;

public class Section1_7_Ver2 {
	
	public String solution(String str) {
		String answer="YES";
		str=str.toUpperCase();
		int len=str.length();
		for(int i=0; i<len/2; i++){
			if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Section1_7_Ver2 main = new Section1_7_Ver2();
		String str = scanner.next();
		
		System.out.println(main.solution(str));
	}

}
