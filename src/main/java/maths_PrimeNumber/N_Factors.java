package maths_PrimeNumber;

public class N_Factors {

    public static void main(String[] args) {

        int A=15;
        int MOD =1000000007;
        fact_n(A,MOD);
    }

    public static int fact_n(int A,int MOD){

        long count=0;
        int fac =(int) fact_loop(A,MOD)%MOD;
        for (int i = 1; i <=fac ; i++) {
            if(fac%i==0){
                count+=i;
            }
        }
        System.out.println(count);
        return (int) count;
    }

    public static long fact(int A,int MOD){
        if(A==0) return 1;
        return ((A%MOD)*fact(A-1,MOD)%MOD)%MOD;
    }

    public static long fact_loop(int A,int MOD){
       long fac =1;
        for (int i = 1; i <=A; i++) {
            fac=(fac*i)%MOD;
        }
        return fac%MOD;
    }
}
