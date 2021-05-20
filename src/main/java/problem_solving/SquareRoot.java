package problem_solving;

public class SquareRoot {

    public static void main(String[] args) {
        int N=10;

        int v = sqrt(1);
        System.out.println(Math.floor(v));
    }


    public static int sqrt(int N){
        int temp=0;
        for (int i = 0; i <N ; i++) {
            int v = i*i;
            if(v>=N){
                temp=i;
                return temp;
            }
        }
        return temp;
    }



}
