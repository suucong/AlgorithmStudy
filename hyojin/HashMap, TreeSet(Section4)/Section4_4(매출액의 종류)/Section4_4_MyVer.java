package Section4_4;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Scanner;

public class Section4_4_MyVer {
    public int solution(String str1, String str2) {
        int answer = 0, len = str2.length(), lt = 0;

        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for (char x : str2.toCharArray()) {
            m1.put(x, m1.getOrDefault(x, 0) + 1);

            //초기 map 생성
            for (int i = 0; i < len - 1; i++) m2.put(str1.charAt(i), m2.getOrDefault(str1.charAt(i), 0) + 1);

            for (int rt = len - 1; rt < str1.length(); rt++) {
                m2.put(str1.charAt(rt), m2.getOrDefault(str1.charAt(rt), 0) + 1);
                if (m2.equals(m1)) answer++;
                m2.put(str1.charAt(lt), m2.get(str1.charAt(lt)) - 1);
                if (m2.get(str1.charAt(lt)) == 0) m2.remove(str1.charAt(lt));
                lt++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section4_4_MyVer t = new Section4_4_MyVer();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(t.solution(str1, str2));
    }
}
