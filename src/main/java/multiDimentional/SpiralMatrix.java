package multiDimentional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpiralMatrix {



    public static void main(String[] args) {

//        List<List<Integer>> A = new ArrayList<>();
//            List<Integer> B= new ArrayList<>();
//            B.add(1);
//            B.add(2);
//            B.add(3);
//            B.add(4);
//            A.add(B);
//            B= new ArrayList<>();
//            B.add(5);
//            B.add(6);
//            B.add(7);
//            B.add(8);
//        A.add(B);
//        B= new ArrayList<>();
//        B.add(9);
//        B.add(10);
//        B.add(11);
//        B.add(12);
//        A.add(B);
//        B= new ArrayList<>();
//        B.add(13);
//        B.add(14);
//        B.add(15);
//        B.add(16);
//        A.add(B);
//
//
//        System.out.println("m length : "+A.size());
//        System.out.println("n length : "+B.size());
//        for (int i = 0; i <A.size() ; i++) {
//            for (int j = 0; j < B.size(); j++) {
//
//                System.out.print(A.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        int N=3;
        ArrayList<ArrayList<Integer>> A = generateSpiral(N);
        int row = A.size();
        int col = A.get(0).size();
        A = spiral2(A,row,col);

        System.out.println(A);
//        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
//        int v=0;
//        for (int i = 0; i <N ; i++) {
//            ArrayList<Integer> b= new ArrayList<>();
//            for (int j = 0; j < N; j++) {
//                b.add(A.get(0).get(v));
//                v++;
//            }
//            a.add(b);
//        }
//        System.out.println(a);

    }

    public static ArrayList<ArrayList<Integer>> spiral(ArrayList<ArrayList<Integer>> A, int n,int m){

        int T =0;
        int R = m-1;
        int B =n-1;
        int L =0;

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        while (L<=R && T<=B){
            ArrayList<Integer> b= new ArrayList<>();
            for (int k = L; k <=R; k++) { //R - L
               b.add( A.get(T).get(k));
                //System.out.print(A.get(T).get(k)+" ");  // T - K
            }
            T++;

            for (int k = T; k <=B; k++) { //T - B
                b.add(A.get(k).get(B));
               // System.out.print(A.get(k).get(B)+" ");  // K - R
            }
            R--;
            for (int k = R; k >=L ; k--) { // R -L
                b.add(A.get(B).get(k));
                //System.out.print(A.get(B).get(k)+" ");  // B - K
            }
            B--;
            for (int k = B; k >=T; k--) { // B - T
                b.add( A.get(k).get(L));
                //System.out.print(A.get(k).get(L)+" ");  // K - L
            }
            a.add(b);
            L++;
        }
    return a;
    }


    public static ArrayList<ArrayList<Integer>> spiral2(ArrayList<ArrayList<Integer>> A, int n,int m){

        int T =0;
        int R = m-1;
        int B =n-1;
        int L =0;

        int i =1;
        while (L<=R && T<=B){
            ArrayList<Integer> b= new ArrayList<>();
            for (int k = L; k <=R; k++) { //R - L
                A.get(T).set(k,i);
                //System.out.print(A.get(T).get(k)+" ");  // T - K
                i++;
            }
            T++;

            for (int k = T; k <=B; k++) { //T - B
                A.get(k).set(B,i);
                i++;
                // System.out.print(A.get(k).get(B)+" ");  // K - R
            }
            R--;
            for (int k = R; k >=L ; k--) { // R -L
                A.get(B).set(k,i);
                i++;
                //System.out.print(A.get(B).get(k)+" ");  // B - K
            }
            B--;
            for (int k = B; k >=T; k--) { // B - T
               A.get(k).set(L,i);
                //System.out.print(A.get(k).get(L)+" ");  // K - L
                i++;
            }
            L++;
        }
        return A;
    }


    public static ArrayList<ArrayList<Integer>> generateSpiral(int A){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i = 1; i <=A; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>(Collections.nCopies(A, 0));
            res.add(temp);
            //System.out.println(temp);
           // System.out.println();
        }
        return res;
    }

    public static ArrayList<ArrayList<Integer>> generateNum(int a){
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        int v=1;
        for (int i = 0; i < a; i++) {
            ArrayList<Integer> B= new ArrayList<>();
            for (int j = 0; j < a; j++) {
                B.add(v);
                v++;
            }
         A.add(B);
        }
        //System.out.println(A);

        return A;
    }

}
