import java.util.*;

class Section1_11_Ver2 {
    public String solution(String s) {
        String answer="";
        s=s+" ";    // 인덱스 오류 나지 않게 문자열 마지막에 빈 문자열 하나 추가
        int cnt=1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else{
                answer+=s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Section1_11_Ver2 T = new Section1_11_Ver2();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();

        System.out.println(T.solution(str));
    }
}