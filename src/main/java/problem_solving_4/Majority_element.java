package problem_solving_4;

import java.util.HashMap;
import java.util.Map;

public class Majority_element {

    public static void main(String[] args) {
        int[] A ={2,1,2};
       int ans =  majorityElement(A);
        System.out.println(ans);
    }

    public static int majorityElement(final int[] A) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int len =A.length;
        for(int i=0;i<len;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }

        int max = map.get(A[0]);
        int ans =0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() >= max){
                max =entry.getValue();
                ans=entry.getKey();
            }else{

            }

        }

        return ans;
    }
}
