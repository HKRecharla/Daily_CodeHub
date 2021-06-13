package problem_solving_6;

public class XoR_Queries {

    public static void main(String[] args) {
        int[] A={1,0,0,0,1};
        int[][] B={{2,4},{1,5},{3,5}};
        xor_que(A,B);
    }

    public static void xor_que(int[] A, int[][] B){

        int[] ps = new int[A.length];
        int[][] res= new int[B.length][2];
        ps[0]=A[0];
        for (int i = 1; i <A.length ; i++) {
            ps[i]= ps[i-1]+A[i];
        }

        int ones=0;
        int xor=0;
        for (int i = 0; i < B.length; i++) {

            int l = B[i][0];
            int r = B[i][1];

            ones = ps[r-1]-ps[l];

            if(ones%2!=0){
                xor=1;
            }
            res[i][0]=xor;
            res[i][1]=((r-l)+1)-ones;
            System.out.println(res[i][0]);
            System.out.println( res[i][1]);
        }


    }

    public static void xor_query(int[] A,int[][] B){
        int[][] res= new int[B.length][2];
        for (int i = 0; i < B.length; i++) {

            int start=B[i][0]-1;
            int end = B[i][1];
            int xo =A[start];
            int count=0;
            if(xo==0){
                count++;
            }
            for (int j = start+1; j <end ; j++) {
                xo=xo^A[j];
                if(A[j]==0){
                    count++;
                }
            }
            res[i][0]=xo;
            res[i][1]=count;
            System.out.println(res[i][0]);
            System.out.println( res[i][1]);
        }
        System.out.println("_______");

    }
}
