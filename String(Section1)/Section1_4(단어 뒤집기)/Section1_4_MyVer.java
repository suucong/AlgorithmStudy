package Section1_4;

import java.util.Scanner;

public class Section1_4_MyVer {
	
	public String[] solution(int num, String[] str) {
		
		String[] answer = new String[num];
		
		for(int i = 0; i < num; i++) {
			String word = "";
			for(int m = str[i].length() - 1; m >= 0; m--) {
				word += str[i].charAt(m);
			}
			answer[i] = word;
		}
		
		return answer;
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Section1_4_MyVer myVer = new Section1_4_MyVer();
		int num = scanner.nextInt();
		String[] str = new String[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println(i);
			str[i] = scanner.nextLine();
		}
		
		str = myVer.solution(num, str);
		
		for(int i = 0; i < num; i++) {
			System.out.println(str[i]);
		}
	}
}
