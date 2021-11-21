package bitwise_operations;

public class IsPrime {


    public static void main(String[] args) {
        int A=35;
        int a = isPrime(A);
        System.out.println(a);
    }

    public static int isPrime(int A) {
        boolean flag = true;

        if(A==0 || A==1){
            return 0;
        }

        for(int i=2;i<=Math.sqrt(A);i++){
            if(A%i==0) {
                flag=false;
            }
        }

        if(flag){
            return 1;
        }
        return 0;
    }
}
