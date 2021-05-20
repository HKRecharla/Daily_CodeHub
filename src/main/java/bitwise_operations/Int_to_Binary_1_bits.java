package bitwise_operations;

import java.util.Arrays;

public class Int_to_Binary_1_bits {


    public static void main(String[] args) {
        int[] A = {6,8,1,6,11};
       int a =  solve1(A);

        System.out.println(a);
    }


    public static void solve(int decimal){

        int[] a = new int[40];

        int count =0;
        while (decimal>0){

            a[count++] = decimal%2;
            decimal = decimal/2;
        }

        int sum=0;
        for (int i = 0; i < count; i++) {
           sum=sum+a[i];
        }
        System.out.println(sum);
    }


    public static int solve1(int[] A) {

       // Arrays.sort(A);
        int size = A.length;
        int large = A[size-1];
        int second = A[size-2];

        int find = (large+second)/2;

        int val = (find-size);
        return val;
    }
}
