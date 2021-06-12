package problem_solving_3;

import java.util.Arrays;

public class Maximum_Difference {

    public static void main(String[] args) {

        int[] A={1,3,2,5,7};
        max_min_1(A);
    }

    public static void max_min_1(int[] A){
        int MOD = 1000000007;
        long sum =0;

        Arrays.sort(A);

        long min=0;
        long max=0;
        for (int i = 0; i < A.length; i++) {
            max=2*max+A[A.length-1-i]%MOD;
            min=2*min+A[i]%MOD;
        }
         sum = (max-min)%MOD;
        System.out.println(sum);
    }


    public static void max_min(int[] A){
        long sum =0;

        Arrays.sort(A);
        long max=0l;
        long min=0l;
        int temp = ((int)power(2,0));
        for (int i = 0; i < A.length; i++) {
            long a =(temp%1000000007)*A[i]%1000000007;
            max+=a;
            temp=temp*2;
        }

        int tempb = ((int)power(2,0));
        for (int i = A.length-1; i >=0 ; i--) {
            min+=(tempb%1000000007)*(A[i]%1000000007);
            tempb=tempb*2;
        }
        sum =(max-min)%1000000007;

        System.out.println(sum);

    }
    public static int power1(int x, int y){
        int temp = power(x,y/2);
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return temp%1000000007 * temp%1000000007;
        else
            return x * temp%1000000007 * temp%1000000007;
    }


    public static int power(int x, int y)
    {
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return power(x, y / 2)%1000000007 * power(x, y / 2)%1000000007;
        else
            return x * power(x, y / 2)%1000000007 * power(x, y / 2)%1000000007;
    }

    public static void max(int[] A){
        long sum =0;

        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            sum+=((A[i]%1000000007)*(Math.pow(2,i)%1000000007))-((A[i]%1000000007)*(Math.pow(2,A.length-i-1)%1000000007));

        }
        System.out.println(sum);

    }
}
