package sampleInterview;

public class Factorial {

    public static void main(String[] args) {
        int A=4;
       int f =  fact(A);
        System.out.println(f);
    }

    public static int fact(int A){
        if(A==0) return 1;
        return A*fact(A-1);
    }
}
