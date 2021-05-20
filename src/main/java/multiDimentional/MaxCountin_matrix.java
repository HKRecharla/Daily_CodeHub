package multiDimentional;

import java.util.ArrayList;
import java.util.List;

public class MaxCountin_matrix {

    public static void main(String[] args) {

        int [][] F ={
                {0, 0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 1, 1}};

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for (int i = 0; i < F.length; i++) {
            ArrayList<Integer> B= new ArrayList<>();
            for (int j = 0; j < F[0].length; j++) {
                B.add(F[i][j]);
            }
            A.add(B);
        }

//        ArrayList<Integer> B= new ArrayList<>();
//        B.add(0);
//        B.add(0);
//        B.add(1);
//        B.add(1);
//        B.add(1);
//        A.add(B);
//
//        B= new ArrayList<>();
//        B.add(0);
//        B.add(0);
//        B.add(0);
//        B.add(1);
//        B.add(1);
//        A.add(B);
//
//        B= new ArrayList<>();
//        B.add(0);
//        B.add(0);
//        B.add(0);
//        B.add(1);
//        B.add(1);
//        A.add(B);
//
//        B= new ArrayList<>();
//        B.add(0);
//        B.add(0);
//        B.add(0);
//        B.add(0);
//        B.add(1);
//        A.add(B);
//        B= new ArrayList<>();
//        B.add(0);
//        B.add(0);
//        B.add(0);
//        B.add(0);
//        B.add(1);
//        B.add(1);
//        A.add(B);


        System.out.println(A);
        System.out.println("row length : "+A.size());
        System.out.println("col length : "+A.get(0).size());

        count_down_wise(A,A.get(0).size());
        //count_row_wise(A,A.size(),B.size());
    }


    public static int count_row_wise(ArrayList<ArrayList<Integer>> A,int row, int col){

        int max=0;
        int rowno=0;
        for (int i = 0; i < row; i++) {
            int co =0;
            for (int j = 0; j < col; j++) {
                co = co+A.get(i).get(j);
            }


            max = Math.max(max,co);
            if(max==co){
                rowno =i+1;
            }

        }
        System.out.println(rowno);
        return rowno;

    }


    public static void count_col_wise(ArrayList<ArrayList<Integer>> A,int row, int col){

        int max=0;
        int rowno=0;
        for (int i = 0; i < col; i++) {
            int co =0;
            for (int j = 0; j < row; j++) {
                co = A.get(i).get(j);
                if(co ==1){
                    rowno= i+1;
                    break;
                }
            }
        }
        System.out.println(rowno);

    }
    public static int count_down_wise(ArrayList<ArrayList<Integer>> A,int col){


        int c=0;
        int r=0;
        int rowno=0;
        for (int i = 0; i < col; i++) {
            if(A.get(0).get(i) ==1){
                c = i;
                rowno=0;
                break;
            }else{
                c=i;
            }
        }
        r++;

        int count =c;

        while (true){
            if(A.get(r).get(c)==1){
                if(c<count){
                    rowno =r;
                }
                c--;
                if(c<0){
                    break;
                }
            }else {
                r++;
                //System.out.println(r);
                if(r>=col){
                    break;
                }
            }

        }

       // System.out.println(rowno);
        return rowno;
    }



}
