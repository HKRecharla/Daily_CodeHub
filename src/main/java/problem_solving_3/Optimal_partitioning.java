package problem_solving_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Optimal_partitioning {
    public static void main(String[] args) {
        int[] a={2, 1, 3, 2, 4, 3};
                //{2, 1, 3, 2, 4, 3};
                //{3, 1, 2, 6, 4};
        //{1,4,5,6,4,3,2,0,1};
        //{2, 1, 6, 4};
        //{648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 207, 368};
        //{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //{648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 207, 368};
        //{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        optimal(list);
    }

    public static void optimal_1(int[] A){

        Arrays.sort(A);
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < A.length-1; i++) {
            int val = A[i+1]-A[i];
            minimum= Math.min(val,minimum);
        }
    }

    public static void optimal(ArrayList<Integer> A){


        //ArrayList<Integer> b = new ArrayList<>();
        //ArrayList<Integer> c = new ArrayList<>();

        Collections.sort(A);

        int len = A.size();
        int mid = 0;
        if(len%2==0){
            mid =(len/2)-1;
        }else {
            mid=len/2;
        }

        int b=A.get(mid+1);//mid+1
        //int b1=A.get(0);//index 0
        //int c1=A.get(mid);//mid-1
        int c=A.get(mid);//len-1



        int abs = Math.abs(b-c);
        System.out.println(abs);






    }
}
