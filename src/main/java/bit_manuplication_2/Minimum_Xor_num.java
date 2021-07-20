package bit_manuplication_2;

import java.util.Arrays;

public class Minimum_Xor_num {

    public static void main(String[] args) {

        int[] A={15, 5, 1, 10, 2};
        Arrays.sort(A);
        for (int i = 0; i <A.length-1 ; i++) {
            System.out.println(A[i]^A[i+1]);
        }
    }


    public static void min_Xor(int[] A){



    }
}
