package Section1_9;

import java.util.Scanner;

public class Section1_9_MyVer {
    public int solution(String str){
        String answer="";
        for(char c:str.toCharArray()){
            if(Character.isDigit(c)) answer+=c;
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args){
        Section1_9_MyVer t = new Section1_9_MyVer();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(t.solution(str));
    }
}
