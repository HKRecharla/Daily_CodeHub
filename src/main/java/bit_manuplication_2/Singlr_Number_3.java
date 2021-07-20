package bit_manuplication_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Singlr_Number_3 {
    public static void main(String[] args) {
        int[] A={186, 256, 102, 377, 186, 377};
       non_dup(A);

    }

    public static void non_dup(int[] A){
        int xa =0;
        int xb=0;
        for (int i = 0; i < A.length; i++) {
            xa=xa^A[i];
        }
        int m = (xa&(xa-1))^xa;
        xa=0;
        for (int i = 0; i < A.length; i++) {
            if((A[i]&m)==1)
                xa = xa^A[i];
            else
                xb = xb^A[i];
        }

        System.out.println(Math.min(xa,xb)+" "+Math.max(xa,xb));

    }

    public static void single_nu(int[] A){
        Arrays.sort(A);
        ArrayList<Integer> list = new ArrayList<>();
        int ans=0;
        for (int i = 0; i < A.length; i++) {
        ans^=A[i];
        }
        list.add(ans);
        System.out.println(list);
        for (int i = 0; i < A.length; i++) {
            if(list.get(0)!=ans){
                ans^=A[i];
            }
        }
        list.add(ans);
        System.out.println(list);
    }
}
