package hashing;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hash_2_Sum {

    public static void main(String[] args) {

        int[] A = { 10, 2, -2, -20, 10 };
        // {-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1,
        // -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9,
        // 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3};
        // {4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3,
        // -3, -5, 4, -7, 7, 9, -4, 4, -8};
        int B = -10;
        solve_hash(A, B);

        // 128436
    }

    public static void solve_hash(int[] A, int k) {
        int[] ar = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            int val = k - A[i];
            if (map.containsKey(val)) {
                int f = map.get(val) + val;
                if (f == k) {
                    ar[1] = map.get(val);
                    ar[0] = val;
                    break;
                }
            } else {
                map.put(A[i], val);
            }
        }
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == ar[0]) {
                ar[0] = i + 1;
                System.out.println(ar[0]);

                break;
            }
        }
        for (int i = ar[0]; i < A.length; i++) {
            if (A[i] == ar[1]) {
                ar[1] = i + 1;
                System.out.println(ar[1]);
                break;
            }
        }

    }

    public static void sum(int[] A, int B) {

        int[] ar = new int[2];
        boolean flag = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                System.out.println(A[i] + "  " + A[j]);
                if ((A[i] + A[j]) == B) {
                    ar[0] = i + 1;
                    ar[1] = j + 1;
                    flag = false;
                    break;
                }
            }
            if (flag == false) {
                break;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }

    }

    public static void sum2(int[] A, int B) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int min = A[0];
        int[] a = new int[2];
        // for (int i = 0; i < A.length; i++) {
        // map.put(A[i],0);
        // }

        for (int i = 0; i < A.length; i++) {
            int val = B - A[i];
            if (map.containsKey(val)) {
                map.put(A[i], i);
            } else {

                a[0] = map.get(val) + 1;
                a[1] = i + 1;
                System.out.println(a[0] + " " + a[1]);
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
