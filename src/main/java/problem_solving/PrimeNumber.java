package problem_solving;

public class PrimeNumber {

    public static void main(String[] args) {
//        boolean b = method(8);
//        System.out.println(b);
       int b = (int) Math.sqrt(25);
        System.out.println(b);
    }


    public static boolean method(int N){

        for (int i = 2; i <=N-1 ; i++) {
            if(N%i==0){
                System.out.println("n="+N+" / i="+i+"  ==> "+N%i);
                return  false;
            }
        }
        return true;
    }
}
