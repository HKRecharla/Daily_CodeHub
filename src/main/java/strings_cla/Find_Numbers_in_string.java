package strings_cla;

public class Find_Numbers_in_string {


    public static void main(String[] args) {

        String s= "abc12as";
        System.out.println(s.replaceAll("[^0-9]+",""));

    }
}
