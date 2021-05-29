package sorting;

public class Devotes {

    public static void main(String[] args) {
        int[][] A = {{1,2,10},{2,3,20},{2,5,25}};

        int N=5;

        int[] a= new int[N];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length-1; j++) {
                int val = A[i][j]-1;
                a[val] = a[val]+A[i][A[0].length-1];
                System.out.println(a[val]);
            }
        }



    }
}
