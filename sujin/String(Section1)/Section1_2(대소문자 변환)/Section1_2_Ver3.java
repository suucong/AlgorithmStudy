package Section1_2;

import java.util.Scanner;

public class Section1_2_Ver3 {
	
	public String solution(String str) {
		
		String answer="";
		for(char x : str.toCharArray()) {
			if(x>=97 && x<=122) answer+=(char)(x-32);
			else answer+=(char)(x+32);
		}
			
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Section1_2_Ver3 myVer = new Section1_2_Ver3();
		
		String str = scanner.nextLine();
		
		System.out.println(myVer.solution(str));
		scanner.close();
		
	}

}
