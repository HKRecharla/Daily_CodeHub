package bit_manuplication_2;

import java.util.Arrays;

public class Single_2 {

    public static void main(String[] args) {
        int[] A={1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        Arrays.sort(A);
        int res = non_dup(A);
        System.out.println(res);
    }

    public static int non_dup(int[] A){

        int len = A.length;
        if(len==1) return A[0];
        if(A[0]!=A[1]) return A[0];

        for (int i = 0; i <=len-3; i+=3) {
            if(A[i]!=A[i+2]){
                return A[i];
            }
        }

        return A[len-1];
    }
}
