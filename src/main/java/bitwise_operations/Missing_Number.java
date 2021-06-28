package bitwise_operations;

import java.util.Arrays;

public class Missing_Number {

    public static void main(String[] args) {

        int[] A= {3, 4, -1, 1};
        int ans = firstMissingPositive(A);
        System.out.println(ans);
    }


    public static void missing(int[] A){
        int ans =0;
        for (int i = 0; i < A.length-1; i++) {
            ans = ans^A[i]^A[i+1];
        }
        System.out.println(ans^A.length);
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
