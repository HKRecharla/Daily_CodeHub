package sorting;

import java.util.Arrays;

public class Wave_Sorting {


    public static void main(String[] args) {

        int[] A= {1, 2, 3, 4,5,6,7,8,9,10,11};
        int len = A.length;
        Arrays.sort(A);
        int[] a = new int[len];
        for (int i = 0; i < len; i=i+2) {
            if(i!=len-1){
                A = swap(A,i,i+1);
                a[i]=A[i];
                a[i+1]=A[i+1];
            }

        }
        a[len-1]=A[len-1];

        for (int i = 0; i < A.length; i++) {
            System.out.print(a[i]+" ");
        }
        

    }

    public static int[] swap(int[] A,int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] =temp;
        return A;
    }
}
