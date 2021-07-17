package mathsModular;

public class Prime_modulo_Inverse {

    public static void main(String[] args) {
        int A=6;
        int B=23;

        if(gcd(A,B)!=1){
            System.out.println(1);
        }else{
            System.out.println(power(A,B-2,B));
        }

       int a =  modInverse(6,23);
        System.out.println(a);
    }


    static int modInverse(int a, int m) {
        for (int x = 1; x < m; x++)
            if (((a%m) * (x%m)) % m == 1)
                return x;
        return 1;
    }

    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }


    public static int power(int a, int b, int m){
        if(b==0) return 1;
        long c =power(a,b/2,m);
        long res = ((long)c*c)%m;
        if(b%2==1){
            res = ((long)res*a)%m;
        }
        return (int)res%m;
    }

}
