package problem_solving;

public class Sum_Number {


    public static void main(String[] args) {

        int N=100;

       int n=  method1(N);
        System.out.println(n);

    }



    //Looping till N time -- with reference of sum
    //Left to RIght -- summing
    public static int method1(int N){
        int sum =0;
        for (int i = 1; i <=N ; i++) {
            sum = sum+i;
        }
        return sum;
    }


    //Summing Right to left
    public static int method2(int N){
        int sum=0;
        for (int i = N-1; i >=1 ; i--) {
            sum = sum+i;
        }
        return sum;
    }


    //Recursion
    public static int method3(int N){
        int i=0;
        int sum=0;
        if(i<N){
            i++;
            method3(N);
        }
        return i;
    }


    public static int method4(int N){
        int n = N*(N+1)/2;
        return n;
    }


}
