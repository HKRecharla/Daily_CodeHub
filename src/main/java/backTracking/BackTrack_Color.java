package backTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BackTrack_Color {

    public static void main(String[] args) {

        //subset(2);
        permutation("ABC");
    }

    public static void permutation(String A){
        Set<String>ans =new HashSet<String>();
        int[] arr = new int[A.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=0;
        }
        System.out.println(A);
        String s="";
        int n= A.length();
        recursion(s,n,A,arr,ans);

        for (String x:ans
             ) {
            System.out.println(x);
        }

    }

    public static void subset(int A){
        Set<ArrayList> set =new HashSet<ArrayList>();

        int[] curr= new int[A];
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> s = new ArrayList<>();
            recursion_ar(s,A,A,curr,set,i);
            for (int j = 0; j < s.size(); j++) {
                System.out.print(s.get(i));
            }
            System.out.println();
        }



    }


    public static void recursion_ar(ArrayList<Integer> s, int n, int A, int[] curr, Set<ArrayList> set,int index){
        if (s.size()==n){
            set.add(s);
            return;
        }
        curr[index] =1;
        s.add(curr[index]);
        recursion_ar(s,n,A,curr,set,index+1);
        curr[index] =2;
        s.add(curr[index]);
        recursion_ar(s,n,A,curr,set,index+1);
        return;
    }



    public static void recursion(String s, int n, String A,int[] arr,Set<String> set){

        if(s.length()==n){
            set.add(s);
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){ // if 0 go inside
                arr[i]=1;
                s+=String.valueOf(A.charAt(i));
                recursion(s,n,A,arr,set);
                arr[i]=0;
                s=s.substring(0, s.length() - 1);
            }
        }
    }


}
