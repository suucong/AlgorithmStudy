import java.util.Scanner;
import java.util.ArrayList;

public class Section5_1_MyVer {
    public String solution(String str) {
        String answer = "YES";
        char[] chrList = str.toCharArray();
        ArrayList<Character> arrList = new ArrayList<>();
        for(char c : chrList) {
            if(c == '(') {
                arrList.add(c);
            } else {
                if(arrList.isEmpty()) {
                    answer = "NO";
                    break;
                } else {
                    arrList.remove(arrList.size()-1);
                }
            }
        }

        if(!arrList.isEmpty())  answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section5_1_MyVer T = new Section5_1_MyVer();
        String str = scanner.next();

        System.out.println(T.solution(str));
    }
}
