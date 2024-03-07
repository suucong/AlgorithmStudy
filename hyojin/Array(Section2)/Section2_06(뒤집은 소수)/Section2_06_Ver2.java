package Section2_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Section2_06_Ver2 {
    public boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> answer=new ArrayList<>();
        for(int num: arr){
            int res=0;
            while(num>0){
                int t=num%10;
                res=res*10+t;
                num=num/10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }
    public static void main(String[] args){
        Section2_06_Ver2 t = new Section2_06_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        for(int x: t.solution(arr)) System.out.print(x+" ");
    }
}
