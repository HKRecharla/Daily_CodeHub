package arrays;

import java.util.Arrays;

public class Time_to_equality {

    public static void main(String[] args) {

        int[] A={2, 4, 1, 3, 2};
        time(A);
    }


    public static void time(int[] A){

        Arrays.sort(A);
        int len= A.length;
        int max= A[len-1];
        int min=0;
        for (int i = 0; i < len-1; i++) {
            min = min+(max-A[i]);
        }
        System.out.println(min);
    }
}
