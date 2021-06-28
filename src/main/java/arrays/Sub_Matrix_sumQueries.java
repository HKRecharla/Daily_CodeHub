package arrays;

public class Sub_Matrix_sumQueries {

    public static void main(String[] args) {

        int[][] A={{1,2,3},
                {4,5,6},
                {7,8,9}};

        int[] B={1,2};
        int[] C = {1,2};
        int[] D = {2,3};
        int[] E = {2,3};

        //Row prefix
        int[][] PA= new int[A.length][];
        for (int i = 0; i < A.length; i++) {
            int[] spa=new int[A[0].length];
            spa[0]=A[i][0];
            System.out.print(spa[0]+" ");
            for (int j = 1; j < A[0].length; j++) {
                spa[j]=spa[j-1]+A[i][j];
                System.out.print(spa[j]+" ");
            }
            PA[i]=spa;
            System.out.println();
        }


        //Column Prefix
        int[][] CA= new int[A[0].length][];
        for (int j = 0; j < A[0].length; j++) {
            int[] spa=new int[A[0].length];
            spa[0]=PA[0][j];
            System.out.print(spa[0]+" ");
            for (int i = 1; i < A.length; i++) {
                spa[i]=spa[i-1]+PA[i][j];
                System.out.print(spa[i]+" ");
            }
            CA[j]=spa;
            System.out.println();
        }


        int[] res= new int[2];
        for (int i = 0; i < 2; i++) {
            int val =0;
            int first  = CA[D[i]-1][E[i]-1];
            if((D[i]-1)>=0 && (B[i]-1)-1>=0 && (C[i]-1)-1>=0 && E[i]-1>=0){
                int second = CA[D[i]-1][(B[i]-1)-1];
                int third = CA[(C[i]-1)-1][E[i]-1];
                int fourth = CA[0][0];
                 val = first-second-third+fourth;
                System.out.println(val);
            }else{
                 val = first;
                System.out.println(val);
            }
            res[i]=val;
        }












    }
}
