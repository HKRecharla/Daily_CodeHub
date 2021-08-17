package sampleInterview;

public class Sort_selection {
    public static void main(String[] args) {

        int[] A={1,2,3,4};
        A = sort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
    }

    public static int[] sort(int[] A){

        int len = A.length;
        int min=0;
        for (int i = 0; i < len; i++) {
            min =i;
            for (int j = i+1; j <len ; j++) {
                if(A[min]<A[j]){
                    min=j;
                }
            }
            int temp=A[min];
            A[min] =A[i];
            A[i] =temp;
        }
        return A;
    }
}
