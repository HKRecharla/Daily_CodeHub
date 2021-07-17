package mathsModular;

public class Mod_SUM {
    public static void main(String[] args) {

        int[] A= {17,100,11};
        mod_optimise(A);
    }


    public static void mod_sum(int[] A){

        int sum =0;
        int MOD =1000000007;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                sum+=(A[i]%A[j]);
            }
        }
        System.out.println(sum%MOD);
    }

    public static int mod_optimise(int[] A){
        int res=0;
        int MOD =1000000007;
        int count[]=new int[1001];
        for (int i = 0; i < A.length; i++) {
            count[i]++;
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 1; i <=1000 ; i++) {
            for (int j = 1; j <=1000 ; j++) {
                int val=i%j;
                int temp = (count[i]*count[j])*val;
                res = ((res%MOD)+(temp%MOD))%MOD;
            }
        }
        System.out.println(res);
        return res;
    }
}
