package arrays;

public class Primal_Power {

    public static void main(String[] args) {

        int[] A={97, 43, 29, 11, 100, 47, 76, 83, 37, 19, 17, 19, 71, 0, 1, -82, 2, -83, 37, 13, 5, 97, 17, 30, 31, 48, 2, 19, 31, 91, 19, 2, 5, 89, 2, 67, 31, 47, 43, 31, 5, 17, 83, 11, 47, 73, 19, 3, 3, 19, 59, 91, 67, 7, 43, 4, 3, 51, 52, 23, 3, 37, 53, 89, 9, 41, 19, 61, 7, 5, 53, 59, 19, 11, 79, 37, 31, 37, 73, 82, 41, 2, 13, 8, 2, 36, 19, 58, 17, 17, 59, 59, 37, 11, 13, 37, 47, 83, 31, 3};

//                {97, 43, 29, 11, 100, 47, 76, 83, 37, 19, 17, 19, 71, 0, 1, -82, 2, -83,
//                37, 13, 5, 97, 17, 30, 31, 48, 2, 19, 31, 91, 19, 2, 5, 89, 2, 67, 31, 47,
//                43, 31, 5, 17, 83, 11, 47, 73, 19, 3, 3, 19, 59, 91, 67, 7, 43, 4, 3, 51,
//                52, 23, 3, 37, 53, 89, 9, 41, 19, 61, 7, 5, 53, 59, 19, 11, 79, 37, 31, 37,
//                73, 82, 41, 2, 13, 8, 2, 36, 19, 58, 17, 17, 59, 59, 37, 11, 13, 37, 47, 83, 31, 3};

        //primal(A);

        primes(1000);

    }

    public static void primal(int[] A){

        int len = A.length;
        System.out.println(len);
        int count =0;
        for(int i=0;i<len;i++){
            if(A[i]>1){
                boolean flag = prime(A[i]);
                if(flag){
                    count++;
                }
            }

        }
        System.out.println();
        System.out.println(count);
    }


    public static void primes(int A){
       Boolean[] a = new Boolean[A];

        for (int i = 0; i < A; i++) {
            a[i]=true;
        }

        for (int i = 2; i < 6; i++) {
            int mul=2;
            int val =mul*2;
            for (int j = val; j <A; j=i*mul) {
                if(j<=A){
                    a[j]=false;
                    mul++;
                }else{
                    break;
                }

            }
        }

        for (int i = 0; i < A; i++) {
            if (a[i]==true){
                System.out.println(i);
            }
        }


    }

    public static boolean prime(int n){
        boolean flag = true;

        for(int i=2;i<=n/2;i++){
            if(n%i==0) {
                flag=false;
            }
        }
        return flag;
    }
}
