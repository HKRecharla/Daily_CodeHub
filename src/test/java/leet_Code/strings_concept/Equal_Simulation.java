package leet_Code.strings_concept;

public class Equal_Simulation {


    public static void main(String[] args) {

        String firstWord="acb";
        String secondWord="cba";
        String targetWord="cdb";


        String a="";
        String b="";
        String c="";
        for (int i = 0; i < firstWord.length(); i++) {
            a+=String.valueOf(firstWord.charAt(i)-'a');
        }
        for (int i = 0; i < secondWord.length(); i++) {
            b+=String.valueOf(secondWord.charAt(i)-'a');
        }
        for (int i = 0; i < targetWord.length(); i++) {
            c+=String.valueOf(targetWord.charAt(i)-'a');
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int res1 = Integer.parseInt(a)+Integer.parseInt(b);
        int res2 = Integer.parseInt(c);

        if(res1==res2){
            System.out.println("true");
        }






    }
}
