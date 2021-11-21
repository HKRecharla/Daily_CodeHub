package backTracking;

public class Minimum_swaps {

    public static void main(String[] args) {

    }

    public static void find_min(int A, int[] B, int[][] C){

        int blen = B.length;

        for (int i = 0; i < A; i++) {
            int a = C[i][0];
            int b = C[i][1];
            int temp =B[0];
            int start_position=0;
            int end_position=0;
            for (int j = 0; j <=blen; j++) {
                if(a!=B[j] && b==B[j]){
                    continue;
                }else if(a!=B[j]){
                    start_position=j;
                }

            }
        }

        for (int i = 0; i <blen; i++) {

            for (int j = 0; j < A; j++) {
                    if(C[j][0]==B[i]){
                        continue;
                    }else if(C[j][0]!=B[i]){

                    }

            }

        }
    }
}
