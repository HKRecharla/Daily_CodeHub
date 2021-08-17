package sampleInterview;

public class Power {


    public static void main(String[] args) {

        int b=2;
        int p=3;
       int res =  power_num(b,p);
        System.out.println(res);
    }



    public static int pow(int b, int p){
        if(p==0) return 1;
        int c= pow(b,p/2);
        int res = c*c;
        if(p%2==1){
            res = res*b;
        }
        return res;
    }

    public static int power_num(int b,int p){
        if(p==0) return 1;
        return b*pow(b,p-1);
    }
}
