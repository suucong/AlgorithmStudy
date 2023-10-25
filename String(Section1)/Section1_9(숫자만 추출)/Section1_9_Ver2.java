package Section1_9;

import java.util.Scanner;

public class Section1_9_Ver2 {
	public int solution(String s){
		//int answer=0;
		String answer="";
		for(char x : s.toCharArray()){
			//if(x>=48 && x<=57) answer=answer*10+(x-48);
			/*if(Character.isDigit(x)){
				answer=answer*10+ Character.getNumericValue(x);
			}*/
			if(Character.isDigit(x)) answer+=x;
		}
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Section1_9_MyVer T = new Section1_9_MyVer();
		String str = scanner.nextLine();
		System.out.println(T.solution(str));
	}
}
