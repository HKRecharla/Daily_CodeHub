package mathsII;

public class Repeat_SUbraction {

    public static void main(String[] args) {

        int A=5;
        int B=15;
        int max =A;
        max =Math.max(max,B);
        int g = gcd(A,B);

        System.out.println(g);
        int ans=g;
        for (int i = g; i <=max; i++) {
            if((ans*2)>max){
                ans=ans;
            }else{
                ans=ans*2;
            }
        }

        System.out.println(ans);
    }



    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
