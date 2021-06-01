package arrays;

import java.math.BigInteger;
import java.util.ArrayList;

public class CountNUmber_add {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);


        ArrayList<Integer> g = plusOne(arrayList);
        for (int i = 0; i < g.size(); i++) {
            System.out.println(g.get(i));
        }

    }


    public static void i(int[] A){

        String s ="";
        for (int i = 0; i < A.length; i++) {
            s=s+A[i];
        }
        BigInteger bi1 = new BigInteger(s);
        BigInteger bi2 = new BigInteger("1");

        String[] sp =  String.valueOf(bi1.add(bi2)).split("");

        int[] ar = new int[sp.length];
        for (int i = 0; i <sp.length ; i++) {
            ar[i]=Integer.parseInt(sp[i]);
            //System.out.print(ar[i]);
        }
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        int carry = 1;
        ArrayList<Integer> result = new ArrayList<>(A);
        int len = A.size();
        for (int i = len - 1; i >= 0; i--) {
            if (carry == 0) {
                // no need to check remaining digits
                break;
            }
            int digit = A.get(i);
            // plus
            int num = digit + carry;
            if (num >= 10) {
                carry = num / 10;
                digit = num % 10;
            } else {
                carry = 0;
                digit = num;
            }
            result.set(i, digit);
        }
        // if 9 9 9
        if (carry != 0) {
            result.add(0, 1);
        }
        // removing leading zeros
        int index = 0;
        while (index < result.size() && result.get(index) == 0) {
            result.remove(index);
        }

        return result;
    }
}
