package sampleInterview;

public class Fibonic {

    public static void main(String[] args) {

        int A=10;

        for (int i = 0; i < A; i++) {
            int f = fibonic(i);

            System.out.println(f);
        }

    }

    public static int fibonic(int A){
        if(A==0) return 0;
        if(A<=2) return 1;

        return fibonic(A-1)+fibonic(A-2);
    }
}
