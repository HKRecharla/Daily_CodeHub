package multiDimentional;

import java.util.ArrayList;
import java.util.Collections;

public class Spriral2 {


    public static void main(String[] args) {
        int A =3;
        ArrayList<ArrayList<Integer>> a = generateMatrix(A);
        System.out.println(a);
    }


    public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i = 1; i <=A; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>(Collections.nCopies(A, 0));
            res.add(temp);
            System.out.println(temp);
            System.out.println();
        }

        int j= 0;
        int k=0;

        int limit = A*A;
        int n =1;
        int start =0;
        int end = A;

        String dir ="R";

        while (n <= limit) {
            if ("R".equals(dir)) {
                while (k<end && n<=limit) {
                    res.get(j).set(k, n);
                    n++;
                    k++;
                }
                j++;
                k--;
                dir ="D";
            }else if("D".equals(dir)) {
                while (j < end && n <= limit) {
                    res.get(j).set(k, n);
                    n++;
                    j++;
                }
                k--;
                j--;
                dir = "L";
                end--;
            }else if ("L".equals(dir)) {
                while (k >= start && n <= limit) {
                    res.get(j).set(k,n);
                    n++;
                    k--;
                }
                k++;
                j--;
                dir = "U";
                start++;
            }
            else if ("U".equals(dir)) {
                while (j >= start && n <= limit) {
                    res.get(j).set(k, n);
                    j--;
                    n++;
                }
                j++;
                k++;
                dir = "R";
            }
        }


        return res;
    }
}
