import java.util.Scanner;

public class Section7_6_Ver1 {
    static int n;
    static int[] ch;    // L을 부분집합에 사용하는지의 여부 저장

    public void DFS(int L) {
        if (L == (n + 1)) {
            String tmp = "";
            for (int i = 1; i <= n; i++)    if (ch[i] == 1) tmp += i + " ";
            if (!tmp.isEmpty())  System.out.println(tmp);    // 공집합은 출력하지 않아야함. 마지막은 공집합.
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        Section7_6_Ver1 T = new Section7_6_Ver1();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ch = new int[n + 1];
        T.DFS(1);
    }
}
