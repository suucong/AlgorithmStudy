package Section1_6;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Section1_6_MyVer {
    public String solution(String str){
        String answer="";
        for(char s:str.toCharArray()){
            if (!answer.contains(String.valueOf(s))) {
                answer+=s;
            }
        }
        return answer;

    }
    public static void main(String[] args){
        Section1_6_MyVer t= new Section1_6_MyVer();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(t.solution(input1));
    }
}
