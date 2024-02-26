import java.util.Scanner;

public class Section2_1_MyVer {
    private String solution(int n, String str) {
        String answer = str.charAt(0)+"";
        String[] strList = str.split(" ");

        for(int i = 1; i < strList.length; i++) {
            if(Integer.valueOf(strList[i-1]) < Integer.valueOf(strList[i])) {
                answer += " " + strList[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_1_MyVer main = new Section2_1_MyVer();
        int n = Integer.valueOf(scanner.nextLine());
        String str = scanner.nextLine();

        System.out.println(main.solution(n, str));
    }
}
