package prblem_solving_2;

import java.util.Arrays;

public class Minimum_Absolute_diff {

    public static void main(String[] args) {

        int[] A={37, 19, 71, 72, 5, 4, 74, 2, 30, 33, 85, 1, 7, 14, 98, 27, 51, 7, 24, 88, 86, 81, 77, 64, 13, 3, 63, 75, 29, 50, 90, 3, 22, 94, 40, 72, 75, 26, 32, 64, 62, 59, 19, 16};
        int a = maxArr(A);
        System.out.println(a);
    }



    public static int maxArr(int[] A) {
        int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            int a=A[i]+i;
            int b=A[i]-i;
            max1=Math.max(max1,a);
            min1=Math.min(min1,a);
            max2=Math.max(max2,b);
            min2=Math.min(min2,b);
        }
        return Math.max((max1-min1),(max2-min2));
    }


    public static void minimum_2(int[] A){

        Arrays.sort(A);

        int l=0;
        int r=A.length-1;
        int min =Integer.MAX_VALUE;

        for (int i = 0; i < r-1; i++) {
            min = Math.min(A[i+1]-A[i],min);
            System.out.println(min);
        }

    }


    public static void minimum(int[] A){

        Arrays.sort(A);

        int l=0;
        int r=A.length-1;
        int min =Integer.MAX_VALUE;
        while (l<r){
            int val = A[r]-A[l];
            min = Math.min(val,min);
            if(A[l] <A[r]) {
                r--;
            }else{
                l++;
            }
            System.out.println(min);
        }

    }
}
