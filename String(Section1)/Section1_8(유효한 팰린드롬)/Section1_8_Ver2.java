package Section1_8;

import java.util.Scanner;

public class Section1_8_Ver2 {
	public String solution(String s){
		String answer="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp=new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer="YES";
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Section1_8_Ver2 T = new Section1_8_Ver2();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution(str));
	}
}
