package sampleInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class Pairs {


    public static void main(String[] args) {
        int[] A = {2, 3, 11, 19, 4, 9, 6, 12, 8};
        int K=10;
        Arrays.sort(A);
        ArrayList<Integer> res = solve(A, K);
        System.out.println(res);

    }


    public static ArrayList<Integer> solve(int[] A, int K){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int len = A.length;
        int[] pr = new int[len];
        pr[0]=A[0];
        for (int i = 1; i <len ; i++) {
            pr[i]=pr[i-1]+A[i];
        }

        for (int i = 0; i < pr.length; i++) {
            System.out.print(pr[i]+" ");
        }
        int ref = pr[1];
        for (int i = 2; i <len; i++) {
                if(ref==K){
                    arr.add(A[i]);
                }
            ref =pr[i]-pr[i-2];
        }
        return arr;
    }
}
