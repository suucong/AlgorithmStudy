class Section7_3_Ver2 {
    public int DFS(int n){
        if(n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args){
        Section7_3_Ver2 T = new Section7_3_Ver2();
        System.out.println(T.DFS(5));
    }
}