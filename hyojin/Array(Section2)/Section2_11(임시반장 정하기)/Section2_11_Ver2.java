package Section2_11;

import java.util.Scanner;

public class Section2_11_Ver2 {
    public int solution(int n, int[][] arr){
        int answer=0, max=Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            int cnt=0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;

    }
    public static void main(String[] args){
        Section2_11_Ver2 t = new Section2_11_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr=new int[n][5];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(t.solution(n,arr));
    }
}
