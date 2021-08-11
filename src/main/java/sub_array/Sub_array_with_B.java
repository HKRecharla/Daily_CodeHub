package sub_array;

import java.util.HashMap;

public class Sub_array_with_B {

    public static void main(String[] args) {

        int A[] ={1,2,4,3,5,1};
        int B=50;
        sub(A,B);
    }


    public static void sub(int[] A, int B){

        int len = A.length;
        int[] pa =new int[A.length];
        pa[0]=A[0];
        for (int i = 1; i <len; i++) {
            pa[i]=pa[i-1]+A[i];
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        int start=0;
        int end =0;
        for (int i = 0; i < len; i++) {
            int val = pa[i]-B;
            if(map.containsKey(val)){
                start=map.get(val)+1;
                end=A[i];
                break;
            }else{
                map.put(pa[i],i);
            }
        }


        for (int i = start; i <=end ; i++) {
            System.out.print(A[i]+" ");
        }


    }
}
