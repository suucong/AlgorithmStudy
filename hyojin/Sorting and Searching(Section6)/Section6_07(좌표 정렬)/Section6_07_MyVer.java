package Section6_07;

import java.util.Scanner;

public class Section6_07_MyVer {
    public int[][] solution(int n, int[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i][0] > arr[j][0]) {
                    int x = arr[i][0];
                    int y = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = x;
                    arr[j][1] = y;
                }
                else if(arr[i][0] == arr[j][0]) {
                    if(arr[i][1] > arr[j][1]) {
                        int y = arr[i][1];
                        arr[i][1] = arr[j][1];
                        arr[j][1] = y;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Section6_07_MyVer t = new Section6_07_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int[][] tmp=t.solution(n, arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(tmp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
