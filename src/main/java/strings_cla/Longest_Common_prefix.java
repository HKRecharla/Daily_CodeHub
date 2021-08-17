package strings_cla;

public class Longest_Common_prefix {

    public static void main(String[] args) {

    }

    public static void common(String[] A){

        int len = A.length;
        int min = Integer.MAX_VALUE;
        int index=0;
        for (int i = 0; i <len ; i++) {
            min = Math.min(min,A[i].length());
        }

        int[] res= new int[min];

        for (int i = 0; i <res.length; i++) {
            res[i]=A[0].charAt(i);
        }


    }
}
