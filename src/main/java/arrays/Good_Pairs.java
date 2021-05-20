package arrays;

import java.util.Arrays;

public class Good_Pairs {

    public static void main(String[] args) {

        int[] A= {633299, 189622, 811214, 549111, 864962, 673215, 526221, 271580, 78335, 890164 };

                //{510827, 351151, 96897, 925335, 299818, 192489, 456948, 44720, 510589, 598577};
       int  B=968499;

     //int count =  solve(A,B);
      // System.out.println(count);
        int count = r(A,B);
       System.out.println(count);
    }

    public static int solve(int[] A, int B) {

        int len = A.length;
        Arrays.sort(A);
        int j=1;
        int count =0;
        for(int i=0;i<len-1;i++){
          int val =  (A[i]+A[j]);
            if(i!=j && val == B){
                count++;
            }
            j++;
        }
        return count;
    }

    public static int sumall(int[] A, int B){
        int len = A.length;

        Arrays.sort(A);
//        for (int i = 0; i < len; i++) {
//            System.out.print(A[i]+",");
//        }
        System.out.println();
        for(int i=0;i<len;i++) {
            for (int j = i+1; j < len; j++) {
                int val = A[i]+A[j];
                if(val ==B){
                    System.out.println(val +" "+i +" "+j);
                    return 1;
                }

            }
        }
        return 0;
    }

    public static int sumall2(int[] A, int B){
        int len = A.length;

        int count=0;
        boolean flag = true;
        int i=0;
        int j =1;
        while(flag){
            if(j==len-1){
                i++;
                j=i+1;
            }
            if(i==len-2){
                flag=false;
            }
            int val = A[i]+A[j];
            if(val ==B){
                count++;
            }
            j++;
        }
        return count;
    }

    public static int r(int[] A, int B){
        int len = A.length;

        int l=0;
        int r=len-1;

        while (l<r){
            if((A[l]+A[r]) == B){
                return 1;
            }
            else if((A[l]+A[r]) < B){
                l++;
            }else{
                r--;
            }
        }

        return 0;
    }
}
