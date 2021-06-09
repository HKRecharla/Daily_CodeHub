package prblem_solving_2;

public class Colum_Sum {
    public static void main(String[] args) {

        int[][] A={{1,2,3,4},
                {5,6,7,8},
                {9,2,3,4}};
        column(A);
    }


    public static void dat(){

    }

    public static void column(int[][] A){
        int[] a = new int[A[0].length];
        for (int i = 0; i < A[0].length; i++) {

            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                sum += A[j][i];
            }
            a[i] = sum;
        }
        
    }
}
