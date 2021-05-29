package strings_cla;

public class String_to_LowerCase {

    public static void main(String[] args) {
        char[] A= {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};

        for (int i = 0; i < A.length; i++) {
            if(A[i]>='a' && A[i] <='z'){
            }else{
                A[i] = Character.toLowerCase(A[i]);
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print (A[i]+" ");
        }

    }
}
