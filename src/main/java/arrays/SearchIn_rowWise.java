package arrays;

public class SearchIn_rowWise {


    public static void main(String[] args) {
        int[][] A={{ 1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};

        int B=2;

        int val =0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {

                if(A[i][j]==B){
                    val = i*1009+j;
                }


            }
        }



    }
}
