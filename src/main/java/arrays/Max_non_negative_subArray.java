package arrays;

import java.util.ArrayList;

public class Max_non_negative_subArray {

    public static void main(String[] args) {

        int[] A={-75249, 43658, 11272, -50878, 37709, 38165, -43042, -22503};
                //{1, 2, 5, -7, 2, 3};

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            ans.add(A[i]);
        }
        maxSubarray_1(ans);
    }


    public static void maxSubarray(int[] A){

        int n= A.length;

        int[] p= new int[n];

        p[0]=A[0];
        if(p[0]<0){
            p[0]=0;
        }
        System.out.print(p[0]+" ");
        for (int i = 1; i <n ; i++) {

            p[i]=p[i-1]+A[i];
            if(A[i]<0){
                p[i]=0;
            }
            System.out.print(p[i]+" ");
        }

        int max = Integer.MIN_VALUE;
        int index=0;
        for (int i = 0; i < n; i++) {

            if(p[i]>max){
                max=p[i];
                index=i;
            }
        }
        System.out.println();

        int si =0;
        for (int i = index ; i >=0; i--) {
            //System.out.print(A[i+index]+" ");
            if(p[i]==0){
                si=i+1;
                break;
            }
            if(p[0]!=0){
                si=0;
            }
        }
        int d = si+index+1;
        int[] res = new int[d];
        for (int i = si; i <index+1 ; i++) {

            res[i]=A[i];
            System.out.print(res[i]+" ");
        }


    }


    public static void maxSubarray_1(ArrayList<Integer> A){
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> copy = new ArrayList<>();
        long sum = 0;
        long temp = 0;

        for (int num : A) {
            if (num >= 0) {
                temp += num;
                copy.add(num);
            }
            else {
                temp = 0;
                copy.clear();
            }

            if (temp > sum || (temp == sum && ans.size() < copy.size())) {
                sum = temp;
                ans.clear();
                ans.addAll(copy);
            }
        }
        System.out.println(ans);

    }

}
