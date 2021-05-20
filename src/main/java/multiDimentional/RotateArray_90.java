package multiDimentional;

import java.util.ArrayList;
import java.util.List;

public class RotateArray_90 {
    public static void main(String[] args) {
        List<List<Integer>> A = new ArrayList<>();
        List<Integer> B= new ArrayList<>();
        B.add(1);
        B.add(2);
        //B.add(3);

        A.add(B);
        B= new ArrayList<>();
        B.add(3);
        B.add(4);
        //B.add(6);


        A.add(B);
//        B= new ArrayList<>();
//        B.add(7);
//        B.add(8);
//        B.add(9);
//
//        A.add(B);
//        B= new ArrayList<>();
//        B.add(10);
//        B.add(11);
//        B.add(12);
//        B.add(13);
//        B.add(14);
//        B.add(15);
//        B.add(16);
//        A.add(B);


        System.out.println("row length : "+A.size());
        System.out.println("col length : "+B.size());

        rotate(A,A.size(),B.size());
    }


    public static void rotate(List<List<Integer>> A, int row, int col){

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(j>i){
                    int temp = A.get(i).get(j);
                    A.get(i).set(j,A.get(j).get(i));
                    A.get(j).set(i,temp);

                }
            }
            //System.out.print(A.get(i)+" ");
        }

        for (int i = 0; i < row; i++) {
            List<Integer> a = reverse(A.get(i), 0, col - 1);
        }


        for (int i = 0; i < row; i++) {
            System.out.print("[");
            for (int j = 0; j < col; j++) {
                System.out.print(A.get(i).get(j)+" ");
            }
            System.out.print(" ] ");
        }

    }

    public static List<Integer> reverse(List<Integer> a, int l,int r ){
        while (l<r){
            int temp = a.get(l);
            a.set(l,a.get(r));
            a.set(r,temp);
            //System.out.print(a.get(l)+" "+a.get(r));
            l++;
            r--;
        }
        return a;
    }

}
