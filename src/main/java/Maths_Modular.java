public class Maths_Modular {

    public static void main(String[] args) {

        int A=2;
        int B=27;
        modular(A,B);

    }



    public static void modular(int A, int B){
        int MOD =100000007;
        int fact = fact(B%MOD);
        System.out.println(fact);
        int ma = (int)Math.pow(A%MOD,fact%MOD);

        System.out.println(ma);
    }



    public static int fact(int a){
        if(a==0) return 1;
        return (a%100000007)*fact(a-1);
    }
}
