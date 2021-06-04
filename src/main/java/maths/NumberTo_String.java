package maths;

public class NumberTo_String {

    public static void main(String[] args) {

        int A=25;
        number_to_char(A);
    }


    public static void num(){

    }


    public static void number_to_char(int A){
        char[] a ={'0','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
        'P','Q','R','S','T','U','V','W','X','Y','Z'};

        int b=0;
        boolean flag = true;
        while (true){
            if(A>26){
                b =A%26;
                System.out.println(b);
            }else{
                b=A%26;
            }
            break;
        }

        //System.out.println(b);
        System.out.println(a[b]);


    }
}
