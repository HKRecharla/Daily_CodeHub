package arrays;

public class Rain_Trap {
    public static void main(String[] args) {
        int[] A= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        rain(A);
    }




    public static void rain(int[] A){
        int n = A.length;

        int[] PRA  = new int[n];
        int[] POA= new int[n];
        //prefixMax
        PRA[0] = A[0];
        for (int i = 1; i <n ; i++) {
            PRA[i] = Math.max(PRA[i-1],A[i]);
        }

        //postfix
        POA[n-1]=A[n-1];
        System.out.println(POA[n-1]);
        for (int i = n-2; i >=0 ; i--) {
            POA[i] = Math.max(POA[i+1],A[i]);
            System.out.println(POA[i+1]+" "+A[i]+" = "+POA[i]);
        }

        int sum =0;
        for (int i = 0; i < n; i++) {

             int height = Math.min(PRA[i],POA[i]);
            sum = sum+height-A[i];
        }

        System.out.println();
        System.out.println(sum);

    }



    public static void pratice(int[] A){

        int n= A.length;

        int MAX = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(A[i]>=MAX){
                MAX=A[i];
                index=i;
            }
        }

        int sum =0;
        for (int i = index; i >=2; i--) {
            if(A[i]>A[i-1] && A[i-1]<A[i-2]){
                sum=sum+Math.abs(A[i-1]-A[i-2]);
            }
        }

        System.out.println(sum);


    }
}
