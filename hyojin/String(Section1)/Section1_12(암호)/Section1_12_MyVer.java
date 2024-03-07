package Section1_12;

import java.util.Arrays;
import java.util.Scanner;

public class Section1_12_MyVer {
    public String solution(int n, String str){
        String answer="";
        str= str.replace("#","1").replace("*","0");

        String[] array=new String[n];
        Arrays.fill(array,"");  // ""로 초기화

        int j=0;
        int len= str.length()/n;
        for(int i=0; i<n; i++) {
            if (i % len == 0 && i != 0) {
                j++;
            }
            array[j]+=str.charAt(i);
        }

        int [] array2=new int[n];
        for(int i=0; i<array.length; i++){
            array2[i]= Integer.parseInt(array[i], 2); //2진수를 10진수로 변환
            answer+=(char)array2[i];
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_12_MyVer t = new Section1_12_MyVer();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(t.solution(n,str));
    }
}
