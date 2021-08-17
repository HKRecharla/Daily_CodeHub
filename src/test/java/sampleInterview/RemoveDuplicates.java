package sampleInterview;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {


    public static void main(String[] args) {
        int[] A = {1,1,2,3,4,1,3,5};

        HashMap<Integer,Integer> map = new HashMap<>();

        int size = A.length;
        for (int i = 0; i < size; i++) {
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()
             ) {
            if (entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
