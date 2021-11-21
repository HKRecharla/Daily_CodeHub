package bitwise_operations;

import java.util.Arrays;

public class Element_appear_once {


    /**
     * Find the element that appears once
     * Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3}
     * Output: 2
     * In the given array all element appear three times except 2 which appears once.
     *
     * Input: arr[] = {10, 20, 10, 30, 10, 30, 30}
     * Output: 20
     * In the given array all element appear three times except 20 which appears once.
     * @param args
     */
    public static void main(String[] args) {

        int arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3};
        //1,1,1,2,3,3,3,12,12
        appear(arr);
    }


    public static void appear(int[] A){
        int ans =0;

        for (int i = 0; i < A.length; i++) {
            ans = ans^A[i];
        }

        System.out.println(ans);
    }


    public static void appear2(int[] A){


        Arrays.sort(A);
        int val=0;
        int count=0;

        int fin =0;
        for (int i = 1; i <A.length; i++) {
            int ans =A[val];
            if(ans == A[i]){
                count++;
            }
            if(count>0){
                count=0;
            }else{
                fin =ans;
            }
            val++;
        }

        System.out.println(fin);
    }
}
