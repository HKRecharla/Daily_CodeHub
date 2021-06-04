package maths;

import java.math.BigInteger;

public class Unique_robot {
    public static void main(String[] args) {
        int A=3;
        int B=5;

        ncr(A+B-2, Math.min (A-1, B-1));
    }


    public static int  path(int a, int b){

        if(a==1 || b==1){
            return 1;
        }
         int a_=path(a-1,b);
        int  b_=path(a,b-1);
        int c = a_+b_;
        System.out.println(c);
        return c;
    }

    public static int getUniquePaths(int x, int y, int A, int B) {
        if (x == A || y == B) return 0;
        if (x == A-1 && y == B-1) return 1;
        return getUniquePaths(x+1, y, A, B) + getUniquePaths(x, y+1, A, B);
    }



    private static int ncr(int n, int r) {
        long res = 1;
        int N = n;
        int R = Math.min (r, n-r);
        for ( int i=1; i<=R; i++){
            res*=n;
            n--;
        }
        long res1 = 1;
        for ( int i=1; i<=r; i++){
            res1*=i;
        }
        return (int) (res/res1);
    }
}
