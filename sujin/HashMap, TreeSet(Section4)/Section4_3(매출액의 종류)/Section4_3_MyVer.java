import java.util.Scanner;
import java.util.*;

public class Section4_3_MyVer {
    private int[] solution(int n, int k, int[] list) {
        int[] answer = new int[n-k+1];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int lt = 0;

        for(int i = 0; i < k; i++) {
            hashMap.put(list[i], hashMap.getOrDefault(list[i], 0) + 1);
        }
        answer[lt] = hashMap.keySet().size();

        for(int rt = k; rt < n; rt++) {
            if(hashMap.get(list[lt]) > 1)   hashMap.put(list[lt], hashMap.get(list[lt])-1);
            else    hashMap.remove(list[lt]);
            lt++;
            hashMap.put(list[rt], hashMap.getOrDefault(list[rt], 0) + 1);
            answer[lt] = hashMap.keySet().size();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section4_3_MyVer T = new Section4_3_MyVer();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        for(int j : T.solution(n, k, list)) {
            System.out.print(j + " ");
        }
    }
}
