package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Pascal {

    public static void main(String[] args) {


        int A=5;
        solve(A);

    }

    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> N = generateSpiral(A);

        for(int i=2;i<N.size();i++){
            for(int j=0;j<i-1;j++){

                int val = N.get(i-1).get(j)+N.get(i-1).get(j+1);
                N.get(i).set(j+1,val);
            }
        }
        System.out.println(N);
        return N;

    }

    public static ArrayList<ArrayList<Integer>> generateSpiral(int A){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i = 1; i <=A; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                a.add(1);
            }
            res.add(a);
        }
        //System.out.println(res);
        return res;
    }
}
