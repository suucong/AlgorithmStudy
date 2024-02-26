package Section1_3;

import java.util.Scanner;

public class Section1_3_Ver3 {
    public String solution(String str){
        String answer=" ";
        int m= Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1){
            String tmp=str.substring(0,pos);
            int len=tmp.length();
            if(len>m) {
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length()>m) answer=str;
        return answer;
    }
    public static void main(String[] args){
        Section1_3_Ver3 t= new Section1_3_Ver3();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(t.solution(str));
    }
}
