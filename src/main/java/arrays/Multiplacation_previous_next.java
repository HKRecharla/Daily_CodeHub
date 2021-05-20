package arrays;

public class Multiplacation_previous_next {

    public static void main(String[] args) {


        int[] A={0};
        pre(A);

    }

    public static void pre(int[] A){


        int len = A.length;



        int first = A[0]*A[1];
        int last = A[len-1]*A[len-2];

        int[] arr = new int[len];
        arr[0]=first;
        arr[len-1]=last;

        int j=1;
        for (int i = 0; i < len-2; i++) {
            int val = A[i]*A[j+1];
            arr[j]=val;
            j++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
