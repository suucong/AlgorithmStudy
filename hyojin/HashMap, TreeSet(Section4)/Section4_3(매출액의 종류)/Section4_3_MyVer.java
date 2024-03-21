package Section4_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Section4_3_MyVer {
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer=new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int rt=k-1;
        for(int lt=0; lt<n; lt++){
            map.put(arr[lt], map.getOrDefault(arr[lt],0)+1);
            if(lt==rt) {
                rt++;
                answer.add(map.size());
                if(map.get(arr[lt-(k-1)])==1){
                    map.remove(arr[lt-(k-1)]);  // key가 lt인 값이 1이라면 삭제
                }
                else{
                    map.put(arr[lt-(k-1)],map.get(arr[lt-(k-1)])-1);  // 1이 아니면 key가 lt인 값 줄이기
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section4_3_MyVer t = new Section4_3_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        for(int x: t.solution(n,k,arr)) System.out.print(x+" ");
    }
}
