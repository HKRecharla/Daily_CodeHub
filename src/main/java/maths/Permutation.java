package maths;

public class Permutation {

    public static void main(String[] args) {

    }


    public static String[] per(String str, int l, int r){
        String[] num = new String[str.length()*2];
        int i=0;
        if(l==r){
            num[i] = str;
            i++;
        }else {

        }
        return num;
    }


    public static String swap(String str, int l, int r){
        char[] ch = str.toCharArray();
        char temp = ch[l];
        ch[l] = ch[r];
        ch[r] = temp;
        return String.valueOf(ch);
    }
}
