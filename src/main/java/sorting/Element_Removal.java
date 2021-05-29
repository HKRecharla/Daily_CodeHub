package sorting;

import java.util.Arrays;

public class Element_Removal {

    public static void main(String[] args) {

        int[] A={8, 0, 10};
        int len = A.length;

        Arrays.sort(A);
        int max = len;
        int sum=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<max;j++){
                sum = sum +A[j];
            }
            max--;
        }

        System.out.println(sum);
    }
}
