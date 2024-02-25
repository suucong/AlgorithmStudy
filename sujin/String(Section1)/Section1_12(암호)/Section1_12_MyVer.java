import java.util.Scanner;

public class Section1_12_MyVer {
    private String solution(Integer number, String str) {
        StringBuilder answer = new StringBuilder();
        str = str.replace('*', '0').replace('#', '1');  // 암호 문자열을 을 2진수 형식으로 변환

        for(int i = 0; i < number; i++) {
            int num = Integer.parseInt(str.substring(i*7, i*7+7), 2); // 2진수에서 10진수로 변환
            answer.append((char) num);  // 10진수에 해당하는 아스키코드 값과 일지하는 문자로 변환
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section1_12_MyVer main = new Section1_12_MyVer();
        Integer number = Integer.valueOf(scanner.nextLine());
        String str = scanner.nextLine();

        System.out.println(main.solution(number, str));
        scanner.close();
    }
}
