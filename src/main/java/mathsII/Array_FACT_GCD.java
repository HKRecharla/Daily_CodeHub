package mathsII;

public class Array_FACT_GCD {

    public static void main(String[] args) {


        int[] A={12,15,18};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <A.length ; i++) {
            min = Math.min(min,A[i]);
        }
        int res = fact(min);
        System.out.println(res);




//        for (int i = 0; i < A.length; i++) {
//            A[i]=fact(A[i]);
//            System.out.print(A[i]+" ");
//        }


        if(A.length>=2){

            int a=0;
            int b=0;
            int ans=A[0];
            for (int i = 0; i < A.length-1; i++) {
                ans = gcd(ans, A[i + 1]);
                System.out.println(ans);
            }
        }




    }


    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }


    public static int fact(int N){
        if(N==0){
            return 1;
        }
        return N*fact(N-1);
    }

}
