package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Print2DArray {
    private static ArrayList<ArrayList<Integer>> A =null ;

    public static void main(String[] args) {
        int N=3;

      A =  generateSpiral(N);
        print3(A);

    }


    public static ArrayList<ArrayList<Integer>> generateSpiral(int A){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i = 1; i <=A; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>(Collections.nCopies(A, 1));
            res.add(temp);
            System.out.println(temp);
        }
        return res;
    }

    public static void print(ArrayList<ArrayList<Integer>> A){

        int row =A.size();
        int col = A.get(0).size();

        for (int i = row-1; i >=0 ; i--) {
            for (int j = col-1; j >=0; j--) {
                int v = (i+1)-j;
                System.out.println(v);
                if(v<=0){
                    v=0;
                }
                A.get(i).set(j,v);
                System.out.println(A);
            }
        }
        System.out.println(A);

    }

    public static ArrayList<ArrayList<Integer>> print2(ArrayList<ArrayList<Integer>> A){

        int row =A.size();
        int col = A.get(0).size();

        int v =0;
        for (int i = row-1; i >=0 ; i--) {
            int count =1;
            for (int j = col-1; j >=v; j--) {
                A.get(i).set(j,count);
                count++;
            }
            v++;

        }
        //System.out.println(A);
        return A;
    }

    public static ArrayList<ArrayList<Integer>> print3(ArrayList<ArrayList<Integer>> A){


        int r=A.size();
        int c =A.get(0).size();


        for (int i = 0; i <r ; i++) {
            int col = r-1;
            for (int j = 1; j <=i+1; j++) {
                A.get(i).set(col,j);
                col--;
            }
        }
        System.out.println(A);
        return A;
    }


}
