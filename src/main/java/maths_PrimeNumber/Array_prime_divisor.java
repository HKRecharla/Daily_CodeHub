package maths_PrimeNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array_prime_divisor {
    public static void main(String[] args) {

        int[] A={864, 94, 174, 797, 651, 605, 99, 203, 558, 395, 14, 120, 213, 235, 659, 342, 316, 135, 741, 286, 109, 200, 209, 32, 476, 468, 194, 284, 273, 784, 344, 945, 386, 549, 523, 633, 808, 609, 83, 54, 217, 683, 315, 88, 787, 3, 123, 494, 833, 668, 205, 588, 329};
                //{376, 243, 675, 491, 639, 495, 177, 209, 430, 609, 919, 137, 254, 859, 310, 359, 265, 714, 275, 287, 80, 88, 862, 148, 909, 858, 720, 345, 653, 818, 719, 830, 917, 40, 506, 565, 585, 908, 680, 468, 139, 117, 798, 106, 49, 266, 161, 89, 221, 767, 533, 637, 186, 971};
        int B=744;
                //528;
        prime_divisor(A,B);
    }

public static void prime_divisor(int[] A,int B){
    Arrays.sort(A);
    for (int i = 0; i < A.length; i++) {
        System.out.print(A[i]+" ");
    }
    HashMap<Integer,Integer> map = divisor_of_num(B);
    int count=0;
    System.out.println();
    System.out.println(map);
    for (int i = 0; i < A.length; i++) {
        if(map.containsKey(A[i])) count++;
    }
}

    //divisor of a number
    public static HashMap<Integer,Integer> divisor_of_num(int A){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 2; i*i<=A; i++) {
            while (A%i==0){
                map.put(i,0);
                A/=i;
            }
        }
        return map;
    }
}
