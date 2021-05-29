package strings_cla;

public class String_AlphaNumeric {

    public static void main(String[] args) {

        char[] A= {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
        boolean flag=false;
        for (int i = 0; i < A.length; i++) {
             //flag = isAlpha(A[i]);
            flag = String.valueOf(A[i]).matches("[A-Za-z0-9]+");
        }
        if(flag){
            System.out.println(1);
        }
    }

    public static boolean isAlpha(char A) {
        return (A >= 'a' && A <= 'z')
                || (A >= 'A' && A <= 'Z')
                || (A >= '0' && A <= '9');
    }
}
