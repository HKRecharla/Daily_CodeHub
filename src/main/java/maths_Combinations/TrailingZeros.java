package maths_Combinations;

import java.math.BigInteger;

public class TrailingZeros {
   static int  MOD =1000000007;
    public static void main(String[] args) {

        int A=9251;
        java.math.BigInteger fac = factorial(A);
        System.out.println(fac);
        String s  = String.valueOf(fac);
        int count=0;


        for (int i = 5; A / i >= 1; i *= 5){
            System.out.println("i => "+i);
            System.out.println("A/i => "+A / i);
            count += A / i;
            System.out.println("count => "+count);
        }



//        for (int i = s.length()-1; i>=0 ; i--) {
//            if(Integer.parseInt(String.valueOf(s.charAt(i)))==0){
//                count++;
//                continue;
//            }else{
//                break;
//            }
//        }
//        int sum=fac.intValue();
//        int count=0;
//        while (sum>0){
//            System.out.println(sum);
//            if(sum%10==0){
//                count++;
//            }
//            sum/=10;
//
//        }

        //System.out.println(count);


    }

    public static java.math.BigInteger factorial(int N) {
        java.math. BigInteger f
                = new java.math.BigInteger("1"); // Or BigInteger.ONE
        for (int i = 1; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));
        return f;
    }


    public static int fact(int A){
        if(A==0) return 1;
        return A*fact(A-1);
    }
}
