package Section6_10;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Section6_10_MyVer {

    // 몇개의 마구간에 배치할 수 있는지
    public int count(int n, int[] arr, int mid) {
        int cnt = 1;
        int p=0;
        for (int i=1; i<n; i++) {
            if(arr[i]-arr[p] >= mid) {
                cnt++;
                p=i;
            }
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 1;
        int rt = arr[n-1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(n, arr, mid) >= m) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Section6_10_MyVer t = new Section6_10_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(t.solution(n, m, arr));
    }
}
