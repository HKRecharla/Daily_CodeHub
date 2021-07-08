package mathsII;

public class Gcd_Bitwise {

    public static void main(String[] args) {

        int[] A={1,2,3};

        int ans =A[0];
        for (int i = 0; i <A.length-1 ; i++) {
            ans=gcd(ans,A[i+1]);
        }

        if(ans==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }


    }


    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
