package Section9_06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Section9_06_MyVer {


    static int[] arr;
    public int find(int v){
        if(v==arr[v]) return v;
        else {
            return arr[v] = find(arr[v]);
        }
    }


    public void friend(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa!=fb) arr[fa] = fb;
    }


    public static void main(String[] args) {
        Section9_06_MyVer t = new Section9_06_MyVer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            t.friend(a, b);
        }
        int a = t.find(sc.nextInt());
        int b = t.find(sc.nextInt());
        if (a == b) System.out.println("YES");
        else System.out.println("NO");

    }
}