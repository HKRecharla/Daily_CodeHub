package prblem_solving_2;

public class Special_Elements {
    public static void main(String[] args) {
        int[]  A= {5,5,2,5,8};
        int B=3;
        special(A);
    }

    public static void special(int[] A){

        int len =A.length;
        int[] ps = new int[len];
        int[] eps = new int[len];
        int[] ops = new int[len];

        //prefix
        ps[0] = A[0];
        System.out.print("PS "+ps[0]+" ");
        for (int i = 1; i < len; i++) {
            ps[i]=ps[i-1]+A[i];
            System.out.print(ps[i]+" ");
        }

        System.out.println();
        //even prefix
        eps[0] =0;
        System.out.print("EPS "+eps[0]+" ");
        for (int i = 1; i <len ; i++) {
            if(i%2==0){
                eps[i] = eps[i-1]+0;
            }else{
                eps[i] = eps[i-1]+A[i];
            }
            System.out.print(eps[i]+" ");
        }
        System.out.println();
        //odd prefix
        int b=1;
        ops[0]=A[0];
        System.out.print("OPS "+ops[0]+" ");
        for (int i = 1; i < len; i++) {
            if(i%2==0){
                ops[i] = ops[i-1]+A[i];
            }else{
                ops[i] = ops[i-1]+0;
            }
            System.out.print(ops[i]+" ");
        }



        //sum of even
        for (int i = 0; i < len; i++) {

        }

    }
}
