package problem_solving_3;

import java.util.HashMap;

public class Contihous_Array {

    public static void main(String[] args) {

        int[] A={0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1 };
                //{0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1 };
                //{0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0};
        //A : [ 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0 ]   o/p=10
        contigous_3(A);

    }

    public static void contigous_3(int[] A){

        int len = A.length;
        int[] ps = new int[len];

        int f=0;
        for (int i = 0; i <len ; i++) {
            f+=A[i];
            if(A[i]==0){
                A[i]=-1;
            }
            System.out.print(A[i]+" ");
        }
        System.out.println();

        ps[0]=A[0];

        System.out.print(ps[0]+" ");
        for(int i=1;i<len;i++){
            ps[i]=ps[i-1]+A[i];
            System.out.print(ps[i]+" ");
        }
        System.out.println();


        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int ans=0;
        for (int i = 0; i < len; i++) {
            if(map.containsKey(ps[i])){
                ans=Math.max(ans,i-(map.get(ps[i])));
                System.out.println(ans);
            }else{
                map.put(ps[i],i);
            }
        }
        System.out.println(ans);

    }


    public static void contigous_2(int[] A){

        int len = A.length;

        int zero=0;
        int one=0;
        for (int i = 0; i < len; i++) {
            if(A[i]==0){
                zero++;
            }else{
                one++;
            }
        }

        int sum =0;
        if(zero>one){
            sum=zero-one;
            sum=one*2;
        }else if(zero<one){
            sum = one-zero;
            sum=sum*2;
        }else{
            sum=len;
        }

        System.out.println(sum);

    }

    public static void contigous_1(int[] A){

        int len = A.length;

        for (int i = 0; i < len; i++) {
            if(A[i]==0){
                A[i]=-1;
            }
        }
        int sum=0;
        for (int i = 0; i < len; i++) {
            sum+=A[i];
        }

        System.out.println(sum);
        int total = len-sum;
        System.out.println(total);
    }
}
