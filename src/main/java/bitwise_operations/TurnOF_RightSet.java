package bitwise_operations;

public class TurnOF_RightSet {


    public static void main(String[] args) {
       // solve1(12);

    }


    public static void solve(int decimal){

        int[] bi =new int[40];
        int count=0;
        while(decimal>0){
            bi[count++] = decimal%2;
            decimal = decimal/2;
        }

        int v=0;
        for (int i = count-1; i >=0; i--) {
            if(bi[i]==1){
                v =i;
            }
            System.out.print(bi[i]);
        }
        bi[v]=0;
        System.out.println();
        System.out.println(bi);
    }

    public static void solve1(int decimal){


        System.out.println(decimal &(decimal-1));
    }
}
