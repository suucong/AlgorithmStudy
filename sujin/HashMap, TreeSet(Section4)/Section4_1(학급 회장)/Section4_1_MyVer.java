import java.util.HashMap;
import java.util.Scanner;

public class Section4_1_MyVer {
    private char solution(int n, String list) {
        char answer = 'A';
        int biggestValue = Integer.MIN_VALUE;

        // 학생 분류
        HashMap<Character, Integer> record = new HashMap<>();
        for(int i = 0; i < 5; i++) {
            record.put((char)(65+i), 0);
        }

        // 개표
        char[] recordList = list.toCharArray();
        for(char ch : recordList) {
            int value = record.get(ch);
            record.put(ch, ++value);
        }

        // 젤 큰 학생 구하기
        for(int i = 0; i < 5; i++) {
            if(biggestValue < record.get((char)(65+i))) {
                biggestValue = record.get((char)(65+i));
                answer = (char)(65+i);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section4_1_MyVer main = new Section4_1_MyVer();
        int n = scanner.nextInt();
        String list = scanner.next();

        System.out.println(main.solution(n, list));
    }
}