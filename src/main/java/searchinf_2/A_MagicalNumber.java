package searchinf_2;

public class A_MagicalNumber {

    public static void main(String[] args) {
        int A=19;
        int B=11;
        int C=13;
        int MOD = 1000000007;
        long ans  = magic(A,B,C);
        System.out.println(ans);

    }


    //getting count of number
    public static long count(long mid, int b, int c){
        long A = mid/b;
        long B = mid/c;
        long lcm = mid/lcm(b,c);
        long sum = (((A+B))-(lcm));
        return sum;
    }


    //LCM
    public static long lcm(int a, int b){
        return (a/gcd(a,b))*b;
    }


    //GCD
    public static long gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }


    //magic number
    public static long magic(int A, int B, int C){
        long ans =0;
        long l=1;
        long h=((long)Math.min(B,C))*A;

        while (l<=h){
            long mid = (l+h)/2;
            long count = (count(mid,B,C));
            System.out.println(count);
            if(count>=A){
                h=mid-1;
                ans=mid;
                System.out.println(ans);
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}
