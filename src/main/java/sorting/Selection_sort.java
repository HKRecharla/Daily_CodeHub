package sorting;

public class Selection_sort {


    public static void main(String[] args) {


        int[] A={74, 90, 85, 58, 69, 77, 90, 85, 18, 36};
                //{8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92};
        int B=1;
        selectio_3(A,B);
        //selection(A);
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


    public static int selectio_3(int[] A, int B){

        int len = A.length;
        for (int i = 0; i < A.length-1; i++) {
            int min =i;
            for (int j = i+1; j <A.length ; j++) {
                if(A[j]<A[min]){
                    min=j;
                }

            }
            int temp = A[min];
            A[min] =A[i];
            A[i] = temp;

        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        return A[B];
    }
}
