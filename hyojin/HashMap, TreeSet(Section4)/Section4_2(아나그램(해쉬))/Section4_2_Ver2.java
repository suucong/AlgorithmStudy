package Section4_2;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Scanner;

public class Section4_2_Ver2 {
    public String solution(String str1, String str2){
        String answer="YES";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x: str1.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x: str2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x,map.get(x)-1);
        }
        return answer;
    }
    public static void main(String[] args){
        Section4_2_Ver2 t = new Section4_2_Ver2();
        Scanner scanner = new Scanner(System.in);
        String str1=scanner.next();
        String str2=scanner.next();
        System.out.println(t.solution(str1,str2));
    }
}
