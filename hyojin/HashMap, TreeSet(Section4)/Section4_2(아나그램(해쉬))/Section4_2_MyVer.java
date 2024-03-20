package Section4_2;

import java.util.HashMap;
import java.util.Scanner;

public class Section4_2_MyVer {
    public String solution(String str1, String str2){
        String answer="YES";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: str1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        for(char c:str2.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char key: map.keySet()){
            if(map1.get(key)!=map.get(key)) answer= "NO";
        }
        return answer;
    }
    public static void main(String[] args){
        Section4_2_MyVer t = new Section4_2_MyVer();
        Scanner scanner = new Scanner(System.in);
        String str1=scanner.next();
        String str2=scanner.next();
        System.out.println(t.solution(str1,str2));
    }
}
