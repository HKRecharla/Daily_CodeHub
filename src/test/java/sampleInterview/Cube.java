package sampleInterview;

import java.util.ArrayList;

public class Cube {

    public static void main(String[] args) {

        int[] a ={1,5,27,64,125};
        for (int i = 0; i < a.length; i++) {
            int sq= (int)Math.cbrt(a[i]);
            int res= sq*sq*sq;
            if(res == a[i]){
                System.out.println(res);
            }
        }

    }
}
