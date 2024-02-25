import java.util.Scanner;

public class Section1_1_Ver3 {
    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for (char x :str.toCharArray()) {
            if (x==c) answer++;
        }
        return answer;
    }


    public static void main(String[] args){
        Section1_1_Ver3 t = new Section1_1_Ver3();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        System.out.println(t.solution(str, c));
    }
}
