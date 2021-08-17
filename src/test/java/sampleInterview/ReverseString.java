package sampleInterview;

public class ReverseString {

    public static void main(String[] args) {

        String A="Hari";
        String s  = reverse(A);
        System.out.println(s);
    }

    public static String reverse(String A){
        if(A==null || A.length()<1){
            return A;
        }
        return reverse(A.substring(1))+A.charAt(0);
    }
}
