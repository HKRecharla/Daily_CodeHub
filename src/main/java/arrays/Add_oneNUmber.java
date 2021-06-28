package arrays;

import java.util.ArrayList;

public class Add_oneNUmber {
    public static void main(String[] args) {

        int[] A={0,9,9,9};
        //add(A);
    }

    public static void add(ArrayList<Integer> A){

        int n = A.size();

        int carry=1;
        ArrayList<Integer> ans = new ArrayList<>(A);
        for (int i = n-1; i >=0; i--) {
            if(carry==0){
                break;
            }

            int digit = A.get(i);
            int num  = digit+carry;
            if(num>9){
                carry=1;
                digit=0;
            }else {
                carry=0;
                digit=num;
            }

            ans.set(i,digit);
        }
        if(carry==1){
            ans.add(0,carry);
        }
        while (0<ans.size() && ans.get(0)==0){
            ans.remove(0);
        }

        System.out.println(ans);

    }
}
