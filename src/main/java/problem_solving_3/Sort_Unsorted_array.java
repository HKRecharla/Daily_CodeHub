package problem_solving_3;

import java.util.Arrays;

public class Sort_Unsorted_array {

    public static void main(String[] args) {

        int[] A={-146316343, 179840175, 760528516};
                //{0, 1, 15, 25, 6, 7, 30, 40, 50};
        sort(A);
    }

    public static void sort(int[] A){

        int indexa =0;
        int indexb =0;
        int len= A.length;

        int[] a= new int[len];
        for (int i = 0; i < len; i++) {
            a[i]=A[i];
        }
        Arrays.sort(A);

        for (int i = 0; i < len; i++) {
            if(a[i]!=A[i]){
                indexa=i;
                break;
            }

        }
        for (int i = len-1; i >=0 ; i--) {
            if(a[i] != A[i]){
                indexb=i;
                break;
            }
        }


        int sum = indexb-indexa;
        System.out.println(sum+1);



    }
}
