import java.util.Scanner;

public class Section1_1_Ver2 {
    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) answer++;
        }
        return answer;
    }


    public static void main(String[] args){
        Section1_1_Ver2 t = new Section1_1_Ver2();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        System.out.println(t.solution(str, c));
    }
}
