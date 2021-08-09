package recursion;

public class Calculate_Power {

    public static void main(String[] args) {


        int b=3;
       long a = power(2,b);
        System.out.println(a);
    }

    public static long power(int a,int b){
        if(b==0) return 1;
       long c = power(a,b/2);
        long res =c*c;
        if(b%2==1){
            res =res*a;
        }
        return res;

    }
}
