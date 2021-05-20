package multiDimentional;

public class FindB_position_in_Matrix {

    public static void main(String[] args) {

        int[][] A={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int B=2;
       int v =  position(A,B);
        System.out.println(v);
    }


    public static int position(int[][] A, int B){

        int VAL=0;
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A[0].length; j++) {

                if(A[i][j] ==B){
                   VAL= ((i+1)*1009)+(j+1);
                   return VAL;
                }
            }
        }
        return -1;
    }
}
