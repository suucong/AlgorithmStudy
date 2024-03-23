package Section4_5;

import java.util.*;

public class Section4_5_MyVer {
    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    int sum = arr[i] + arr[j] + arr[l];
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }
        for (int x : map.keySet()) {
            list.add(x);
        }
        Collections.sort(list, Collections.reverseOrder());
        answer = list.get(k - 1);
        return answer;
    }

    public static void main(String[] args) {
        Section4_5_MyVer t = new Section4_5_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(t.solution(n, k, arr));
    }
}
