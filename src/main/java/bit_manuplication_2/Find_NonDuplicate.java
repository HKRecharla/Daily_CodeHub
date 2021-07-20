package bit_manuplication_2;

import java.util.Arrays;

public class Find_NonDuplicate {
    public static void main(String[] args) {

        int[] A={1,2,2,3,1};
        non_dup(A);
    }

    public static void non_dup(int[] A){
        int len = A.length;
        Arrays.sort(A);
        int num =0;
        for (int i = 0; i < len; i++) {
            num = num^A[i];
        }
        System.out.println(num);
    }
}
