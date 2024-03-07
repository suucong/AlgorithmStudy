package Section2_08;

import java.util.Scanner;

public class Section2_08_MyVer {
    public int[] solution(int n, int[] arr){
        int[] answer=new int[n];
        for(int i=0; i<n; i++){
            int cnt=1;
            for(int j=0; j<n; j++){
                if(arr[i]<arr[j]){
                    cnt++;
                    answer[i]=cnt;
                }
                else answer[i]=cnt;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section2_08_MyVer t = new Section2_08_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        for(int x: t.solution(n, arr)) System.out.print(x+" ");
    }
}
