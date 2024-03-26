import java.util.Scanner;

public class Section6_1_MyVer {
    private int[] solution(int n, int[] list) {
        for(int i = 0; i < n; i++) {
            int minIndex = i;
            for(int j = i+1; j < n; j++) {
                if(list[j] < list[minIndex])    minIndex = j;
            }
            if(minIndex != i) {
                int tmp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = tmp;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section6_1_MyVer T = new Section6_1_MyVer();
        int n = scanner.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++)  list[i] = scanner.nextInt();
        for(int i : T.solution(n, list))    System.out.print(i + " ");
    }
}
