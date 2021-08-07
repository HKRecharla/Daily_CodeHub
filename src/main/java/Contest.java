public class Contest {

    public static void main(String[] args) {
        int[] A={2,2,5,1};
        int[][] B={{3,2},{5,5},{2,4},{3,2},{5,2}};

       int x=1;
        System.out.println(Math.floor(x/2));
        int a =0;
        int b=1;
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if(B[i][a] == A[j]){
                    A[j]=B[i][b];
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        
    }
}
