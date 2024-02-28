package Section1_5;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Character.*;

public class Section1_5_MyVer {
    public String solution(String str){
        char [] x=str.toCharArray();
        int lt=0, rt=str.length()-1;
        char tmp = 0;
        while(lt<rt) {
            if ((x[lt] >= 'A' && x[lt] <= 'Z') || (x[lt] >= 'a' && x[lt] <= 'z')){
                tmp = x[lt];
                if((x[rt] >= 'A' && x[rt] <= 'Z') || (x[rt] >= 'a' && x[rt] <= 'z')) {
                    x[lt] = x[rt];
                    x[rt] = tmp;
                    lt++;
                }
                rt--;
            }
            else{
                lt++;
            }
        }
        String answer=String.valueOf(x);
        return  answer;
    }

    public static void main(String[] args){
        Section1_5_MyVer t= new Section1_5_MyVer();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();

        System.out.println(t.solution(input1));
        return ;
    }
}
