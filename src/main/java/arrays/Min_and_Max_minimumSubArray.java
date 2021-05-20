package arrays;

public class Min_and_Max_minimumSubArray {

    public static void main(String[] args) {

        int[] A =
                //{1,1,1,5,5,5,9,5,5,5,9,1};
        //{0,1,2,3,5,8};
                {1,2,4,1,3,4,4};
        //System.out.println(Math.min(4,Math.abs(4-4)+1));
        solve2(A);
    }


    public static void subarray(int[] A){


        int len = A.length;
        int min = A[0];
        int max= A[0];
        for (int i = 0; i < len; i++) {
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);
        }

        System.out.println("MIN :: "+min);
        System.out.println("MAX :: "+max);

        int ans=Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {

            if(A[i] == min){
                for (int j = i+1; j < len; j++) {
                    if(A[j]==max){
                        ans = Math.min(ans,(j-i)+1);
                        System.out.println("i : "+i+" j :"+j+" --> "+ans);
                        break;
                    }
                }
            }
            if(A[i] == max){
                for (int j = i+1; j < len; j++) {
                    if(A[j]==min){
                        ans = Math.min(ans,(j-i)+1);
                        System.out.println("i : "+i+" j :"+j+" --> "+ans);
                        break;
                    }
                }
            }
        }


    }


    public static void solve2(int[] A){
        int len = A.length;

        int min=A[0];
        int max=A[0];
        for (int i = 0; i <len; i++) {
                min = Math.min(min,A[i]);
                max = Math.max(max,A[i]);
        }

        System.out.println(min);
        System.out.println(max);

        int latest_min=-1;
        int latest_max=-1;
        int ans=len;
        for (int i = 0; i < len; i++) {
            if(A[i] == min){
                latest_min =i;
                if(latest_max != -1){
                   int  av = Math.abs(latest_min-latest_max)+1;
                    System.out.println("abs : "+av);
                    ans = Math.min(ans,av);
                    System.out.println("ans min :: "+ans);
                }
            }

            if(A[i] == max){
                latest_max =i;
                if(latest_min != -1){
                    int  av = Math.abs(latest_min-latest_max)+1;
                    System.out.println("abs : "+av);
                    ans = Math.min(ans,av);
                    System.out.println("ans min :: "+ans);
                }
            }
        }
        System.out.println(ans);
    }
}
