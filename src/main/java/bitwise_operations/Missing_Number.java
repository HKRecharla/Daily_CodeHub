package bitwise_operations;

import java.util.Arrays;

public class Missing_Number {

    public static void main(String[] args) {
        int n=00000000000000000000000000001011;
        int[] A= {5,6,7,1,3,4};
        missing(A);
        System.out.println(A);
    }


    public static void missing(int[] A){
        int ans =A[0];
        int x2=0;
        for (int i = 1; i < A.length; i++) {
            ans = ans^A[i];
        }

        for (int i = 2; i <=A.length+1; i++) {
            x2=x2^i;
        }

        System.out.println(ans^x2);
    }


    public static void duplicate(int[] A){
        int ans =0;
        for (int i = 0; i < A.length; i++) {
            ans = ans^A[i];
        }
        System.out.println(ans);
    }

    public static  int firstMissingPositive(int[] A) {
        Arrays.sort(A);
        int ans=0;
        for(int i=0;i<A.length-1;i++){
            if(A[i]>0 && A[i+1]>0){
                ans = ans^A[i]^A[i+1];
            }

        }
        return ans;
    }
}
