package maths;

import java.util.Arrays;

public class NextPermutation {


    public static void main(String[] args) {

    }


    public static int[] next(int[] A){

        int len = A.length;
        Boolean flag =false;
        for (int i = 0; i < len-1; i++) {
            if(A[i]>A[i-1]){
                flag=true;
                continue;
            }else {
                flag=false;
                break;
            }
        }

        if(!flag){
            Arrays.sort(A);
            System.out.println("return");
            return A;
        }


        int greater =0;
        for (int i = len-1; i>=0 ; i--) {
            if(A[i] < A[i-1]){
                greater=A[i-1];
            }else{

            }
        }





        return null;
    }
}
