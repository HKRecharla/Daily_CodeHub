package mathsII;

public class TwoRectangle_Overlap {


    public static void main(String[] args) {

    }

    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {

        if(H<=B || F>=D || G<=A || E>=C){
            return 0;
        }else {
            return 1;
        }
    }
}
