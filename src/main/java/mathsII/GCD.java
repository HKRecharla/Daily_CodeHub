package mathsII;

public class GCD {

    public static void main(String[] args) {
        int a=6;
        int b=720;
        int ans = gcd_mod(Math.abs(a),Math.abs(b));
        System.out.println(ans);
    }


    public static int gcd(int a, int b){

        if(a==b){
            a=0;
        }
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        if(b==0) return a;
        return gcd(a-b,b);
    }

    public static int gcd_mod(int a, int b){
        if(b==0) return a;
        return gcd_mod(b,a%b);
    }
}
