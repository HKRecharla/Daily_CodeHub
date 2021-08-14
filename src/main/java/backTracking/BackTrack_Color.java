package backTracking;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BackTrack_Color {

    public static void main(String[] args) {

        String s = "hari";
        s="krishna";
        System.out.println(s);
       // permutation("ABC");
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
