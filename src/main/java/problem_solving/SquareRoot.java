package problem_solving;

public class SquareRoot {

    public static void main(String[] args) {
        int N=2147483647;

        int v = flor_sqrt(N);
        System.out.println(Math.floor(v));



    }


    public static int sqrt(int N){
        int temp=0;
        for (int i = 0; i <N ; i++) {
            int v = i*i;
            if(v>=N){
                temp=i;
                return temp;
            }
        }
        return temp;
    }


    public static int flor_sqrt(int A){

        int start=1;
        int end=A;
        int ans=0;

        if(A==0 || A==1) return A;

        while (start<=end){
            int mid = (int)Math.floor((start+end)/2);
            if(mid*mid ==A) return mid;

            if (mid*mid <A){
                start = mid+1;
                ans=mid;
            }else{
                end=mid-1;
            }
        }

        return ans;

    }


}
