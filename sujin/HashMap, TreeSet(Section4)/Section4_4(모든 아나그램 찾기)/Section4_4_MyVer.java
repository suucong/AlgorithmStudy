import java.util.HashMap;
import java.util.Scanner;

public class Section4_4_MyVer {
    private int solution(String str1, String str2) {
        int answer = 0, lt = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        for(int i = 0; i < str2.length(); i++) {
            hashMap2.put(str2.charAt(i), hashMap2.getOrDefault(str2.charAt(i), 0) + 1);
            hashMap.put(str1.charAt(i), hashMap.getOrDefault(str1.charAt(i), 0) + 1);
        }
        if(hashMap.equals(hashMap2))    answer++;

        for(int rt = str2.length(); rt < str1.length(); rt++) {
            if(hashMap.getOrDefault(str1.charAt(lt), 0) > 1) {
                hashMap.put(str1.charAt(lt), hashMap.get(str1.charAt(lt)) - 1);
                lt++;
            } else {
                hashMap.remove(str1.charAt(lt));
                lt++;
            }
            hashMap.put(str1.charAt(rt), hashMap.getOrDefault(str1.charAt(rt), 0) + 1);

            if(hashMap.equals(hashMap2))    answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section4_4_MyVer T = new Section4_4_MyVer();
        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.println(T.solution(str1, str2));
    }
}
