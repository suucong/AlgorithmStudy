package Section3_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Section3_06_MyVer {
    public int solution(int n, int k, int[] arr){
        int answer=0, lt=0, cnt=0;
        ArrayList<Integer> pArray=new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]==0) pArray.add(i);
        }
        for(int rt=k-1; rt<pArray.size(); rt++){
            for(int i=0; i<n; i++){
                if(arr[i]==1) cnt++;
                else if(arr[i]==0 && i>=pArray.get(lt) && i<=pArray.get(rt)) cnt++;
                else {
                    answer=Math.max(answer,cnt);
                    cnt=0;
                }
            }
            lt++;
        }
        return answer;
    }
    public static void main(String[] args){
        Section3_06_MyVer t = new Section3_06_MyVer();
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
