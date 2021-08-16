package recursion;

public class FibonicSeries {

    public static void main(String[] args) {
        int a = fibonic(5);
        System.out.println(a);
    }
    public static int fibonic(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        int a = fibonic(n-1);
        int b=fibonic(n-2);
        return a+b;
    }
}
