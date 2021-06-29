package bitwise_operations;

import java.util.HashMap;

public class Trailing_Zeros {
    /**
     * Problem Description
     *
     * Given an integer A, count and return the number of trailing zeroes.
     *
     *
     *
     * Problem Constraints
     * 1 <= A <= 109
     *
     *
     *
     * Input Format
     * First and only argument is an integer A.
     *
     *
     *
     * Output Format
     * Return an integer denoting the count of trailing zeroes.
     *
     *
     *
     * Example Input
     * Input 1:
     *
     *  A = 18
     * Input 2:
     *
     *  A = 8
     *
     *
     * Example Output
     * Output 1:
     *
     *  1
     * Output 2:
     *
     *  3
     */


    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.println(map.containsKey(12));
    }

    public int solve(int A) {

        int count=0;
        int rem=0;
        while(A>0){
            rem = A%2;
            A=A/2;
            if(rem==0){
                count++;
            }else{
                break;
            }
        }

        return count;
    }
}
