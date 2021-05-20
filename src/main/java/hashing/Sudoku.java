package hashing;

import java.util.HashMap;

public class Sudoku {

    public static void main(String[] args) {

        String[] A ={"....5..1.", ".4.3.....", ".....3..1", "8......2.", "..2.7....", ".15......", ".....2...", ".2.9.....", "..4......" };

                //{"..5.....6", "....14...", ".........", ".....92..", "5....2...", ".......3.", "...54....", "3.....42.", "...27.6.."};

                //{"....5..1.", ".4.3.....", ".....3..1", "8......2.", "..2.7....", ".15......", ".....2...", ".2.9.....", "..4......" };
        //{"..5.....6", "....14...", ".........", ".....92..", "5....2...", ".......3.", "...54....", "3.....42.", "...27.6.."};
        //
                //{"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
        blocks(A);

    }

    public static void splitA(String[] A){
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                A[i].charAt(j);
            }
        }
    }


    static int zero=0;
    public static void blocks(String[] A){
        //c0,c1,c2

        //0,1,2
        //0,1,2
        //0,1,2

        int len = A[0].length();
        int[][] r = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(A[i].charAt(j) !='.'){
                    char d = A[i].charAt(j);
                    r[i][j] =Integer.parseInt(String.valueOf(A[i].charAt(j)));
                }else{
                    r[i][j] =0;
                }
            }
        }

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r.length; j++) {
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }

        /**
         * 530070000
         * 600195000
         * 098000060
         * 800060003
         * 400803001
         * 700020006
         * 060000280
         * 000419005
         * 000080079
         */

        int res=0;
        res = col_block(r);
        res = row_compare(r);
        res = col_compare(r);

        System.out.println(res);
    }


    public static int block(int[][] A,int rstart,int rend, int cstart,int cend){

        //System.out.println("starting block wise");
        //rstart=0;
        //rend =3
        //cstart=0
        //cend =3
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean flag = true;
        for (int i = rstart; i < rend; i++) {
            for (int j = cstart; j < cend; j++) {
                if(A[i][j]>0){
                    if(map.containsKey(A[i][j])){
                        int val = map.get(A[i][j]);
                        map.put(A[i][j],val+1);
                        if(map.get(A[i][j]) >1){
                            //System.out.println("values are repeated "+A[i][j]);
                            return zero;
                        }
                    }else{
                        map.put(A[i][j],1);
                    }
                }
            }
        }
        return 1;
    }


    public static int row_block(int[][]A, int rstart, int rend){
        //System.out.println("Starting row wise");
        int cstart=0;
        int cend=3;
        boolean flag = true;
        int va=1;
        for (int i = 0; i < 3; i++) {
             va = block(A,rstart,rend,cstart,cend);
            if(va==0){
                return zero;
            }
            cstart =cend;
            cend=cend+3;
        }
        return 1;
    }


    public static int col_block(int[][] A){
       // System.out.println("starting column wise");

        int rstart=0;
        int rend =3;
        boolean flag = true;
        int va=1;
        for (int i = 0; i < 3; i++) {
            va = row_block(A,rstart,rend);
            rstart=rend;
            rend =rend+3;
            if(va ==0){
                return zero;
            }
        }
        return 1;
    }

    public static int row_compare(int[][] A){
        boolean flag = true;
        for (int i = 0; i < 9; i++) {
            HashMap<Integer,Integer> map= new HashMap<>();
            for (int j = 0; j < 9; j++) {
                int val = A[i][j];
                if(val>0){
                    if(map.containsKey(val)){
                        int sv = map.get(val);
                        map.put(val,sv+1);
                        if(map.get(val) >1){
                            flag =false;
                            return zero;
                        }
                    }else{
                        map.put(val,1);
                    }
                }

            }
        }
    return 1;
    }

    public static int col_compare(int[][] A){
        boolean flag = true;

        for (int i = 0; i < 9; i++) {
            HashMap<Integer,Integer> map= new HashMap<>();
            for (int j = 0; j < 9; j++) {
                int val = A[j][i];
                if(val>0){
                    if(map.containsKey(val)){
                        int sv = map.get(val);
                        map.put(val,sv+1);
                        if(map.get(val) >1){
                            flag =false;
                            return zero;
                        }
                    }else{
                        map.put(val,1);
                    }
                }

            }
        }
    return 1;
    }
}
