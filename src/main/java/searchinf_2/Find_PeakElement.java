package searchinf_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Find_PeakElement {


    public static void main(String[] args) {

        int[] A={2,3};
        int l=0;
        int r=A.length-1;
        int p = peak(A,l,r);
        System.out.println(p);
    }


    public static int peak(int[] A,int l, int r){

        int mid =0;
        while (l<=r){
            mid =(l+r)/2;
            if(mid+1>=A.length || mid-1 <0){
                return A[mid];
            }
            //if(l==mid || r==mid) return A[mid];
            if(A[mid]<A[mid+1]) {
                l = mid + 1;
            }else if(A[mid]<A[mid-1]){
                r=mid-1;
            }else{
                return A[mid];
            }

       }
        return A[mid];
    }
}
