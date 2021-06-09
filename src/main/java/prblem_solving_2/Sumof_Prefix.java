package prblem_solving_2;

public class Sumof_Prefix {

    public static void main(String[] args) {


        int[] A = {1,5,-3,7};
        int L = 0,R=2;

        int[] ps = new int[A.length];
        ps[0]=A[0];
        for (int i = 1; i < ps.length; i++) {
            ps[i] = ps[i-1]+A[i];
        }

        if(L-1<0){
            L=1;
        }
        int sum = ps[R]-ps[L-1];
        System.out.println(sum);
    }
}
