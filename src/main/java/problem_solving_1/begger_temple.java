package problem_solving_1;

public class begger_temple {

    public static void main(String[] args) {

        int A=10;
        int[][] B={{1, 3, 10},{6, 9, 2},{3, 5, 3},{2, 8, 4},{6, 7, 5}};
        begger(A,B);
    }

    public static void begger(int A,int[][] B){

        int[] a= new int[A];
        //insterting zeros till array size
        for (int i = 0; i < A; i++) {
            a[i]=0;
        }

        for (int i = 0; i < B.length; i++) {
                int val = B[i][B[i].length-1];
                int first=B[i][0];
                int second=B[i][1];

                a[first-1]+=val;
                if(second<a.length){
                    a[second] +=(-val);
                }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        int[] ps = new int[a.length];
        ps[0]=a[0];
        for (int i = 1; i < ps.length; i++) {
            ps[i]= ps[i-1]+a[i];
        }
        System.out.println("");

        for (int i = 0; i < ps.length; i++) {
            System.out.print(ps[i]+" ");
        }
    }
}
