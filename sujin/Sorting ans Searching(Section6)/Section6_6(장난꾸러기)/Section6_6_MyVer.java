import java.util.Scanner;

public class Section6_6_MyVer {

    private void solution(int n, int[] list) {
        int cNum = 0, fNum = 0;
        for (int i = 0; i < n - 1; i++) {
            if (list[i] > list[i + 1]) {
                if (cNum == 0)  cNum = i + 1;
                else {
                    fNum = i + 2;
                    break;
                }
            }
        }

        if (fNum == 0) {    // 순서에 맞지 않는 값이 한 개일 경우
            fNum = cNum + 1;
            int cHeight = list[cNum - 1];
            for (int j = cNum - 1; j >= 0; j--) {
                if (list[j] != cHeight) {
                    cNum = j + 2;
                    break;
                }
            }
        }

        System.out.println(cNum + " " + fNum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section6_6_MyVer T = new Section6_6_MyVer();
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = scanner.nextInt();
        T.solution(n, list);
    }
}
