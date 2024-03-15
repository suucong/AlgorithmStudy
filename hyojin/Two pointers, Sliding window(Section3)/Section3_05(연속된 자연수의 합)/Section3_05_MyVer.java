package Section3_05;

import java.util.Scanner;

public class Section3_05_MyVer {
    public int solution(int n){
        int answer=0, sum=0, rt=1;
        for(int i=1; i<n; i++){
            sum+=i;
            if(sum==n) answer++;
            while(sum>=n){
                sum-=rt;
                if(sum==n) answer++;
                rt++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section3_05_MyVer t = new Section3_05_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(t.solution(n));
    }
}
