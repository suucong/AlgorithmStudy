package Section2_09;

import java.util.Scanner;

public class Section2_09_Ver2 {
    public int solution(int n, int[][] array){
        int answer=Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1+=array[i][j];
                sum2+=array[j][i];
            }
            answer=Math.max(answer,sum1);
            answer=Math.max(answer,sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=array[i][i];
            sum2+=array[i][n-1-i];
        }
        answer=Math.max(answer,sum1);
        answer=Math.max(answer,sum2);
        return answer;
    }
    public static void main(String[] args){
        Section2_09_Ver2 t = new Section2_09_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] array=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.println(t.solution(n,array));
    }
}
