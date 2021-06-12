package problem_solving_3;

import java.util.Arrays;

public class Minimum_Difference {

    public static void main(String[] args) {

        int[] A={66, 23, 687, 252, 187, 114, 789, 527, 129, 474, 679, 119, 687, 92, 578, 332, 781, 499, 597, 370, 848, 248, 496, 641, 714, 572, 399, 187, 910, 638, 100, 975, 660, 786, 227, 198, 252, 367, 725};
        int B=29;
        solve(A,B);
    }

    public static int solve(int[] A, int B) {

        if(B==1){
            return 0;
        }
        int len = A.length;
        int[] a =  new int[B];
        for(int i=0;i<B;i++){
            a[i] = A[i];
            System.out.print(a[i]+" ");
        }
        Arrays.sort(a);
        System.out.println();
        for (int i = 0; i < B; i++) {
            System.out.print(a[i]+" ");
        }
        int sum= a[B-1]-a[0];
        System.out.println(""+a[B-1]+" "+a[0]);
        return sum;

    }
}
