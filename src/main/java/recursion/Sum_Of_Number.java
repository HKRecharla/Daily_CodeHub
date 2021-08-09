package recursion;

public class Sum_Of_Number {


    public static void main(String[] args) {

        int[] A={1,2,3,4,5};
       int a = sum(A,A.length);
        System.out.println(a);
    }


    public static int sum(int[] A,int N){
        if (N==0) return 0;
        return sum(A,N-1)+A[N-1];
    }
}
