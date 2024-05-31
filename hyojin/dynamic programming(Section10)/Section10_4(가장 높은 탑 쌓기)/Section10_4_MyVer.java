package Section10_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Block implements Comparable<Block>{
    public int width;
    public int height;
    public int weight;

    public Block(int width, int height, int weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Block o) {
        return this.width - o.width;
    }
}

public class Section10_4_MyVer {

    public int solution(int n, ArrayList<Block> arr, int[] dy) {
        int answer = 0;
        dy[0] = arr.get(0).height;
        for (int i = 1; i < n; i++) {
            int max  = 0;
            for (int j = i -1; j >=0; j--) {
                if(arr.get(i).weight > arr.get(j).weight && dy[j] > max) max = dy[j];
            }
            dy[i] = max + arr.get(i).height;
            answer = Math.max(dy[i], answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Section10_4_MyVer t = new Section10_4_MyVer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Block> arr = new ArrayList<>();
        int[] dy = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Block(a, b, c));
        }
        Collections.sort(arr);
        System.out.println(t.solution(n, arr, dy));
    }
}
