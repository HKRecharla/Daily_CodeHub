package sampleInterview;

public class RemoveCharacter {

    public static void main(String[] args) {

        String A="dhjfg2132jhg34####433";
        A=A.replaceAll("[^0-9]+","");

        System.out.println(A);
    }
}
