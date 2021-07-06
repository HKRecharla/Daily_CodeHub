package mathsII;

public class DeleteOne {

    public static void main(String[] args) {

        int[] A = {12, 15, 18};
        int max = 0;
        int g = 0;
        for (int i = 0; i < A.length-1; i++) {
            int ans=A[i+1];
            for (int j = 0; j < A.length-1; j++) {
                if(i!=j){
                    ans =gcd(ans,A[j+1]);
                }
            }
            max =Math.max(max,ans);
        }

        System.out.println(max);
    }


    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
