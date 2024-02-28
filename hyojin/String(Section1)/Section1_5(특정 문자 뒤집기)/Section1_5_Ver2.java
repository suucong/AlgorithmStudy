package Section1_5;

import java.util.Scanner;

public class Section1_5_Ver2 {
    public String solution(String str){
        String answer;
        char [] s=str.toCharArray();
        int lt=0, rt=str.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);
        return answer;
    }
    public static void main(String[] args){
        Section1_5_Ver2 t= new Section1_5_Ver2();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();

        System.out.println(t.solution(input1));
        return ;
    }
}
