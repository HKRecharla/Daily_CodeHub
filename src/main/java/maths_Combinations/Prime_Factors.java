package maths_Combinations;

import java.util.ArrayList;

public class Prime_Factors {

    public static void main(String[] args) {
        prime(10);
    }

    public static int[] prime(int A){

        Boolean[] a = new Boolean[A];
        for (int i = 0; i < A; i++) {
            a[i]=true;
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 2; i < A; i++) {
            ArrayList<Integer> sList = new ArrayList<>();
            if(a[i] ==true){
                for (int j = i; j*i <A ; j++) {
                    a[i*j] = false;
                    sList.add(j);
                }
            }
            list.add(sList);
        }

        System.out.println(list);
        return null;
    }
}
