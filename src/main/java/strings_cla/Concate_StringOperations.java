package strings_cla;

public class Concate_StringOperations {
    public static void main(String[] args) {
        String A ="lLdfRVCgbkND";
        oper(A);

    }

    public static void oper(String A){
        String a = A+""+A;
        String vowels= "aeiou";
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)>='A' && a.charAt(i)<='Z'){
              a=  a.replace(String.valueOf(a.charAt(i)),"_");
            }
            if(vowels.contains(String.valueOf(a.charAt(i)))){
               a= a.replace(String.valueOf(a.charAt(i)),"#");
            }
        }

        System.out.println(a.replace("_",""));

    }
}
