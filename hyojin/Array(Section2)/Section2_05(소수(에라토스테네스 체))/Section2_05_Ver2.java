package Section2_05;

import java.util.Scanner;

public class Section2_05_Ver2 {
    public int solution(int n){
        int answer=0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<n; j=j+i) ch[j]=1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Section2_05_Ver2 t = new Section2_05_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(t.solution(n));
    }
}
