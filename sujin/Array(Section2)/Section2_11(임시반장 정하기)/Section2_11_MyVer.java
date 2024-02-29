import java.util.ArrayList;
import java.util.Scanner;

public class Section2_11_MyVer {
    private int solution(int n, int[][] list) {
        int answer = 0;
        int biggest = Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList<>();

        // 학년 별로 자신을 제외한 다른 친구의 반과 자신의 반을 비교
        for(int i = 0; i < n; i++) {
            arr.clear();
            for(int j = 0; j < 5; j++) {
                if(i > 0) {
                    for(int k = i-1; k >= 0; k--) {
                        // 같은 반이었던 친구고, 이전에 추가하지 않았을 경우 친구 번호 arr에 추가
                        if(list[i][j] == list[k][j] && !arr.contains(k))    arr.add(k);
                    }
                }

                for(int l = i+1; l < n; l++) {
                    // 같은 반이었던 친구고, 이전에 추가하지 않았을 경우 친구 번호 arr에 추가
                    if(list[i][j] == list[l][j] && !arr.contains(l))    arr.add(l);
                }
            }

            // arr의 크기가 biggest보다 크면 biggest에 arr.size, answer에 현재 학생의 인덱스 삽입
            if(biggest < arr.size()) {
                biggest = arr.size();
                answer = i;
            }
        }

        return answer+1;    // index이므로 1 더해주기
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_11_MyVer main = new Section2_11_MyVer();
        int n = scanner.nextInt();
        int list[][] = new int[n][5];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 5; j++) {
                list[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(n, list));
    }
}
