package sorting;

import java.util.Arrays;

public class Arthematic_progression {

    public static void main(String[] args) {

        int[] A={3,5,1};
        int val=0;
        Arrays.sort(A);
        if(A.length>=2){
            val = A[1]-A[0];
        }

        for(int i=0;i<A.length;i++){
            if(i+1<A.length){
                if(A[i+1]-A[i] == val){
                    continue;
                }else{
                    System.out.println(val);
                }
            }
        }
    }
}
