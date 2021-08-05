package searchinf_2;

public class Painters {

    public static int required(int[] C, long mid){

        int painters =1;
        int timetoPaint=0;
        for (Integer b:C) {
            timetoPaint+=(long)b;
            if(timetoPaint>mid){
                painters++;
                timetoPaint=b;
            }
        }
        return painters;
    }

    public static int solve(int A, int B, int[] C){
        int MOD=10000003;
        long ans=0;
        int max =Integer.MIN_VALUE;

        long high =0;
        long low=-1;
        for (Integer b:C
             ) {
            high+=(long)b;
            max = Math.max(max,b);
        }
        low=(long)max;

        while (low<=high){
            long mid = (low+(high-low)/2);
            if(required(C,mid)<=A){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return (int) (((ans%MOD)*(B%MOD))%MOD);
    }

    public static void main(String[] args) {
        int A=4;
        int B=10;
        int[] C={884,228,442,889};
        int ans = solve(A,B,C);
        System.out.println(ans);
    }
}
