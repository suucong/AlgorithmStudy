package Section1_8;

import java.util.Scanner;

public class Section1_8_MyVer {
	public String solution(String str) {
		String answer = "YES";
		String alpha = "";
		char[] c = str.toUpperCase().toCharArray();
		
		for(int i = 0; i < c.length; i++) {
			if(Character.isAlphabetic(c[i])) alpha += c[i];
		}
		
		int lt = 0, rt = alpha.length()-1;
		while(lt < rt) {
			if(alpha.charAt(lt) != alpha.charAt(rt)) {
				answer = "NO";
				break;
			}
			lt++;
			rt--;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Section1_8_MyVer main = new Section1_8_MyVer();
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		System.out.println(main.solution(str));
	}
}
