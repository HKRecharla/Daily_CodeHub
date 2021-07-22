package searchinf_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Find_PeakElement {


    public static void main(String[] args) {
        //HashMap<Integer, ArrayList<Integer>> map = new Hashmap<>();
    }


    public static int peak(int[] A,int start, int end){
        int mid =A.length/2;

        if(A[mid]<A[mid+1]){
            peak(A,mid+1,A.length);
        }


        return 0;
    }
}
