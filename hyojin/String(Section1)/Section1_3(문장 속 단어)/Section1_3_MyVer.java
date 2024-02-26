package Section1_3;

import java.util.Scanner;

public class Section1_3_MyVer {
    public String solution(String str){
        String answer=" ";
        String[] words=str.split(" ");
        for(String s: words){
            if(s.length()>answer.length()) answer=s;

        }
        return answer;
    }
    public static void main(String[] args){
        Section1_3_MyVer t= new Section1_3_MyVer();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(t.solution(str));
    }
}
