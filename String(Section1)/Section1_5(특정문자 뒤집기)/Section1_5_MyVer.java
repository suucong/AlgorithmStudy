package Section1_5;

import java.util.Scanner;

public class Section1_5_MyVer {
	
	String solution(String str) {
		char[] c = str.toCharArray();
		int lt = 0, rt = c.length-1;
		
		while(lt < rt) {
			if(!Character.isLetter(c[lt])) lt++;
			if(!Character.isLetter(c[rt])) rt--;
			if(Character.isLetter(c[lt]) && Character.isLetter(c[rt])) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
		}
		
		return String.valueOf(c);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Section1_5_MyVer main = new Section1_5_MyVer();
		String str = scanner.next();
		
		System.out.println(main.solution(str));
	}
}
