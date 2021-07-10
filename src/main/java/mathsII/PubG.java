package mathsII;

public class PubG {
    public static void main(String[] args) {
        int[] A = {8,20,30,11};
        pubg(A);

    }


    public static void pubg(int[] A){

        int ans = A[0];
        for (int i = 0; i <A.length-1 ; i++) {
            ans=GCD(ans,A[i+1]);
            System.out.println(ans);
        }

        System.out.println(ans);
    }


    public static int GCD(int a, int b){
        if(a==b) a=0;

        if(a<b) {int temp=a; a=b; b=temp;}
        if(b==0) return a;
        return GCD(a-b,b);
    }
}
