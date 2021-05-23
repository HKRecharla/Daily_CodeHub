package hashing;

import java.util.HashMap;
import java.util.Map;

public class Minimum {

    public static void main(String[] args) {
        int[] A = { 9, 1, 3, 2, 4, 5, 7, 8 };
        hash(A);
        int min1 = min1(A);
        min2(A, min1);
    }

    public static void hash(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], 0);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static int min1(int[] A) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            min = Math.min(min, A[i]);
        }

        System.out.println("Minimum 1 :: " + min);
        return min;
    }

    public static void min2(int[] A, int min1) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (min == min1) { // min1=1 ,
                // 9, 1, 3, 2, 4, 5, 7, 8
                continue;
            } else {
                min = Math.min(min, A[i]);
            }
        }
        System.out.println("minimum 2 :: " + min);
    }

}