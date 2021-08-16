package backTracking;

import java.util.ArrayList;

public class Sudoku {

    static int n=9;
    private static int[][] su;

    public static void main(String[] args) {
        su= new int[n][n];

    }


    public static void solvesudoko(ArrayList<ArrayList<Character>> A){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(A.get(i).get(j)=='.'){
                    su[i][j]=0;
                    continue;
                }
                su[i][j]=Character.getNumericValue(A.get(i).get(j));
            }
        }
        sudoko(0,0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char c = (char)(su[i][j]+'0');
                A.get(i).set(j,  c);
            }
        }

        System.out.println(A);
    }


    public static boolean sudoko(int r, int c){

        if(r==n) return true;
        if(c==n) return sudoko(r+1,0);
        if(su[r][c]!=0) return sudoko(r,c+1);


        for (int i = 1; i < 10; i++) {
                if(isValid(r,c,i)){
                    su[r][c]=i;
                    if(sudoko(r,c+1)) return true;
                    su[r][c]=0;
                }
            }
        return false;
    }




    public static boolean isValid(int r, int c, int val){
        for (int i = 0; i < n; i++) {
            if(su[r][i]==val) return false;
        }

        for (int i = 0; i < n; i++) {
            if(su[i][c]==val) return false;
        }

        r = (r/3)*3;
        c =(c/3)*3;
        for (int i = r; i < r+3; i++) {
            for (int j = c; j < c+3; j++) {
                if(su[i][j]==val) return false;
            }
        }
        return true;
    }
}
