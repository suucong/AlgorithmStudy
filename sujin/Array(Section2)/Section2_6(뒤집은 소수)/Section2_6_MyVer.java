import java.util.Scanner;

public class Section2_6_MyVer {
    private String solution(int n, int[] list) {
        String answer = "";
        int biggestInt = 0;

        // 숫자 뒤집고, 뒤집은 숫자 중 가장 큰 숫자 구하기
        for(int i = 0; i < n; i++) {
            int reverse = 0;

            while(list[i] != 0) {
                reverse = (reverse * 10) + (list[i] % 10);
                list[i] = list[i] / 10;
            }

            list[i] = reverse;

            if(list[i] > biggestInt)    biggestInt = list[i];
        }

        // 2부터 가장 큰 숫자까지의 소수 찾기
        int pNumList[] = new int[biggestInt+1];
        pNumList[0] = pNumList[1] = 1;

        for(int i = 2; i <= biggestInt; i++) {
            if(pNumList[i] == 0) {
                for(int j = 2; i*j <= biggestInt; j++)   pNumList[j*i] = 1;
            }
        }

        // 소수이면 답에 추가
        for(int i = 0; i < n; i++) {
            if(pNumList[list[i]] == 0)  answer += list[i] + " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_6_MyVer main = new Section2_6_MyVer();
        int n = scanner.nextInt();
        int[] list = new int[n];

        for(int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, list));
    }
}
