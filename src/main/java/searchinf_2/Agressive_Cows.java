package searchinf_2;

import java.util.Arrays;

public class Agressive_Cows {

    public static void main(String[] args) {
        int[] A={1,2};
        int B=2;
        agresive(A,B);
    }


    public static void agresive(int[] A, int B){

        Arrays.sort(A);
        int len = A.length;
        int l=0;
        int r=A[len-1];
        int ans =0;
        while (l<=r){
            int mid= (l+r)/2;
            if(check(A,B,mid)){
                l=mid+1;
                ans=mid;
            }else{
                r=mid-1;
            }
        }
        System.out.println(ans);
    }

    public static boolean check(int[] A, int cows,int distance){
        int dis =0;
        cows--;
        for (int i = 1; i <A.length && cows>0 ; i++) {
            if(dis+(A[i]-A[i-1])>=distance){
                cows--;
                dis=0;
            }else{
                dis+=A[i]-A[i-1];
            }
        }
        if(cows<=0){
            return true;
        }
        return false;
    }
}
