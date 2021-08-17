package strings_cla;

public class Reverse_String {


    public static void main(String[] args) {

    }

    public static void reverse(String A){
        int l=0;
        int r=A.length()-1;
        String s="";
        while (l<=r){
         String a = String.valueOf(A.charAt(l));
         String b= String.valueOf(A.charAt(r));
         l++;r--;
        }
    }
}
