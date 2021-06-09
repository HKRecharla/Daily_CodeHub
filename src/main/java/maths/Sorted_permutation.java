package maths;

import java.util.Arrays;

public class Sorted_permutation {

    public static void main(String[] args) {

        String A = "acb";
        int s = rank(A);

        System.out.println(s);
       // permu(A);
    }


    public static int rank(String a){
        if(a.length()==1){
            return 1;
        }
        int count = position(a);
        int mod = count*fact(a.length()-1)%1000003;
       return  (mod+rank(a.substring(1)))%1000003;
    }

    public static int position(String a){
        int count =0;
        for (int i = 1; i < a.length(); i++) {
            if(a.charAt(i) < a.charAt(0)){
                count++;
            }
        }
        return count;
    }

    public static int fact(int a){
        if(a<=0){
            return 1;
        }
        return a*fact(a-1)%1000003;
    }


}
