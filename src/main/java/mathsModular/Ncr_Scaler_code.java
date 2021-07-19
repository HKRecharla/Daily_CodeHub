package mathsModular;

public class Ncr_Scaler_code {

    public static void main(String[] args) {
        int A=41;
        int B=27;
        int C=143;

        int[][] c =  new int[A+1][B+1];

        for (int i = 0; i <=A; i++) {
            int min = Math.min(i,B);
            for (int j = 0; j <=min; j++) {
                if(j==0 || j==i){
                    c[i][j]=1;
                }else{
                    c[i][j]=c[i-1][j-1]+c[i-1][j];
                }
            }
        }
        System.out.println(c[A][B]%C);

    }






    public int solve(int A, int B, int C) {
        if (A<B)
            return 0;
        if (B == 0)
            return 1;
        int fact = (int)fact(A,C);
        long factmod_r = inverse_mod((int)fact(B,C),C);
        long factmod_n_r =inverse_mod((int)fact(A-B,C),C);

        int res =(int)(((((fact*factmod_r)%C)*factmod_n_r)%C)%C)%C;

        return res;
    }


    //Factorial
    //  public static long fact(int a,int mod){
    //     if(a==0) return 1;
    //     return ((a%mod)*(fact(a-1,mod)%mod))%mod;
    // }


    //power of number
    public static long power(int a, int b, int p){
        if(b==0) return 1;
        long c =power(a,b/2,p);
        long res = ((long)(c*c)%p);
        if(b%2==1){
            res= (res*a)%p;
        }
        return res%p;
    }

    //Inverse Mod
    public static long inverse_mod(int a, int p){
        return power(a,p-2,p);
    }


    public static long fact(int n,int p){

        long i,fac=1;
        for(i=1;i<=n;i++){
            fac=((fac%p)*(i%p))%p;
        }
        return (fac%p);
    }
}
