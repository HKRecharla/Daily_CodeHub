package mathsModular;

public class Pair_sum {

    public static void main(String[] args) {

        int[] A={1,2,3,4,5};
        int B=2;
        pair_sum(A,B);
    }

    public static void pair(int A[], int B){

        int count=0;
        int MOD = 1000000007;
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j <A.length ; j++) {
                int val = (A[i]+A[j])%MOD;
                if(val%B==0){
                    count++;
                }
            }
            System.out.println(count);
        }

    }



    public static void pair_sum(int[] A, int B){
        /**
         * take MOD
         * take mod for all array A[i]%B -- add in new array
         *        int[] c = new int[A.length]
         * initialise = ans = c[0]*c[0]-1/2 %B
         * int i-1; j=B-1
         *
         * traverse (i<=j) -- use 2 pointer approach
         *      -- if i==j
         *             ans+=c[i]*c[j]-1/2 %B
         *      -- else
         *              ans+=c[i]*c[j] %B
         *
         *        i++, j--
         */


        int MOD =1000000007;
        int[] c = new int[B];
        for (int i = 0; i <A.length; i++) {
            c[A[i] % B]+=1;
        }

        long ans = (c[0] * (c[0] - 1)) / 2;

//        for (int i = 1; i <=B/2 && i!=(B-i) ; i++) {
//            if(B%2==0){
//                ans+=((c[B/2]*(c[B/2]-1))/2);
//            }else{
//                ans+=((c[i]*c[B-i]));
//            }
//        }
        int i=1,j=B-1;
        while (i<=j){
            if(i==j){
                ans+=((c[i]*(c[j]-1))/2)%MOD;
            }else{
                ans+=((c[i]*c[j]))%MOD;
            }
            i++;
            j--;
        }


        System.out.println(ans);


    }

    /**
     *  int MOD =1000000007;
     *         int freq[] = new int[B];                                // computed the frequency array of the modulo
     *         for (int i = 0; i < A.length; i++)
     *             freq[A[i] % B]+=1;
     *         long sum = (freq[0] * (freq[0] - 1)) / 2;                 // 0 remainder numbers will have frequency given by n (n+1)/ 2 but here n = freq[0] -1
     *         for (int i = 1; i <= B / 2 && i != (B - i); i++)         // frequency multiplied by corresponding B-i as the remainder would sum up and modulo will be 0
     *             sum += freq[i] * freq[B - i]%MOD;
     *         if (B % 2 == 0)
     *             sum += ((freq[B / 2] * (freq[B / 2] - 1)) / 2)%MOD;     // for the even case , the same remainder 0 like frequeny can be computed
     *         return (int)sum%MOD;
     */
}
