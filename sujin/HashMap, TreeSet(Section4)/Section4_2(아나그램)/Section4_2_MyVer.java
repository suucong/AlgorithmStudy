import java.util.HashMap;
import java.util.Scanner;

public class Section4_2_MyVer {
    private String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> record1 = new HashMap<>();
        HashMap<Character, Integer> record2 = new HashMap<>();

        for(int i = 0; i < str1.length(); i++) {
            record1.put(str1.charAt(i), record1.getOrDefault(str1.charAt(i), 0)+1);
            record2.put(str2.charAt(i), record2.getOrDefault(str2.charAt(i), 0)+1);
        }

        for(char c : record1.keySet()) {
            if(!record1.get(c).equals(record2.get(c))) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section4_2_MyVer main = new Section4_2_MyVer();
        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.println(main.solution(str1, str2));
    }
}
