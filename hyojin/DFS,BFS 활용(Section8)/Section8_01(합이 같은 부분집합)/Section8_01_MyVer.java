package Section8_01;

import java.util.HashMap;
import java.util.Scanner;

public class Section8_01_MyVer {
    static int n;
    static HashMap<Integer, Integer> chMap;
    static int[] arr;
    static String answer = "NO";
    static int total = 0;

    public static void DFS(int p) {
        if (answer.equals("YES")) return;
        if (p == n) {
            int sum = 0;
            for (int c : arr) {
                int a = chMap.get(c);
                if (a == 1) sum += c;
            }
            if ((total - sum) == sum) answer = "YES";
        } else {
            chMap.put(arr[p], 1);
            DFS(p + 1);
            chMap.put(arr[p], 0);
            DFS(p + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        chMap = new HashMap<>();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
            chMap.put(arr[i], chMap.getOrDefault(arr[i], 0));
        }
        DFS(0);
        System.out.println(answer);
    }
}
