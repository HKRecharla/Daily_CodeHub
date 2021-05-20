package problem_solving;

public class PrintDoublaarray {

    public static int[][] solve(int A) {
        int[][] a = new int[A][];
        for (int i = 0; i < A; i++) {
            a[i] =new int[i+1];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = j+1;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        int A=4;
       int[][] a =  solve(A);
    }
}
