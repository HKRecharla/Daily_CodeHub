package recursion;

public class FibonicSeries {

    public static void main(String[] args) {

    }
    public static int fibonic(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        return fibonic(n-1)+fibonic(n-2);
    }
}
