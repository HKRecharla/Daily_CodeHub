package mathsII;

public class Divisor_Game {
    public static void main(String[] args) {

        int A=12;
        int B=3;
        int C=2;
       int ans =  div(A,B,C);
        System.out.println(ans);
    }

    public static int div(int a, int b, int c){
        int ans = (b*c)/gcd(b,c);
        return a/ans;
    }

    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
