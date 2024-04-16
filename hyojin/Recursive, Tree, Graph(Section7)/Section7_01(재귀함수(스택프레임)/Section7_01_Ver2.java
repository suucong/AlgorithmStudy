package Section7_01;

public class Section7_01_Ver2 {
    public void DFS(int n) {
        if(n==0) return;
        else{
            System.out.print(n+" ");
            DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Section7_01_Ver2 t = new Section7_01_Ver2();
        t.DFS(3);
    }
}
