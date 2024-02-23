package Section1_2;

import java.util.Scanner;

public class Section1_2_MyVer {
	
	public char[] solution(String str) {
		
		char[] strArray = str.toCharArray();
		
		for(int i = 0; i < strArray.length; i++) {
			if(Character.isUpperCase(strArray[i])) {
				strArray[i] = Character.toLowerCase(strArray[i]);
			} else {
				strArray[i] = Character.toUpperCase(strArray[i]);
			}
		}
		
		return strArray;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Section1_2_MyVer myVer = new Section1_2_MyVer();
		
		String str = scanner.nextLine();
		
		System.out.println(myVer.solution(str));
		scanner.close();
		
	}
	
}
