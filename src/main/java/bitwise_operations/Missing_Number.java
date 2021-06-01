package bitwise_operations;

public class Missing_Number {

    public static void main(String[] args) {

        int[] A= {1,1,2,2,3,4,4};
        duplicate(A);
    }


    public static void missing(int[] A){
        int ans =0;
        for (int i = 0; i < A.length-1; i++) {
            ans = ans^A[i]^(i+1);
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
}
