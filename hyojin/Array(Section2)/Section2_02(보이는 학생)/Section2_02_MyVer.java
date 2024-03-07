package Section2_02;

import java.util.Scanner;

public class Section2_02_MyVer {
    public int solution(int n, int[] arr){
        int answer=1;
        int max=arr[0];
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                max= arr[i];
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section2_02_MyVer t = new Section2_02_MyVer();
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(t.solution(n,arr));
    }
}
