package strings_cla;

public class String_String {
    public static void main(String[] args) {

        String A= "bue";
        int B=79;
       String v =  reverse(A,0,A.length());
        System.out.println(v);
        int end = B%v.length();
        String a =  reverse(v,0,end);
        System.out.println(a);
        String b =  reverse(v,end,v.length());
        System.out.println(b);
        System.out.println(a+b);
    }

    public static String reverse(String A, int start, int end){
        String sub =  A.substring(start,end);
        String res= "";
        for(int i=sub.length()-1;i>=0;i--){
            res += sub.charAt(i);
        }
        return res;
    }
}
