package Section2_07;

import java.util.Scanner;

public class Section2_07_MyVer {
    public int solution(int n, int[] arr){
        int answer=0;
        if(arr[0]==1) answer++;
        for(int i=1; i<n; i++){
            if(arr[i]==1 && arr[i-1]>=1) arr[i]=arr[i-1]+1;
            if(arr[i]>=1) answer+=arr[i];
        }
        return answer;

    }

    public static void main(String[] args) {
        Section2_07_MyVer t = new Section2_07_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(t.solution(n, arr));
    }
}
