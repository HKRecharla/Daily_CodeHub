package leet_Code.strings_concept;

public class ReverseString {

    public static void main(String[] args) {
        char[] c={'h','e','l','l','o'};

        String s ="";
        int l=0;
        int r=c.length-1;
        while(l<r){
            char temp = c[l];
            c[l]=c[r];
            c[r]=temp;
        }


    }




}
