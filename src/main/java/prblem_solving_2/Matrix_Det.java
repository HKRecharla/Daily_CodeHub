package prblem_solving_2;

public class Matrix_Det {

    public static void main(String[] args) {

        int[][] A= {{61, 35},
                {4, -65}};

//                {{6, 1, 1},
//                {4, -2, 5},
//                {2, 8, 7}};

//        int[][] NA = data_Matrix(A);
//        int a = col_Dat(NA,A.length);
//       int b =  col_Dat_2(NA,A.length);

       int c = m_2(A);
        System.out.println(c);
        //System.out.println(a+" "+b+" :: "+(a-b));
    }


    public static int[][] data_Matrix(int[][] A){

        int m = A.length+(A.length-1);
        int[][] NA=new int[A.length][m];

        int counti =0;
        for (int i = 0; i < NA.length; i++) {

            int countj =0;
            for (int j = 0; j < NA[0].length; j++) {
                if(j>A.length-1){
                    NA[i][j]=A[counti][countj];
                    System.out.print(NA[i][j]+" ");
                    countj++;
                }else{
                    NA[i][j]=A[i][j];
                    System.out.print(NA[i][j]+" ");
                }
            }
            counti++;
            System.out.println();
        }

    return NA;
    }


    public static int col_Dat(int[][] NA,int size){

        int b=0;
        int total_sum=0;
        for (int i = 0; i < size; i++) {
            int a=0;
            b=i;
            int sum =1;
            for (int j = 0; j < size; j++) {
                sum *=NA[a][b];
                a++;
                b++;
            }
           total_sum+=sum;
        }
        return total_sum;
    }

    public static int col_Dat_2(int[][] NA,int size){

        int b=size-1;
        int total_sum=0;
        for (int i = 0; i < size; i++) {
            b =size-1+i;
            int a=0;
            int sum =1;
            for (int j = 0; j < size; j++) {
                sum *=NA[a][b];
                a++;
                b--;
            }
            total_sum+=sum;

        }
        return total_sum;
    }

    public static int m_2(int[][] A){

        int a = A[0][0]*A[1][1];
        int b = A[0][1]*A[1][0];

        return a-b;

//        int temp =A[1][1];
//        A[1][1]=A[1][0];
//        A[1][0]=temp;
//
//        int t_sum=0;
//        for (int i = 0; i < A.length; i++) {
//            int sum=1;
//            for (int j = 0; j < A.length; j++) {
//                sum*=A[j][i];
//                if(i==0){
//                    t_sum=t_sum+sum;
//                }else{
//                    t_sum-=sum;
//                }
//
//            }
//        }
//
    }
}
