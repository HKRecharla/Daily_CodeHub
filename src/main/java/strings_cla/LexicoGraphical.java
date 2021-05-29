package strings_cla;

public class LexicoGraphical {

    public static void main(String[] args) {

    }

    public static void lexi_larg(String A){
        int len = A.length();

        String[] sp =A.split("_");

        int splen = sp[0].length();

        int[] a = new int[26];
        for (int i = 0; i < splen; i++) {
            int val = sp[0].charAt(i)-'a';

        }




    }

}
