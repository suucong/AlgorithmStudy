package Section1_7;

import java.util.Scanner;

public class Section1_7_MyVer {
	
	public String solution(String str) {
		String answer = "YES";
		char[] c = str.toUpperCase().toCharArray();
		int lt = 0, rt = c.length-1;
		
		while(lt < rt) {
			if(c[lt] != c[rt]) {
				answer = "NO";
				break;
			}
			lt++;
			rt--;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Section1_7_MyVer main = new Section1_7_MyVer();
		String str = scanner.next();
		
		System.out.println(main.solution(str));
	}

}
