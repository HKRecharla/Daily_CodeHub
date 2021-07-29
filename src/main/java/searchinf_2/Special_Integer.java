package searchinf_2;

public class Special_Integer {

    public int solve(int[] A, int B) {

        int l=1; // start
        int h=A.length; // end
        int res=1; // result
        while (l<h){
            int m = (l+h+1)/2; // mid
            long  r=0;
            for (int i = 0; i < m; i++) { // get sum of till mid
                r+=A[i];
            }
            if(r>B){ // if sum >B ==> h =mid-1
                h=m-1;
                continue;
            }

            for (int i = 1; i <=A.length-m; i++) { // traverse till length
                r=r-A[i-1]+A[i+m-1]; // sum-A[0]+A[0+mid] ==>
                if(r>B){
                    h=m-1;
                    break;
                }
            }

            if(r>B){
                continue;
            }else {
                res=m;
                l=m;
            }
        }
        return res;
    }
}
