package time_complexity;

import java.util.HashMap;
import java.util.Map;

public class IntoBlocks {

    public static void main(String[] args) {
        int[] A={6,7,100,8,5,61,5,7};
        int a = solve(A);
        System.out.println(a);
    }
    public static int solve(int[] A) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }

        int max= Integer.MIN_VALUE;
        int value=0;
        int first=0;
        int cost=0;
        int[] a= new int[map.size()];
        int k=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            max = Math.max(max,entry.getValue());
            if(max==entry.getValue()){
                value=entry.getKey();
            }
            a[k]=entry.getValue();
            k++;
        }


        boolean flag =false;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]==a[i+1]){
                flag=true;
            }else{
                flag=false;
            }
        }

        if(flag) return 0;

        int count=0;
        for(int i=0;i<A.length;i++){
            if(max!=A[i]){
                count++;
            }
        }

        return count;
    }
}
