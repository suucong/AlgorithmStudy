import java.util.Scanner;

public class Section3_05_Ver3 {
    public int solution(int n){
        int answer=0, cnt=1; //연속된 자연수의 개수
        n--;
        while(n>0){
            cnt++;
            n=n-cnt;
            if(n%cnt==0) answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        Section3_05_Ver3 t = new Section3_05_Ver3();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(t.solution(n));
    }
}
