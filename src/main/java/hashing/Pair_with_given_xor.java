package hashing;

import java.util.HashMap;

public class Pair_with_given_xor {
    public static void main(String[] args) {
        int[] A={5,4,10,15,7,6};
        int B=5;
        //System.out.println(5^4);
       solve2(A,B);

    }



    public static void solve2(int[] A, int B){

        int count=0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            int xor = B^A[i];
            System.out.println("xor :: "+xor);

            if(map.containsKey(xor)){
              count = count+1;
            }

            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }




        }
        System.out.println(count);


    }
    public static void solve(int[] A, int B){

        int count=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                if((A[i]^A[j]) ==B){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
