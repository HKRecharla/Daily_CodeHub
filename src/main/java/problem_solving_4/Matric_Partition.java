package problem_solving_4;

public class Matric_Partition {

    public static void main(String[] args) {
        int[][] A=

                {
                {5, 17, 100,11},
                {0, 0, 2,8}};

        int[] B={1,1};
        int[] C={1,4};
        int[] D={2,2};
        int[] E={2,4};

        /**
         *  {
         *                 {1, 2, 3},
         *                 {4, 5, 6},
         *                 {7, 8, 9}};
         *
         *         int[] B={1,2};
         *         int[] C={1,2};
         *         int[] D={2,3};
         *         int[] E={2,3};
         */
        partition(A,B,C,D,E);
    }

    public static void partition(int[][] A,int[] B, int[] C,int[] D, int[] E){

            int left = A[B[0]-1][C[0]-1];
            int bottomleft = A[D[0]-1][E[0]-1];

            int right = A[B[1]-1][C[1]-1];
            int bottomright = A[D[1]-1][E[1]-1];

//            System.out.println(left);
//            System.out.println(bottomleft);
//            System.out.println(right);
//            System.out.println(bottomright);


        int sum =0;
        int sum1=0;
            int k=0;
            while (k<B.length){
                if(k>=2){
                    k--;
                }
                for (int i = B[k]-1; i < D[k]; i++) {
                    for (int j = C[k]-1; j < E[k]; j++) {
                        sum += A[i][j];
                    }
                }
                k++;
                for (int i = B[k]-1; i < D[k]; i++) {
                    for (int j = C[k]-1; j < E[k]; j++) {
                        sum1 += A[i][j];
                    }
            }
                k++;
        }


        System.out.println(sum);
        System.out.println(sum1);

        int[] result = new int[2];
        result[0]=sum;
        result[1]=sum1;
    }
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {

        int sum =0;
        for (int i = B[0]-1; i < D[0]; i++) {
            for (int j = C[0]-1; j < E[0]; j++) {
                sum += A[i][j];
            }
        }
        //System.out.println(sum);

        int sum1=0;
        for (int i = B[1]-1; i < D[1]; i++) {
            for (int j = C[1]-1; j < E[1]; j++) {
                sum1 += A[i][j];
            }
        }
        // System.out.println(sum1);

        int[] result = new int[2];
        result[0]=sum;
        result[1]=sum1;
        return result;
    }

}
