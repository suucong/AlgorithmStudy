import java.util.Scanner;

public class Section1_11_MyVer {
    private String solution(String str) {
        StringBuilder sb = new StringBuilder();
        int p = 1;
        char lastChar = '0';

        for(int i = 0; i < str.length(); i++) {
            if(lastChar != str.charAt(i)) {
                if(p != 1)  sb.append(p);
                sb.append(str.charAt(i));
                p = 1;
            } else {
                p++;
                if(i == str.length()-1)     sb.append(p);   // 마지막 문자일 경우인데, last와 다르지 않은 경우 문자열에 추가
            }

            lastChar = str.charAt(i);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section1_11_MyVer main = new Section1_11_MyVer();
        String str = scanner.nextLine();

        System.out.println(main.solution(str));
        scanner.close();
    }
}
