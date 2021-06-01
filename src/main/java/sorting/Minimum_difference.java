package sorting;

import java.util.Arrays;
import java.util.HashMap;

public class Minimum_difference {

    public static void main(String[] args) {


        int[] A={2, 6, 3, 9, 8};
        int B=3;

        minimum_diff(A,B);

    }


    public static void minimum_diff(int[] A,int B){

        HashMap<Integer,Integer> map = new HashMap<>();

        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else {
                map.put(A[i],1);
            }
        }
        while(min<max && B!=0){
            if(map.get(min) < map.get(max)){
                if(B<map.get(min)){
                    break;
                }
                if(map.containsKey(min+1)){
                    map.put(min+1,map.get(min+1)+map.get(min));
                }else{
                    map.put(min+1,map.get(min));

                }
                B=B-map.get(min);
                min++;
            }else{
                if(B<map.get(max)){
                    break;
                }
                if(map.containsKey(max-1)){
                    map.put(max-1, map.get(max-1) + map.get(max));
                }else {
                    map.put(max-1,map.get(max));
                }
                B=B-map.get(max);
                max--;
            }
        }


        System.out.println(Math.abs(max-min));
    }


    public static void mini(int[] A, int B){


        int len =A.length;
        boolean flag =true;
        int i=0;
        int j=1;

        int end =len-1;
        int endr = len-2;

        Arrays.sort(A);
        int count =0;
       while(j<endr){
           if(count>=B){
    break;
           }
           if(A[i] <A[j]){
            A[i]=A[i]+1;
            count++;
           }else{
               i++;
               j++;
           }
           if(A[endr] <A[end]){
               A[endr] =A[endr]+1 ;
               count++;
           }else{
               endr--;
               end--;
           }
       }
        System.out.println(A[0]-A[len-1]);
    }



    public static int solve2(int[] A, int B){

        int len = A.length;

        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);

        }
        System.out.println(min);
        System.out.println(max);

        int l=0;
        int r =len-1;
        int count = 0;

        for (int i = 0; i < len; i++) {
            System.out.print(A[i]+" ");
        }
        Arrays.sort(A);

        System.out.println();
        for (int i = 0; i < len; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        if(B==max && A[0] == B){
            return 0;
        }
        while (l<r){
            if(A[l] < A[l+1]){
                //if(A[l+1] != A[r]){
                    A[l] = A[l]+1;
                    count++;
                //}
            }else if(A[l]==A[l+1]){}
            else {
                l++;
            }
            if(l-1>=0 && A[l-1] <A[l]){
                l--;
            }

            if(A[r] >A[r-1]  ){
                A[r] =A[r]-1;
                count++;
                if(A[0] == A[len-1]){
                    break;
                }
            }else if(A[r] ==A[r-1] ){
                r++;
            }
            else{
                r--;
            }

        }

        int res = A[len-1]-A[0];

        System.out.println(res);
        return res;
    }

    public static void solve1(int[] A, int B){
        int len = A.length;

        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_index=0;
        int max_index=0;
        for (int i = 0; i < len; i++) {

            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);

        }
        System.out.println(min +" "+min_index);
        System.out.println(max+" "+max_index);

        int res=0;
        for (int i = 0; i < B; i++) {
            if(max-min<=0 && max-min<=1){
                System.out.println("Already Closest");
                break;
            }else if(max > min){
                max = max-1;
                res = max-min;
            }else if(min>max){
                min = min-1;
                res = max-min;
            }

            if(max-min ==1){
                res = max-min;
            }
        }

        System.out.println(res);
    }
}
