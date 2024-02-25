import java.util.Scanner;

public class Section1_2_MyVer {
    public String solution(String str){
        String answer="";
        for (char x : str.toCharArray()){
            if(x>64 && x<91) answer+=Character.toLowerCase(x);
            else if(x>96) answer+=Character.toUpperCase(x);
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_2_MyVer t = new Section1_2_MyVer();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(t.solution(str));
    }
}
