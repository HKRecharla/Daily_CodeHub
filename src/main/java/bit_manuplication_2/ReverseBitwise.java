package bit_manuplication_2;

public class ReverseBitwise {
    public static void main(String[] args) {

        long A=4294967293l;
        int[] res = decimal_to_binary(A);

        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();
//        int[] ans = reverse(res);
//        for (int i = 0; i <res.length ; i++) {
//            System.out.print(ans[i]+" ");
//        }
//
//        System.out.println();
//        String s ="";
//        for (int i = ans.length-1; i >=0 ; i--) {
//        s+=ans[i];
//        }
        binary_to_Decimanl(res);
    }

    public static int[] decimal_to_binary(long A){
        int[] res = new int[32];
        int i=0;
        while (A!=0){
            res[i]=(int)A%2;
            A/=2;
            i++;
        }
        return res;
    }

    public static int[] reverse(int[] A){
        int start=0;
        int end =A.length-1;
        while (start<=end){
            int temp = A[start];
            A[start]=A[end];
            A[end]=temp;
            start++;
            end--;
        }
        return A;
    }

    public static void binary_to_Decimanl(int[] A){
        int j=0;
        long num=0;
        for (int i = A.length-1; i >=0 ; i--) {
            if(A[i]==-1){
                continue;
            }
            num+= power(2,j)*A[i];
            j++;
        }
        System.out.println(num);
    }



    public static long power(int a,int b){
        if(b==0) return 1;
        long c = power(a,b/2);
        long res = c*c;
        if(b%2==1){
            res=res*a;
        }
        return res;
    }
}
