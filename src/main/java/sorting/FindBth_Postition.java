package sorting;

import java.util.Arrays;

public class FindBth_Postition {


    public static void main(String[] args) {
        int[] A={8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92};
        int B=9;

        Arrays.sort(A);
        System.out.println(A[B-1]+" ");
        sort(A);

    }


    public static int[] sort(int[] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if(A[j]<A[i]){
                    int temp  =A[j];
                    A[j]=A[i];
                    A[i]=temp;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        return A;
    }
}
