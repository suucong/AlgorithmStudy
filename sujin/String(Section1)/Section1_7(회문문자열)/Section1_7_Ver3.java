package Section1_7;

import java.util.Scanner;

public class Section1_7_Ver3 {
	
	public String solution(String str) {
		String answer="NO";
		String tmp=new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer="YES";
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Section1_7_Ver3 main = new Section1_7_Ver3();
		String str = scanner.next();
		
		System.out.println(main.solution(str));

	}

}
