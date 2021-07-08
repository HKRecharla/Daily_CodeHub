package basic_problms;

import java.util.ArrayList;

public class Fibonic_series {


    public static void main(String[] args) {


        int A=1000000000%1000000007;
        int MOD =1000000007;
        ArrayList<Integer> arr = new ArrayList<>(A+2);
        arr.add(0);
        arr.add(1);

        for (int i = 2; i <=A; i++) {
            arr.set(i,(arr.get(i-1)+arr.get(i-2))%MOD);
        }
        System.out.println(arr.get(A)%MOD);
    }
}
