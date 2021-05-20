package problem_solving;

import java.util.Arrays;

public class Similar_Max {


    public static void main(String[] args) {
        int[] A ={  947, 871, 859, 471, 763, 766, 379, 746, 485, 966, 10, 350, 341, 22, 706, 702, 717, 967, 641, 712, 10, 954, 751, 250, 777, 214, 820, 276, 708, 509, 123, 73, 593, 790, 797, 678, 320, 865, 392, 428, 611, 813, 655, 195, 102, 902, 919, 171, 706, 841, 873, 98, 128, 728, 878, 701, 874, 158, 548, 214, 414, 600, 869, 936, 841, 221, 87, 255, 233, 627, 487, 53, 270, 162, 517, 576, 240, 681, 172, 148, 86, 778, 205, 741, 483, 11, 795, 188, 450 };
      //  int[] A={1,2,3};

        System.out.println(A.length);

        int size = A.length;
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        int min = A[0];
        int max = A[size-1];

        int count =0;
        for (int i = 0; i < size; i++) {
            if(A[i] != min && A[i] != max){
                count++;
            }
        }

        System.out.println(count);



    }

}
