package Section6_06;

import java.util.Scanner;

public class Section6_06_MyVer {
    public String solution(int n, int[] arr) {
        String answer = "";
        int[] tmp=arr.clone();
        for (int i = 0; i < n; i++) {
            for(int j=i+1; j< n ; j++){
                if(arr[i]>arr[j]) {
                    int p=arr[i];
                    arr[i]=arr[j];
                    arr[j]=p;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]!=tmp[i]) answer+=i+1+" ";
        }
        return answer;
    }

    public static void main(String[] args) {
        Section6_06_MyVer t = new Section6_06_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(t.solution(n, arr));
    }
}
