package mathsII;

public class DeleteOne {

    public static void main(String[] args) {

        int[] A = { 21, 7, 3, 42, 63};
        int max = 0;
        int g = 0;
        if(A.length==2){
            max = Math.max(A[0],A[1]);
        }
        int[] pa = new int[A.length];
        int[] sa = new int[A.length];
        int a =0;
        for (int i = 0; i < A.length; i++) {
            a=gcd(A[i],a);
            pa[i]=a;
        }

        int b=0;
        for (int i = A.length-1; i>=0 ; i--) {
            b=gcd(A[i],b);
            sa[i]=b;
        }

        int ans=0;
        for (int i = 0; i < A.length; i++) {

            if(i==0){
                ans =Math.max(ans,sa[i+1]);
            }else if(i==A.length-1){
                ans =Math.max(ans,pa[i-1]);
            }else{
                ans =Math.max(ans,gcd(pa[i-1],sa[i+1]));
            }
        }

        System.out.println(ans);

//        int ans=pa[0];
//        for (int i = 0; i < A.length-1; i++) {
//            ans =gcd(ans,A[i+1]);
//            max =Math.max(max,ans);
//        }
        
//        for (int i = 0; i < A.length-1; i++) {
//            int ans=A[0];
//            for (int j = 0; j < A.length-1; j++) {
//                if(i!=j){
//                    ans =gcd(ans,A[j+1]);
//                }
//            }
//            max =Math.max(max,ans);
//        }

        System.out.println(max);
    }


    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
