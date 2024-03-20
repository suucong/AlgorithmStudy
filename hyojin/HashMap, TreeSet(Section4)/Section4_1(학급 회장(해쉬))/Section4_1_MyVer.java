package Section4_1;

import java.util.HashMap;
import java.util.Scanner;

public class Section4_1_MyVer {
    public char solution(String str){
        char answer = 0;
        HashMap<Character,Integer> hash=new HashMap<>();

        char[] cArr={'A','B','C','D','E'};
        for(char c: cArr){
            hash.put(c,0);
        }

        //개표
        for(char c: str.toCharArray()){
            int value=hash.get(c);
            hash.put(c,++value);
        }

        int max=Integer.MIN_VALUE;
        for(char c: hash.keySet()){
            if(hash.get(c)>max){
                max=hash.get(c);
                answer=c;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section4_1_MyVer t = new Section4_1_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String str=scanner.next();
        System.out.println(t.solution(str));
    }
}
