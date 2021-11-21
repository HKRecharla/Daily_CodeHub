package sampleInterview;

public class PowerOfNum {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        //output = 8
        int pow=1;
        for (int i =1; i <=b ; i++) {
            pow=pow*a;
        }
        System.out.println(pow);
    }
}
