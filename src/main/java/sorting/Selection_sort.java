package sorting;

public class Selection_sort {


    public static void main(String[] args) {


        int[] A={6, 4, 3, 7, 2, 8};
        selection2(A);

    }


    public static void selection(int[] A){

        int len = A.length;

        int[] a= new int[len-1];
        System.out.println(a.length);
        int val=0;
        for (int i = 0; i < A.length; i++) {
            int min=Integer.MAX_VALUE;
            for (int k = i; k < len; k++) {
                min = Math.min(min,A[k]);
            }
            for (int j = i; j < A.length; j++) {
                if(A[j]==min){
                    int temp = A[i];
                    A[i] =A[j];
                    A[j]=temp;
                    if(a.length>i){
                        a[val]=j;
                        System.out.print (a[val]+" ");
                        val++;

                    }
                    break;
                }

            }

        }

    }

    public static void selection2(int[] A){

        int len = A.length;

        int[] a= new int[len-1];
        for (int i = 0; i < A.length-1; i++) {
           int  min =i;
            for (int j = i+1; j < A.length; j++) {
                if(A[j]<A[min]){
                    min=j;
                    int temp = A[min];
                    A[min] =A[i];
                    A[i]=temp;

                }
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < A.length; ++i) {
            System.out.print(A[i]+" ");
        }

    }
}
