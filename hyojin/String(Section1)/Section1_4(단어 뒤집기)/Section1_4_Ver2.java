package Section1_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Section1_4_Ver2 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>();
        for(String x:str){
            String tmp=new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_4_Ver2 t= new Section1_4_Ver2();
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
