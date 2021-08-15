package stacks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class MaxFrequency {
    static HashMap<Integer,Integer> map;
    static HashMap<Integer, Stack<Integer>> max_map;
    static ArrayList<Integer> ans;
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> max_sol(ArrayList<ArrayList<Integer>> A){
        map = new HashMap<>();
        max_map = new HashMap<>();
        ans = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            if(A.get(i).get(0)==1) push(A.get(i).get(1));
            else pop();
        }
        return ans;
    }

    static int max =Integer.MIN_VALUE;

    public static void push(int x){

        if(map.containsKey(x)){
            map.put(x,map.get(x)+1);
        }else{
            map.put(x,1);
        }



        if(max<map.get(x)) max= map.get(x);
        ans.add(-1);
    }

    public static void pop(){
        int val = max_map.get(max).peek();
        ans.add(val);
        max_map.get(max).pop();
        if(max_map.get(max).isEmpty()) max--;

        map.put(val,map.get(val)-1);
    }
    
    



}
