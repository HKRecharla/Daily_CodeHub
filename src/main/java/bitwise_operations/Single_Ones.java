package bitwise_operations;

import java.util.HashMap;
import java.util.Map;

public class Single_Ones {

    public int singleNumber(final int[] A) {
        int ans=0;
        int len = A.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()<3){
                ans = entry.getKey();
            }
        }

        return ans;
    }
}
