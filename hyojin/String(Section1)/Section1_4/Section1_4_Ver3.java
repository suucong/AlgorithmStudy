package Section1_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Section1_4_Ver3 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>();
        for(String x:str){
            char[] s=x.toCharArray();
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp=String.valueOf(s);
            answer.add(tmp);
        }
        return answer;

    }
    public static void main(String[] args){
        Section1_4_Ver3 t= new Section1_4_Ver3();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String [] array = new String[n];
        for(int i=0; i<n; i++){
            array[i]=in.next();
        }
        for(String x: t.solution(n,array)){
            System.out.println(x);
        }

        return ;
    }
}
