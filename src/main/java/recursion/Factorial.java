package recursion;

public class Factorial {


    public static void main(String[] args) {
        int N=4;
        int f  = fact(N);
        System.out.println(f);
    }


    public static int fbonic(int N){
        if(N<=1){
            return N;
        }
        int a = fbonic(N-1);
        int b = fbonic(N-2);
        int c = a+b;
        System.out.println("a :: "+a+" b :: "+b);
        return c;
    }

    public static int fact(int N){
        if(N==0){
            return 1;
        }
        int a = (N*fact(N-1));
        return a;
    }


}
