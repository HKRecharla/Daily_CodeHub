package recursion;

public class ReverseString {

    static String res="";
    public static void main(String[] args) {


        String A= "qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo";
                //"fwbpudnbrozzifml osdt ulc jsx kxorifrhubk ouhsuhf sswz qfho dqmy sn myq igjgip iwfcqq";

        String s[] = A.trim().replaceAll("( )+"," ").split(" ");
        String ans ="";
        reverse(s,s.length-1);
        //String str = reverse(A);
        System.out.println(res.substring(1));
    }

    public static String reverse(String A){
        if(A==null || A.length()<=1){
            return A;
        }
        return reverse(A.substring(1))+A.charAt(0);
    }

    public static void reverse(String[] A,int position){
        if(position>=0) {
            res=res+" "+A[position];
            reverse(A,position-1);
        }

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
