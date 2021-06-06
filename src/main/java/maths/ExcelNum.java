package maths;

public class ExcelNum {


    public static void main(String[] args) {

        int A =27;
       excel(A);
    }



    public static void  excel(int A){

        String s="";
        while (A!=0){
            char c= (char)(A%26+64);
            System.out.println(c);
            s=c+s;
            A/=26;
        }

        System.out.println(s);
    }



    public static String getCharForNumber(int i){

        // return null for bad input
        if(i < 0){
            return null;
        }

        // convert to base 26
        String s = Integer.toString(i-1, 26);

        char[] characters = s.toCharArray();

        String result = "";
        for(char c : characters){
            // convert the base 26 character back to a base 10 integer
            int x = Integer.parseInt(Character.valueOf(c).toString(), 26);
            // append the ASCII value to the result
            result += String.valueOf((char)(x + 'A'));
        }

        return result;
    }
}
