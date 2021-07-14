package maths_PrimeNumber;

public class Sum_Prime {
    public static void main(String[] args) {

       int[] f =  two_prime(4);
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
    }


    public static int[] two_prime(int A){
        int other =0;
        int[] res =new int[2];
        for (int i = 2; i <=A; i++) {
            other =A-i;
            if(isPrime(i) && isPrime(other)){
                res[0]=i;
                res[1]=other;
                return res;
            }
        }
        return res;
    }

    public static boolean isPrime(int A){
        boolean flag=true;
        for (int i = 2; i*i <=A; i++) {
            if(A%i==0){
                flag=false;
            }
        }
        return flag;
    }
}
