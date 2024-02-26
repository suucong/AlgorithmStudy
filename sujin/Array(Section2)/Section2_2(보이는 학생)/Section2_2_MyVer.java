import java.util.Scanner;

public class Section2_2_MyVer {
    private int solution(int n, int[] students) {
        int p = 1;
        int lastStudent = students[0];

        for(int i = 1; i < n; i++) {
            if(lastStudent < students[i]) {
                lastStudent = students[i];
                p++;
            }
        }

        return p;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_2_MyVer main = new Section2_2_MyVer();
        int n = scanner.nextInt();
        int[] students = new int[n];

        for(int i = 0; i < students.length; i++) {
            students[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, students));
    }
}
