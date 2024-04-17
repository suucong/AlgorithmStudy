package Section7_02;

public class Section7_02_Ver2 {
    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        DFS(11);
    }
}
