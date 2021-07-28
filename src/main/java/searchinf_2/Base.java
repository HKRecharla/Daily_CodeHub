package searchinf_2;

public class Base {


    public static void main(String[] args) {
        String a = solve("6");
        System.out.println(a);
    }
    public static String solve(String A) {
        int len = A.length();
        int B=3;
//        if(len<3){
//            B=3;
//        }else if(len>=3){
//            B= Integer.parseInt(String.valueOf(A.charAt(2)));
//        }

        int val = (int)(Math.floor(
                Math.log(Integer.parseInt(A)) / Math.log(B))
                + 1);
        return String.valueOf(val);
    }
}
