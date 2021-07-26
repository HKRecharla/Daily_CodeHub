package bit_manuplication_2;

public class Different_bits_sum {

    public static void main(String[] args) {
        int[] A={1,3,5};
        int s = bits(A);
        System.out.println(s);
    }


    public static int bits(int[] A){
        int MOD =1000000007;
        int ans=0;
        int count=0;
        for (int i = 0; i < 32; i++) {
            count=0;
            for (int j = 0; j < A.length; j++) {
                if((A[j]&(1<<i))==0){
                    count++;
                }
            }
            ans+=2*count*(A.length-count);
            ans%=MOD;
        }
        return ans;
    }
}
