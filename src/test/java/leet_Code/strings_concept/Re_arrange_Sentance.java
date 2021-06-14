package leet_Code.strings_concept;

public class Re_arrange_Sentance {
    public static void main(String[] args) {
        String s ="is2 sentence4 This1 a3";

        String[] sp = s.split("\\s+");

        String[] arr = new String[sp.length];

        for (int i = 0; i < sp.length; i++) {
            char c = sp[i].charAt(sp[i].length()-1);
            int val = Integer.parseInt(String.valueOf(c))-1;
            arr[val]=sp[i].substring(0,sp[i].length()-1);
            System.out.println(arr[val]);
        }
        String res="";
        for (int i = 0; i < arr.length; i++) {
            res+=arr[i]+" ";
        }

    }
}
