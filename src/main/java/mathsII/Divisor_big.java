package mathsII;

import java.math.BigInteger;

public class Divisor_big {

    public static void main(String[] args) {

    }


    public String solve(String A, String B) {

        int MOD =1000000007;
        BigInteger am = new BigInteger(A);
        BigInteger bm = new BigInteger(B);
        int m = (int)(am.intValue()%MOD);
        int m1 = (int)(bm.intValue()%MOD);

        int val = Math.abs(div(m,m1));
        return String.valueOf(val);
    }

    public static int div(int a, int b){
    if(b==0) return a;
    return div(b,a%b);
    }
}
