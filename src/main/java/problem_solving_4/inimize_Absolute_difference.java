package problem_solving_4;

public class inimize_Absolute_difference {

    public static void main(String[] args) {
        int[] A = { 1, 4, 5, 8, 10 };
        int[] B = { 6, 9, 15 };
       int[]  C = { 2, 3, 6, 6 };

        int i=0;
        int j=0;
        int k=0;

        int curr= Integer.MAX_VALUE;
        while (i<A.length && j<B.length && k<C.length){
           int  mins= min1(A,i,j,k);
            int maxs =max1(A,i,j,k);
            int val = maxs-mins;
             curr = Math.min(curr,maxs-mins);
            System.out.println(curr);

        i++;
        j++;
        k++;

        }

        System.out.println(curr);

    }

    public static int min1(int[] A,int i, int j, int k){
        int min=A[i];
        if(A[i]<=A[j] && A[i] <=A[k]){
            min =A[i];
        }else if(A[j]<=A[i] && A[j]<=A[k]){
            min=A[j];
        }else{
            min=A[k];
        }
        return min;
    }

    public static int max1(int[] A,int i, int j, int k){
        int max=A[i];
        if(A[i]>=A[j] && A[i] >=A[k]){
            max =A[i];
        }else if(A[j]>=A[i] && A[j]>=A[k]){
            max=A[j];
        }else{
            max=A[k];
        }
        return max;
    }
}
