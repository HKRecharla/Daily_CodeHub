package problem_solving_6;

import java.util.ArrayList;

public class Pascal_triangle {
    public static void main(String[] args) {
        int A=2;
        ArrayList<Integer> a = getRow(A+1);
        System.out.println(a);
    }

    public static ArrayList<Integer> getRow(int A) {

        ArrayList<ArrayList<Integer>> N = generateSpiral(A);

        for (int i = 2; i < N.size(); i++) {
            for (int j = 0; j < i - 1; j++) {

                int val = N.get(i - 1).get(j) + N.get(i - 1).get(j + 1);

                N.get(i).set(j+1,val);
            }
        }
        return N.get(A-1);
    }


    public static ArrayList<ArrayList<Integer>> generateSpiral(int A){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        for (int i = 1; i <=A ; i++) {
            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                array.add(1);
            }
            res.add(array);
        }

        System.out.println(res);
        return res;
    }


}
