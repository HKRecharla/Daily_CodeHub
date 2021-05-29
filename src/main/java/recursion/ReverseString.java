package recursion;

public class ReverseString {

    public static void main(String[] args) {


        String A= "madam";
        int str = solve(A);
        System.out.println(str);
    }

    public static String reverse(String A){

        if(A==null || A.length()<=1){
            return A;
        }
        String s = A.substring(1);
        char c = A.charAt(0);

        return reverse(s)+c;

        /**
         * String reverse="";
         *         reverse += A.charAt(A.length() - 1) + reverse(A.substring(0, A.length() - 1));
         *         return reverse;
         */
    }

    public static int solve(String A){
        if(A.length()==0 || A.length() <=1){
            return 1;
        }
        if(A.charAt(0) == A.charAt(A.length()-1)){
            return solve(A.substring(1,A.length()-1));
        }
        return 0;
    }

}
