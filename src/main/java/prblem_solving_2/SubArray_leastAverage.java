package prblem_solving_2;

public class SubArray_leastAverage {

    public static void main(String[] args) {

        int[] A={3, 7, 5, 20, -10, 0, 12};
                //{3, 7, 90, 20, 10, 50, 40};
        int B=2;
        longest_3(A,B);
    }


    public static void longest_3(int[] A, int B){
        int len= A.length;

        int res=0;
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum+=A[i];
        }

        int min = sum;
        for (int i = B; i < len; i++) {
            sum+=A[i]-A[i-B];
            if(sum<min){
                min=sum;
                res = (i-B+1);
            }
        }
        System.out.println(res);


    }

    public static void latest(int[] A,int B){
        int len = A.length;
        int[] ps = new int[len];

        ps[0]=A[0];
        for (int i = 1; i < len; i++) {
            ps[i]=ps[i-1]+A[i];
            System.out.print(ps[i]+" ");
        }
            int index=0;
        int ans=Integer.MAX_VALUE;
        System.out.println();
        for (int i = 0; i <len-B+1 ; i++) {
            int l=i;
            int r=i+B-1;
            if(l-1<0){
                l=1;
            }
            int prev=ans;
            System.out.println(ps[r]+"-"+ps[l-1]+" :: "+(ps[r]-ps[l-1]));
            ans= Math.min(ps[r]-ps[l-1],ans);
            if(ans<prev){
                index=i;
            }
        }
        System.out.println(ans);
        System.out.println(index);

    }

    public static void least_1(int[] A,int B){

        int len = A.length;
        int ans =Integer.MAX_VALUE;
        int index=0;
        int N=B;
        for (int i = 0; i < len-B+1; i++) {
            if(B==1){
                ans = Math.min(A[i],ans);
                if(ans==A[i]){
                    index=i;
                }
            }else{
                int prev_ans=ans;
                System.out.println(A[N-1]+"-"+A[i]+" :: "+(A[N-1]-A[i]));
                ans = Math.min(A[N-1]-A[i],ans);
                if(ans < prev_ans){
                    index=i;
                }
                N++;
            }
        }
        System.out.println(ans);
        System.out.println(index+1);
    }


    public static void least(int[] A, int B){

        int len = A.length;
        int[] ps = new int[len];

        ps[0]=A[0];
        for (int i = 1; i < len; i++) {
            ps[i]=ps[i-1]+A[i];
            System.out.print(ps[i]+" ");
        }
        System.out.println();
        int res=Integer.MAX_VALUE;
        int min_idx=0;
        if(B==1){
            for (int i = 0; i < len; i++) {
                int prev_res =res;
               res =  Math.min(A[i],res);
                if(res<prev_res){
                    min_idx=i;
                }
            }
        }

        for (int i = 1; i < len-B+1; i++) {
            int L=i;
            int R = i+B-1;
            int prev_res =res;
            res = Math.min(A[R]-A[L-1],res);
            System.out.println(A[R]+"-"+A[L-1]+" :: "+(A[R]-A[L-1]));
            if(res<prev_res){
                min_idx=i;
            }else{
                min_idx=i-1;
            }
        }
        System.out.println(min_idx);


    }
}
