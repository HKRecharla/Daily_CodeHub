package sampleInterview;

public class Palindro_half {

    public static void main(String[] args) {
        String s = "NONO";
        int len = s.length();
        String res = reverse(s,len/2,len);
        res = s.substring(0,len/2)+res;
        System.out.println(res);
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
