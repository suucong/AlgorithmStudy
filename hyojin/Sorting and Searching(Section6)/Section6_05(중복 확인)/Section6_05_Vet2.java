package Section6_05;

import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Section6_05_Vet2 {
    public String solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if (arr[i] == arr[i + 1]) {
                return "D";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Section6_05_Vet2 t = new Section6_05_Vet2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(t.solution(n, arr));
    }
}
