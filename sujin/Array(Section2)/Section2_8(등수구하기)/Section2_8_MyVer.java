import java.util.Arrays;
import java.util.Scanner;

public class Section2_8_MyVer {
    private String solution(int n, int[] list) {
        String answer = "";
        int sortList[] = Arrays.copyOf(list, n);

        // 선택정렬을 이용하여 오름차순 정렬
        for(int i = 0; i < n; i++) {
            int biggest = i;
            for(int j = i; j < n; j++) {
                if(sortList[biggest] < sortList[j])   biggest = j;
            }

            int tmp = sortList[biggest];
            sortList[biggest] = sortList[i];
            sortList[i] = tmp;
        }

        for(int i = 0; i < n; i++) {
            int p = 0;
            while(p < n) {  // 일치하는 sortList index를 answer String에 추가
                if(list[i] == sortList[p]) {
                    answer += (p+1) + " ";
                    break;
                }
                p++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_8_MyVer main = new Section2_8_MyVer();
        int n = scanner.nextInt();
        int[] list = new int[n];

        for(int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, list));
    }
}
