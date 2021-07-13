package maths_PrimeNumber;

public class Prime_Factors {

    public static void main(String[] args) {

    }


    public static void prime_fact(int A){

    }


    public static boolean isPrime(int A){
        boolean flag =true;
        for (int i = 2; i*i <=A ; i++) {
            if(A%i==0) flag=false;
        }
        return flag;
    }


    public static void o_logn(int A){

        int [] c = new int[5001];
        for (int i = 0; i < c.length; i++) {
            c[i]=0;
        }

        for (int i = 2; i <=A; i++) {
            boolean flag = isPrime(i);
            if(flag){
                for (int j = 2*i; j <=A ; j+=i) {
                    c[j]+=1;
                }
            }
        }
        int count=0;
        for (int i = 0; i < c.length; i++) {
            if(c[i]==2){
                count++;
            }
        }
        System.out.println(count);
    }
}
