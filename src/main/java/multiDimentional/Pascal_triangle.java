package multiDimentional;

import java.util.ArrayList;

public class Pascal_triangle {


    public static void main(String[] args) {

        int N=4;
        pascal2(N);
    }



    public static ArrayList<ArrayList<Integer>> pascal2(int N) {


        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        int C=1;
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> a = new ArrayList<>(C);
            int v=0;
            if(a.size()==0){
                a.add(1);
            }
            if(i==1){
                a.add(1);
            }
            if(i>1){
                int L=0;
                int R=C;
                for (int j = 1; j < C-1; j++) {
                    while (L <= C) {
                        int s = A.get(i - 1).get(L) + A.get(i - 1).get(L + 1);
                        int x = A.get(i - 1).get(R - 2);
                        int y = A.get(i - 1).get(R - 2);
                        int end = x + y;
                        A.get(L + 1).set(L, s);
                        A.get(L + 1).set(R - 2, end);

                    }
//                for (int j = 1; j < C-1; j++) {
//                    if(j-1>=0){
//                        v=a.get(j-1);
//                    }
//                    a.add(v+A.get(i-1).get(j));
//
//                }
                    L++;
                    R--;
                    a.add(1);
                    C++;
                    v=0;
                }
            }

            System.out.println(a);


            A.add(a);
        }

        System.out.println(A);

        return A;
    }

    public static ArrayList<ArrayList<Integer>> pascal(int N){


        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

//        if(N==1){
//            ArrayList<Integer> a = new ArrayList<>();
//            a.add(1);
//            A.add(a);
//            System.out.println(A);
//            return A;
//        }
//        if(N==2){
//            ArrayList<Integer> a = new ArrayList<>();
//            a.add(1);
//            a.add(1);
//            A.add(a);
//            System.out.println(A);
//            return A;
//        }
        int val =1;
        int C=1;
        for (int i = 1; i < N; i++) {
            ArrayList<Integer> a = new ArrayList<>();

            for (int j = 1; j < C+1; j++) {
                a.set(0,1);
                a.set(C,1);
                int start = A.get(i-1).get(j-1);
                int next = A.get(i-1).get(j);
                a.set(j,start+next);
            }
            C++;
            A.add(a);
        }

        System.out.println(A);
        return A;
    }


}
