package sampleInterview;

public class Swap_int {

    public static void main(String[] args) {
        swap_temp();
    }

    public static void swap(){
        int a=1;
        int b=2;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+" "+b);
    }

    public static void swap_temp(){
        int a=1;
        int b=2;

        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
