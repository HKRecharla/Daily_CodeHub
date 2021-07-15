package maths_PrimeNumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Distinct_primes {
    public static void main(String[] args) {

        int[] A={6,12,15};
                //{63, 52, 28, 72, 9, 62, 79, 71, 43, 15, 82, 21, 10, 12, 38, 96, 58, 99, 59, 100, 10, 38, 92, 30, 24, 3, 49, 17, 2, 63, 54, 18, 71, 7, 65, 87, 82, 31, 48, 39, 100, 82, 15, 60, 44, 84, 43, 5, 63, 17, 100, 94, 62, 26, 35, 29};
        long G=1;
        //Arrays.sort(A);
        int count =0;
        prime_fact(A);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            max = Math.max(max,A[i]);
        }
        HashMap<Integer,Integer> listmap = new HashMap<>();
        HashMap<Integer, Integer> map = divisors(3628800);
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            listmap.put(entry.getKey(),0);
        }
        System.out.println(listmap.size());

//        for (int i = 0; i < A.length; i++) {
//            HashMap<Integer, Integer> map = divisors(A[i]);
//            for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
//                listmap.put(entry.getKey(),0);
//            }
//        }
//        System.out.println(listmap.size());
//        long d =5992039304216444928l;
//        System.out.println(Math.abs(G));
//        int MOD =1000000007;
//        HashMap<Integer, Integer> map = divisors(Math.abs(G));
//        System.out.println(map);
//        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
//            System.out.println(entry.getKey());
//        }

    }

    public static void prime_fact(int[] A){
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            int sq =(int)Math.sqrt(A[i]);

            for (int j = 2; j <=sq ; j++) {
                if(A[i]%j==0){
                    map.add(j);
                    while (A[i]%j==0){
                        A[i]=A[i]/j;
                    }
                }
            }
            if(A[i]>1){
                map.add(A[i]);
            }
        }
        System.out.println(map);
    }



    public static HashMap<Integer,Integer> divisors(long A){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 2; i<=A ; i++) {
            while (A%i==0){
                map.put(i,0);
                A/=i;
            }
        }
        System.out.println(map);
        return map;
    }
}
