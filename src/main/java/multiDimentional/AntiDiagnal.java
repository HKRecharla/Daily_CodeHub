package multiDimentional;

import java.util.ArrayList;
import java.util.List;

public class AntiDiagnal {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> B= new ArrayList<>();
            B.add(3);
            B.add(7);
            B.add(7);
            B.add(1);
            A.add(B);
            B= new ArrayList<>();
            B.add(8);
            B.add(4);
            B.add(15);
            B.add(1);
            A.add(B);
            B= new ArrayList<>();
            B.add(13);
            B.add(5);
            B.add(8);
            B.add(5);
            A.add(B);
            B= new ArrayList<>();
            B.add(11);
            B.add(6);
            B.add(8);
            B.add(7);
            A.add(B);

        System.out.println("row length : "+A.size());
        System.out.println("col length : "+B.size());

        //rotate(A,A.size(),B.size());
        ArrayList<ArrayList<Integer>> a = anti(A);
        ArrayList<ArrayList<Integer>> b =anti2(A);
        for (int i = 0; i < b.size(); i++) {
            a.add(b.get(i));
        }


        System.out.println(a);
    }


    public static ArrayList<ArrayList<Integer>> anti(ArrayList<ArrayList<Integer>> A){
        boolean flag = true;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int point =0;
        int end =1;
        while (end<=A.size()){
            point =end-1;
            ArrayList<Integer> array = new ArrayList<>();
            for (int i = 0; i < end; i++) {
                array.add(A.get(i).get(point));
                point--;
            }
            list.add(array);
            end++;
        }
        return list;
    }

    public static ArrayList<ArrayList<Integer>> anti2(ArrayList<ArrayList<Integer>> A){
        boolean flag = true;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int point =0;
        int end =A.size()-1;
        int start=1;
        int count=1;
        while (end>0){
            point =A.size()-1;
            ArrayList<Integer> array = new ArrayList<>();
            for (int i = 0; i < end; i++) {
                array.add(A.get(start).get(point));
                point--;
                start++;
            }
            list.add(array);
            end--;
            count++;
            start=count;

        }
        return list;
    }






    public static List<List<Integer>> disgnsl(List<List<Integer>> A, int n,int m){
        int T =0;
        int R = m-1;
        int B =n-1;
        int L =0;
        List<List<Integer>> a = new ArrayList<>();
        while (L<=R && T<=B) {
            List<Integer> b = new ArrayList<>();
            for (int k = L; k <= R; k++) { //R - L
                b.add(A.get(T).get(k));
                System.out.print(A.get(T).get(k)+" ");  // T - K
            }
            T++;

            for (int k = T; k <= B; k++) { //T - B
                b.add(A.get(k).get(B));
                 System.out.print(A.get(k).get(B)+" ");  // K - R
            }
            a.add(b);
            R--;
        }
        System.out.println(a);
        return a;
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
           // System.out.print(A.get(i)+" ");
        }

//        for (int i = 0; i < row; i++) {
//            List<Integer> a = reverse(A.get(i), 0, col - 1);
//        }


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
