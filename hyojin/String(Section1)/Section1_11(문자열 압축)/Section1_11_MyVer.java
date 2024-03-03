package Section1_11;

import java.util.Scanner;

public class Section1_11_MyVer {
    public String solution(String str){
        String answer="";
        int cnt=1;
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            }
            if (str.charAt(i) != str.charAt(i + 1)) {
                answer+=str.charAt(i);
                if(cnt>1) answer+=cnt;
                cnt=1;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_11_MyVer t = new Section1_11_MyVer();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(t.solution(str));
    }
}
