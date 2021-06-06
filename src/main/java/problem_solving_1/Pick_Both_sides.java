package problem_solving_1;

import java.util.HashMap;
import java.util.Map;

public class Pick_Both_sides {
    public static void main(String[] args) {
        int[] A={5, -2, 3 , 1, 2};
                //{-969, -948, 350, 150, -59, 724, 966, 430, 107, -809, -993, 337, 457, -713, 753, -617, -55, -91, -791, 758, -779, -412, -578, -54, 506, 30, -587, 168, -100, -409, -238, 655, 410, -641, 624, -463, 548, -517, 595, -959, 602, -650, -709, -164, 374, 20, -404, -979, 348, 199, 668, -516, -719, -266, -947, 999, -582, 938, -100, 788, -873, -533, 728, -107, -352, -517, 807, -579, -690, -383, -187, 514, -691, 616, -65, 451, -400, 249, -481, 556, -202, -697, -776, 8, 844, -391, -11, -298, 195, -515, 93, -657, -477, 587};
        //{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
        int B=3;
                //81;
        //48;
        both_pairs(A,B);
    }

    public static void both_pairs(int[]A,int B){
        int left=0;
        int right=0;
        int max=0;
        int res=0;
        int len = A.length;
        int max_index=len-B;

        for (int i = len-B; i <len ; i++) {
            max+=A[i];
        }
        right=max;
        for (int i = 0; i < B-1; i++) {
            left+=A[i];
            if(max_index<=len-1){
                right-=A[max_index];
            }else {
                right=0;
            }
            max_index+=1;
            res =Math.max(res,left+right);
        }

        System.out.println(res);

    }

    public static void both_sides(int[] A, int B){

        int len = A.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int val =B;
        // Adding map
        for (int i = 0; i <=B; i++) {
            System.out.println(i+" "+val);
            map.put(i,val);
            val--;
        }
        System.out.println("------------");
        int[] ps = new int[len];
        //Prefix
        ps[0] = A[0];
        for (int i = 1; i < len; i++) {
            ps[i] =ps[i-1]+A[i];
        }

        int res = Integer.MIN_VALUE;
        int pair = 0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {

            int rigt_sub=(len-1)-entry.getValue();
            int right_len = len - 1;
            int key =entry.getKey()-1;
            if(entry.getKey()==0) {
                if(rigt_sub >=0){
                    pair = ps[right_len]-ps[rigt_sub];
                }else{
                    pair = ps[right_len];
                }
            }
            if(entry.getValue()==0){
                pair= ps[key-1];
            }
            if(entry.getKey()>0 && entry.getValue()>0){
                if(rigt_sub >=0){
                    pair = ps[key] + ( ps[right_len] - ps[rigt_sub] );
                }else{
                    pair = ps[key]+ps[right_len];
                }
            }
            res = Math.max(res,pair);

        }
        System.out.println(res);



    }

    private static boolean isNegative(int i) {
        return i < 0;
    }




    public static void pick(int[] A, int B){

        int len  =A.length;
        int res=Integer.MIN_VALUE;
        int l=0;
        for (int i = 0; i < B+1; i++) {
            int lval =0;
            int rval =0;
            for (int j = 0; j <l; j++) {
                lval+=A[j];
            }
            for (int j = 0; j<B-l ; j++) {
                rval+=A[len-j-1];
            }
            res = Math.max(res,lval+rval);
            l++;
        }

        System.out.println(res);
    }

    public static int pick1(int[] A, int B){
        int res=0;
        if(B==1){
            res = Math.max(A[0],A[A.length-1]);
            System.out.println(res);
            return res;
        }
        if(B==2 && A.length==2){
            res = A[0]+A[A.length-1];
            System.out.println(res);
            return res;
        }
        if(B>=2){
            int a=0;
            int b=A.length-1;
            int val = A[a]+A[b];
            res +=val;
            for (int i = 2; i <B; i++) {
                if(A[a]>A[b]){
                    b= b-1;
                    res+=A[b];
                }else{
                    res+=A[a++];
                }
            }
        }
        System.out.println(res);

        return res;
    }
}
