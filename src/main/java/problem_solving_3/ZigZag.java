package problem_solving_3;

import java.util.Arrays;

public class ZigZag {

    public static void main(String[] args) {

        int[] A={759, 106, 827, 279, 722, 954, 80, 577, 273, 538, 963, 296, 693, 694, 684, 406, 603, 192, 166, 233, 310, 969, 980, 36, 322, 409, 392, 824, 422, 729, 76, 532, 186, 902, 811, 907, 855};
                //{66, 23, 687, 252, 187, 114, 789, 527, 129, 474, 679, 119, 687, 92, 578, 332, 781, 499, 597, 370, 848, 248, 496, 641, 714, 572, 399, 187, 910, 638, 100, 975, 660, 786, 227, 198, 252, 367, 725};
        int B=16;
                //29;
        int v = solve(A,B);
        System.out.println(v);
    }

    public static int solve(int[] A, int B) {

        if(B==1){
            return 0;
        }
        int len = A.length;
        Arrays.sort(A);
        for (int i = 0; i < len; i++) {
            System.out.print(A[i]+" ");
        }
        int sum =A[len-1];
        for(int i=0;i<len-B+1;i++){
            int a = A[i];
            int b = A[i+B-1];
            System.out.println(a+"-"+b+" -->"+(a-b));
            sum = Math.min(sum,Math.abs(a-b));
        }

        return sum;

    }
}
