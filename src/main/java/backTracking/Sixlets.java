package backTracking;

import java.util.ArrayList;
import java.util.Collections;

public class Sixlets {
    static ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
    static int ans=0;
    public static void main(String[] args) {

        int[] A={5, 17, 1000, 11 };
        int B=4;

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            num.add(A[i]);
        }

        ans=0;
        getSub(num,0,0,B);
        System.out.println(ans);
    }

    public static void allsub(ArrayList<Integer> num){
        ArrayList<Integer> curr = new ArrayList<>();
        Collections.sort(num);
        subSeq(num,0,curr);
    }


    public static void getSub(ArrayList<Integer> A, int index, int sum, int B){

        if(sum>1000) return;
        if (B==0){
            if (sum <= 1000) { ans++; } return;
        }

        for (int i = index; i < A.size(); i++) {
            sum+=A.get(i);
            getSub(A,i+1,sum,B-1);
            sum-=A.get(i);
        }

    }



    public static void subSeq(ArrayList<Integer> num, int start, ArrayList<Integer> curr){
        add_arr(curr);
        System.out.println(curr);
        for (int i = start; i < num.size(); i++) {
            if(i>start && num.get(i)== num.get(i-1)){
                continue;
            }
            curr.add(num.get(i));
            subSeq(num,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }


    public static ArrayList<ArrayList<Integer>> add_arr(ArrayList<Integer> arr){
        ar.add(arr);
        return ar;
    }


}
