package hashing;

import java.util.*;

public class CommonElements {


    public static void main(String[] args) {

        int[] A={2, 1, 4, 10};//{1, 2, 2, 1};
        int[] B={3, 6, 2, 10, 10};// {2, 3, 1, 2};
        ArrayList<Integer> a= new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            a.add(A[i]);
        }
        for (int i = 0; i < B.length; i++) {
            b.add(B[i]);
        }
        ArrayList<Integer> ar = solve(a, b);

        System.out.println(ar);
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++){
            if(map.containsKey(A.get(i))){
                map.put(A.get(i),map.get(A.get(i))+1);
            }else{
                map.put(A.get(i),1);
            }
        }

        for (int i = 0; i < B.size(); i++) {
            if(map.containsKey(B.get(i)) && map.get(B.get(i))>0){
                ar.add(B.get(i));
                map.put(B.get(i),map.get(B.get(i))-1);
            }
        }


        return ar;
    }
}
