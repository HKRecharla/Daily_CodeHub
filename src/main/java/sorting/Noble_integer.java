package sorting;

import java.util.Arrays;

public class Noble_integer {

    public static void main(String[] args) {
        int[] A ={1,2,3,4};
        int p= 3;

        Arrays.sort(A);
        for (int i = 0; i < A.length-1; i++) {
            if(A[i]==A[i+1]){
                continue;
            }else if(A[i] == A.length-i-1){
                System.out.println(A[i]);
            }
        }

    }
}
