package Section4_1;

import java.util.HashMap;
import java.util.Scanner;

public class Section4_1_Ver2 {
    public char solution(int n, String str){
        char answer=' ';
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
//        System.out.println(map.containsKey('A'));  // true 또는 false 리턴
//        System.out.println(map.size());  // 키의 개수
//        System.out.println(map.remove('A'));  // 특정 키 삭제

        int max=Integer.MIN_VALUE;
        for(char key: map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                answer=key;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section4_1_Ver2 t = new Section4_1_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String str=scanner.next();
        System.out.println(t.solution(n, str));
    }
}
