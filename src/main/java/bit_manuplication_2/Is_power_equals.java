package bit_manuplication_2;

public class Is_power_equals {

    public static void main(String[] args) {
       boolean g =  isPowerOfTwo(1073741825);
        System.out.println(g);
    }

    public static boolean isPowerOfTwo(int n) {

        for(int i=0;i<=n;i++){
            long ans = power(2,i);
            if(ans == n){
                return true;
            }else if(ans>n){
                return false;
            }else if(ans>Integer.MAX_VALUE){
                return false;
            }
        }
        return false;
    }



    public static long power(int a,int b){
        if(b==0) return 1;
        long c = power(a,b/2);
        long res = c*c;
        if(b%2==1){
            res=res*a;
        }
        return res;
    }
}
