package recursion;

public class Power {

    public static void main(String[] args) {

        int B=2;
        int P=5;
        int ans = power_fuc(B,P);
        System.out.println(ans);
    }

    public static int power_fuc(int B,int P){
        if(P==0) return 1;
        return B*power_fuc(B,P-1);
    }
}
