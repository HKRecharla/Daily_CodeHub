package time_complexity;

public class WeardFunction {


    public static void main(String[] args) {
        int[] A={1,2,3};
       int a =  sum(A.length,A);
        System.out.println(a);
    }
    public static int sum(int A, int[] B) {

        int MOD =1000000007;
        long sum=0;
        for(int i=0;i<B.length;i++){
            for(int j=i+1;j<B.length;j++){
                long val = B[i]-B[j];
                if(val>1){
                    val = B[j]-B[i];
                }else if(val<=1){
                    val=0;
                }
                sum=sum+val;
            }
        }
        return (int)(sum%MOD);
    }
}
