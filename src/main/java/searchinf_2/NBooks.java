package searchinf_2;

public class NBooks {

    public static void main(String[] args) {

        int [] A={73, 58, 30, 72, 44, 78, 23, 9};
        int B=5;
        int[] pa= prefix(A);
        bookd(pa);
    }


    public static int[] prefix(int[] A){
        int[] pa= new int[A.length];
        pa[0]=A[0];
        for (int i = 1; i <A.length ; i++) {
            pa[i]=pa[i-1]+A[i];
        }
        return pa;
    }


    public static int bookd(int[] A){
        int j=A.length-1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <A.length-1; i++) {
            if(i==A.length-2){
                min = Math.min(min,A[j-1]);
            }else{
                min = Math.min(min,A[j]-A[i]);
            }
        }
        System.out.println(min);
       return min;
    }
}
