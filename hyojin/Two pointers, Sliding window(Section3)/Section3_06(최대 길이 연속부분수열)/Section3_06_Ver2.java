package Section3_06;

import java.util.Scanner;

public class Section3_06_Ver2 {
    public int solution(int n, int k, int[] arr){
        int answer=0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer=Math.max(answer,rt-lt+1);
        }
        return answer;
    }
    public static void main(String[] args){
        Section3_06_Ver2 t = new Section3_06_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(t.solution(n,k,arr));
    }
}
