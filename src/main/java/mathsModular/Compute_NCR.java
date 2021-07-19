package mathsModular;

public class Compute_NCR {
    public static void main(String[] args) {

        int A=3; //n
        int B=2; //r
        int C=33; //p


        int n = (int)fact(A,C);
        long r = inverse_mod((int)fact(B,C),C);
        long rr =inverse_mod((int) fact((A-B),C),C);
//        int s =n%C;
//        int p=r%C;
//        long sp =Math.abs(s*p);
//            long nr = (Math.abs((n%C)*(r%C)))%C;
//            long nrr = ((nr%C)*(rr%C))%C;
        int res = (int)(((((n*r)%C)*rr)%C)%C)%C;
        System.out.println(res);


    }
    public static long fact(int a,int p){

        long fac=1;
        for(int i=1;i<=a;i++){
            fac=((fac%p)*(i%p))%p;
        }
        return fac;
    }
//    public static long fact(int a,int mod){
//        if(a==0) return 1;
//        return ((a%mod)*(fact(a-1,mod)%mod))%mod;
//    }


    public static long power(int a, int b, int p){
        if(b==0) return 1;
        long c =power(a,b/2,p);
        long res = ((long)(c*c)%p);
        if(b%2==1){
            res= (res*a)%p;
        }
        return res%p;
    }

    public static long inverse_mod(int a, int p){
        return power(a,p-2,p);
    }




}
