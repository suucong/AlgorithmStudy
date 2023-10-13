package String_Section1_1;

import java.util.Scanner;

public class Section1_1_Ver3 {
	
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		for(char x : str.toCharArray()) {
			if(x==t) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Section1_1_Ver3 s = new Section1_1_Ver3();
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		char c = scanner.next().charAt(0);
		
		System.out.println(s.solution(str, c));
	}

}
