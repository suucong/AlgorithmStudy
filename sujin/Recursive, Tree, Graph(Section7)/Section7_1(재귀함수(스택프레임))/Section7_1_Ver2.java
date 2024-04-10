class Section7_1_Ver2 {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public void solution(int n){
        DFS(n);
    }

    public static void main(String[] args){
        Section7_1_Ver2 T = new Section7_1_Ver2();
        T.solution(3);
        //System.out.println(T.solution(3));
    }
}