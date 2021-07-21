package bit_manuplication_2;

public class PrimeNum_setBits {

    public static void main(String[] args) {
        countPrimeSetBits(6,10);
    }

    public static int countPrimeSetBits(int left, int right) {

        int sum=0;
        for(int i=left;i<=right;i++){

            int[] ar = decimal_to_Binary(i);
            int count=0;
            for(int j=0;j<ar.length;j++){
                if(ar[j]==1){
                    count++;
                }
            }

            if(isPrime(count) && count!=1 && count!=0){
                sum++;
            }

        }

        return sum;

    }


    public static boolean isPrime(int n){
        boolean flag =true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                flag= false;
            }
        }
        return flag;
    }




    public static int[] decimal_to_Binary(int a){
        int[] arr = new int[31];
        int i=0;
        while(a!=0){
            arr[i]=a%2;
            a/=2;
            i++;
        }
        return arr;
    }
}
