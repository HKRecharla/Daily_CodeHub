package bitwise_operations;

public class Two_integers_opposite_sign {


    /**
     * Detect if two integers have opposite signs
     */

    public static void main(String[] args) {

        int X=100;
        int Y=-100;
        opposite(X,Y);
    }


    public static void opposite(int x, int y){
       int v =  x^y;
        System.out.println(v);
        if(v<0){
            System.out.println("opposite");
        }else{
            System.out.println("Not opposite");
        }
    }
}
