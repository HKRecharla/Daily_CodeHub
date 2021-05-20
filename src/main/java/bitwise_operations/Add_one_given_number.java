package bitwise_operations;

public class Add_one_given_number {


    /**
     * Add 1 to a given number
     * The use of operators like ‘+’, ‘-‘, ‘*’, ‘/’, ‘++’, ‘–‘ …etc are not allowed
     */


    public static void main(String[] args) {

        int A=9;
        addnum(A);


        //System.out.println(Math.pow(9,1));
    }


    public static void addNUm(int decimal){

        int m=1;

        int count=0;
        int[] bi = new int[40];
        while(decimal>0){
            bi[count++] = decimal%2;
            decimal =decimal/2;
        }
        for (int i = 0; i <count ; i++) {
            System.out.print(bi[i]);
        }

        System.out.println("");
        int carry=0;
        String res = "";
        for (int i = count-1; i >=0; i--) {
            int temp = bi[i]+m;
            if(temp==2){
                bi[i]=0;
                res= bi[i]+res;
            }else if(m==0){
                res= bi[i]+res ;
            }else{
                res= 1+res;
                m=0;
            }
        }

        System.out.println(res);
    }


    public static void addnum(int x){
        int m=1;

        System.out.println("x&m -- "+(x&m));
        //System.out.println("x^m -- "+(x^m));
        //System.out.println("m<< -- "+(m<<=1));
        while ((int)(x&m)>=1){
            x=x^m;
            m<<=1;
            System.out.println("x&m -- "+(x&m));
        }
        x=x^m;
        System.out.println(x);
    }





}
