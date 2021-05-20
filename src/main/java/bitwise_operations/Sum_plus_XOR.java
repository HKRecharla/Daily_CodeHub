package bitwise_operations;

public class Sum_plus_XOR {


    public static void main(String[] args) {
        long n =1099511627776l;
       long v =  sumXor1(n);
        System.out.println(v);
    }


    public static long sumXor(long n) {
        // Write your code here
        long sum =0;
        long xor =0;
        long count=0;
        if(n==0){
            return 1;
        }
        for(long i =0;i<n;i++){
            sum = n+i;
            xor = n^i;
            if(sum == xor){
                System.out.println(sum);
                count++;
            }
        }

        return count;
    }

    public static long sumXor1(long n) {
        // Write your code here
        long unset_bits=0l;
        while (n > 0)
        {
            if ((n & 1) == 0)
                unset_bits++;
            n=n>>1;
        }

        // Return 2 ^ unset_bits
        return 1 << unset_bits;
    }
}
