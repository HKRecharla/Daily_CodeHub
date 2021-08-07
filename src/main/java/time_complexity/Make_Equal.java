package time_complexity;

public class Make_Equal {

    public static void main(String[] args) {
        int[] A={2,4,2,1,5};
                //{1,4,4};
                //{4,1,2,5,4};
       int a = solve(A);
        System.out.println(a);
    }

    public static int solve(int[] A) {
        int count=0;

        int min=Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            min= Math.min(min,A[i]);
        }
        for(int i=0;i<A.length-1;i++){
            if(A[i]==A[i+1]){
                count=0;
            }else{
                count++;
                break;
            }
        }
        if(count==0) return 0;

        count=0;
        int i=0;
        while(i<A.length){
            if(A[i]>min){
                A[i]=(int)Math.floor(A[i]/2);
                count++;
            }

//            else if(A[i+1] > A[i]){
//                A[i+1]=(int)Math.floor(A[i+1]/2);
//                count++;
//            }
            else if(A[i]==A[i+1]){
                i++;
                continue;

            }
            if(A[i]==min){
                i++;
            }
//            else if(A[i]<A[i+1]){
//                i++;
//            }
        }


        return count;
    }
}
