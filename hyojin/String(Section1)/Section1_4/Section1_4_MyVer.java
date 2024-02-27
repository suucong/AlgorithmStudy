package Section1_4;

import java.util.Scanner;

public class Section1_4_MyVer {
    public String solution(String [] array,int n){
        String answer="";
        for(int i=0;i<n;i++){
            int len=array[i].length();
            for(int j=len-1; j>=0; j--){
                answer += array[i].charAt(j);
            }
            answer+="\n";
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_4_MyVer t= new Section1_4_MyVer();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String [] array = new String[n];
        for(int i=0; i<n; i++){
            String input1 = in.next();
            array[i]=input1;
        }
        System.out.println(t.solution(array,n));
        return ;
    }
}
