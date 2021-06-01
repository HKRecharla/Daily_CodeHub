package bitwise_operations;

public class Power_of_2 {

    public static void main(String[] args) {


        System.out.println(Math.floor(Math.sqrt(10)));
    }

    public static boolean solve2(int  n){
        if(n==0){
            return false;
        }

        System.out.println(n);
        while (n!=1){
            if(n%2!=0) return false;
            n =n/2;
            System.out.println(n);
        }

        return true;
    }


    public static void solve(){
        double log1 = Math.log(32);
        System.out.println(log1);
        double log2 = Math.log(2);
        System.out.println(log2);

        double ceil = Math.ceil(log1 / log2);
        System.out.println(ceil);


        double log3 = Math.log(32);
        System.out.println(log3);
        double log4 = Math.log(2);
        System.out.println(log4);

        double floor= Math.floor(log3 / log4);
        System.out.println(floor);



        if(ceil == floor){
            System.out.println("true");
        }
    }
}
