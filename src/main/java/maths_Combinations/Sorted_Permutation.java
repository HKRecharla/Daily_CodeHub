package maths_Combinations;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sorted_Permutation {

    public static void main(String[] args) {

        String A = "";
        Collections.sort(Arrays.asList(A));
        int s = rank("acb",1000003);
        System.out.println(s);
    }


    /**
     * Find factorial of a.length fact(a)
     * find position of a position(a)
     * find rank of a  rank(a)
     *      count = position(a)
     *      mod = count* fact(a.length-1);\
     *      mod+rank(a.substring(1))
     */


    public static int rank(String a, int MOD){
        if(a.length()==1){
            return 1;
        }
        int count = position(a);
        int mod = ((count%MOD)*fact(a.length()-1,MOD)%MOD)%MOD;
        return (mod+rank(a.substring(1),MOD))%MOD;
    }


    public static int position(String a){
        int count=0;
        for (int i = 1; i < a.length(); i++) {
            if(a.charAt(i)<a.charAt(0)){
                count++;
            }
        }
        return count;
    }


    public static int fact(int a,int mod){
        if(a==0) return 1;
        return ((a%mod)*fact(a-1,mod)%mod)%mod;
    }

}
