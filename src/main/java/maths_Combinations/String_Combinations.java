package maths_Combinations;

public class String_Combinations {

    public static void main(String[] args) {

        partition(4,0,1,0);
    }

    public static void partition(int A, int B, int C,int D){

        int MOD = 100000007;
        long n = A-(B+C+D);
        long com = (n+2)*(n+1);
        long value = (com/2)%MOD;
        int res = (int) ((value+MOD)%MOD);
        System.out.println(res);
    }
}
