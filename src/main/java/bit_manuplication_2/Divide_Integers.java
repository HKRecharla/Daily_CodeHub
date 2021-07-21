package bit_manuplication_2;

public class Divide_Integers {

    public static void main(String[] args) {
        long A=-1;
        long B=1;
        divide_pow(A,B);
        System.out.println(9^17);
    }

    public static void divide(int A,int B){
        int count=0;
        while (A>=B){
            A=A-B;
            count++;
        }
    }
    public static int divide_pow(long a, long b){
        boolean flag =false;
        if(a<0 && b>0 || b<0 && a>0){
            flag=true;
        }
        if(flag || !fla){
            a=(long)Math.abs(a);
            b=(long)Math.abs(b);
        }
        int ans=0;
        for (int i = 31; i >=0; i--) {
           long val = (a-(b*power(2,i)));
           if(val>=0){
               a=(int)val;
               ans+=power(2,i);
           }
        }

        System.out.println(ans);
        return ans;
    }

    public static long power(int a, int b){
        if(b==0) return 1;
        long c = power(a,b/2);
        long res = c*c;
        if(b%2==1) res = res*a;
        return res;
    }
}
