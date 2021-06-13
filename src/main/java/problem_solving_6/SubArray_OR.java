package problem_solving_6;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArray_OR {


    public static void main(String[] args) {

        int[] A={1, 2, 3, 4, 5};
                //{347148, 221001, 394957, 729925, 276769, 40726, 552988, 29952, 184491, 146773, 418965, 307, 219145, 183037, 178111, 81123, 109199, 683929, 422034, 346291, 11434, 7327, 340473, 316152, 364005, 359269, 170935, 105784, 224044, 22563, 48561, 165781, 9329, 357681, 169473, 175031, 605611, 374501, 6607, 329965, 76068, 836137, 103041, 486817, 195549, 107317, 34399, 56907, 37477, 189690, 36796, 376663, 39721, 177563, 174179, 183646, 217729, 408031, 429122, 631665, 282941, 526797, 262186, 306571, 63613, 57501, 70685, 226381, 1338, 9360, 130360, 20300, 400906, 87823, 180349, 108813, 18181, 119185, 1, 102611, 63591, 12889, 311185, 383896, 8701, 76077, 75481, 386017, 153553, 304913, 383455, 105948, 142885, 1, 12610, 137005, 119185, 16948, 66171, 123683};
        //System.out.println(4|5);
        solve(A);
    }


    public static void solve(int[] A) {
        int []idx = new int[50];
        int n = A.length;
        long ans = 0;
        for(int i=1; i<=n; ++i){
            long tmp = A[i-1];
            for(int j=0; j<=31; ++j){
                long pw = 1l << j;
                if((tmp & pw) > 0){
                    ans += pw * i;
                    idx[j] = i;
                } else if(idx[j]>0) {
                    ans += pw * idx[j];
                }
            }
        }
        int a =  (int)(ans%1000000007);
        System.out.println(a);
    }


    public static void subArray(int[] A){
        int MOD = 1000000007;
        int len = A.length;

        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i <len ; i++) {
            list.add((long) A[i]);
            long v =A[i]%MOD;
            for (int j = i+1; j <len; j++) {
                v = (v%MOD|A[j]%MOD)%MOD;
                System.out.println(A[j-1]+"_"+A[j]+" --> "+v);
                list.add(v);
            }
        }
        System.out.println(list);

        int sum =0;
        for (int i = 0; i < list.size(); i++) {
            sum+=(long)list.get(i);
        }
        System.out.println(sum);
    }


    public static void bitwise_to_decimal(){

    }
}
