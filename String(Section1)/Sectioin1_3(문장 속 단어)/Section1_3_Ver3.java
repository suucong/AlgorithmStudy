package Section1_3;

import java.util.Scanner;

public class Section1_3_Ver3 {
	
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		
		while((pos=str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len>m) {
				m = len;
				answer = tmp;
			}
			
			str = str.substring(pos+1);
		}
		
		if(str.length() > m) answer = str;
		
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Section1_3_Ver3 ver2 = new Section1_3_Ver3();
		
		String str = scanner.nextLine();
		
		System.out.println(ver2.solution(str));
		scanner.close();
		
	}
}
