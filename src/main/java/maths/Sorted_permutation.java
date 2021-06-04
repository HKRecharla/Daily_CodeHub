package maths;

import java.util.Arrays;

public class Sorted_permutation {

    public static void main(String[] args) {

        String A = "acb";
        permu(A);
    }


    public static void permu(String A){

        int len = A.length();
        int[] a = new int[len];

        for (int i = 0; i < a.length; i++) {
           a[i] = A.charAt(i)-'a'+1;
        }
        int count =0;
        int n=len;
        Arrays.sort(a);
        for (int i = 0; i < a.length-1; i++) {
            if(a[i] ==i+1){
            }
        }
        System.out.println(count);
    }


    public static int fact(int a){
        if(a<=0){
            return 1;
        }
        return a*fact(a-1);
    }

}
