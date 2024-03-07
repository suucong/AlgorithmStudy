package Section2_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Section2_06_MyVer {

    // 소수인지 아닌지 확인하는 함수
    public boolean isDemical(int n){
        if (n==1) return false;
        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public ArrayList<String> solution(int n, String[] arr){
        ArrayList<String> a= new ArrayList<>();
        for(int i=0; i<n; i++){
            String tmp=new StringBuilder(arr[i]).reverse().toString();
            if(isDemical(Integer.parseInt(tmp))) {
                a.add(tmp);
            }
        }
        return a;
    }
    public static void main(String[] args){
        Section2_06_MyVer t = new Section2_06_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String[] arr =new String[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.next();
        }
        for(String x: t.solution(n,arr)) System.out.print(x+" ");
    }
}
