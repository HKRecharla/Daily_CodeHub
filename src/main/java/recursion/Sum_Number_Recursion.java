package recursion;

public class Sum_Number_Recursion {


    public static void main(String[] args) {
        int N=456;
       int b = sum(N);
        System.out.println(b);
    }

    public static int sum(int N){
        if(N==0){
            return N;
        }
        int re = N%10;
        return re+sum(N/10);
    }
}
