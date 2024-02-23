package Section1_5;

import java.util.Scanner;

public class Section1_5_Ver2 {
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = s.length;
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}
	
	
	public static void main(String[] args) {
		Section1_5_Ver2 main = new Section1_5_Ver2();
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		System.out.println(main.solution(str));
	}

}
