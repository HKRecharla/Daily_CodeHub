package prblem_solving_2;

import java.util.Arrays;
import java.util.HashMap;

public class Maximum_diff {

    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
                //{5, 17, 100, 11};
                //{93, 51, 84, 81, 89, 82, 28, 78, 86, 35, 64, 38, 49, 99, 83};
        int B=2;
                //3;
                //4;
        maximum_difference_2(A,B);
    }




    public static void maximum_difference_2(int[] A , int B){
        Arrays.sort(A);
        int len =A.length;

        int[] ps = new int[len];
        ps[0]=A[0];
        for (int i = 1; i < len; i++) {
            ps[i] = ps[i-1]+A[i];
        }
        int sum=0;
        int s1=0;
        for (int i = 0; i < B; i++) {
            s1+=A[i];
        }

        int s2=ps[len-1]-s1;

        int s1_=0;
        for (int i = len-B; i <len ; i++) {
            s1_+=A[i];
        }
        int s2_=ps[len-1]-s1_;

        int sum1 = s1-s2;
        int sum2 = s1_-s2_;

        int max = Math.max(Math.abs(sum1),Math.abs(sum2));
        System.out.println(max);


    }

    public static void maximum_difference_1(int[] A , int B){
        Arrays.sort(A);
        int s1=0;
        if(B<A.length/2){
            for (int i = 0; i < B; i++) {
                s1+=A[i];
            }
        }else{
            for (int i = A.length-B; i <A.length ; i++) {
                s1+=A[i];
            }
        }
        int s=0;
        for (int i = 0; i < A.length; i++) {
            s+=A[i];
        }

        int s2=s-s1;
        System.out.println(Math.abs(s1-s2));
    }

    

    public static void maximum_difference(int[] A , int B){
        Arrays.sort(A);
        int len =A.length;

        int[] ps = new int[len];
        ps[0]=A[0];
        for (int i = 1; i < len; i++) {
            ps[i] = ps[i-1]+A[i];
            System.out.print(ps[i]+" ");
        }
        System.out.println();
        int max =0;
        for (int i = 0; i < B; i++) {
            max+=A[i];
        }
        int s2 = ps[len-1]-max;
        int s1=max;
        System.out.println(s2);
        System.out.println(s1);

        int sum =s2-s1;
        System.out.println(sum);
        for (int i = B; i <len ; i++) {
            s1 = ps[i]-ps[i-B];
            s2 = ps[len-1]-s1;
            System.out.println(s2+"_"+s1+" "+(s2-s1));
            sum = Math.max(sum,s2-s1);
        }

        System.out.println(sum);




    }
}
