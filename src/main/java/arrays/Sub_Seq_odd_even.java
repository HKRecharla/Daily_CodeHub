package arrays;

import java.util.Arrays;

public class Sub_Seq_odd_even {

    public static void main(String[] args) {
        int[] A = {12, 10, 28, 37, 43, 40, 14, 12, 48};
        odd_even(A);
    }

    public static void odd_even(int[] A){

        //Arrays.sort(A);
        int len =A.length;
        int l=0;
        int r = len-1;


        String temp = "";
        if(A[l]%2==0){
            temp="even";
        }else{
            temp="odd";
        }
        int count =1;
        while (l<r){
            l++;
           if(A[l]%2!=0 && temp.equals("even")){
               count++;
               temp="odd";
           }else if(A[l]%2==0 && temp.equals("odd")){
               count++;
               temp="even";
           }

        }
        System.out.println(count);
    }
}
