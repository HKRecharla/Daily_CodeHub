package bit_manuplication_2;

public class StarngeEquality {

    public static void main(String[] args) {

        int A=2;
        int[] binary = decimal_to_binary(A);
        for (int i = 0; i < binary.length; i++) {
            System.out.print(binary[i]+" ");
        }
        int count = count_bits(binary);
        System.out.println();
        System.out.println(count);
       long power = power(2,count);
        System.out.println(power);
        int[] xvalue = x_value(binary, count);
        long res = binary_to_Decimal(xvalue);
        System.out.println(res);

        System.out.println(power+res);
    }

    public static void equality(int A){

    }

    //decimal to binary
    public static int[] decimal_to_binary(int A){
        int[] arr = new int[32];
        int i=0;
        while (A!=0){
            arr[i]=A%2;
            A/=2;
            i++;
        }
        return arr;
    }

    public static int count_bits(int[] arr){
        for (int i = arr.length-1; i >=0; i--) {
            if(arr[i]==1){
                return i+1;
            }
        }
        return 0;
    }

    public static long power(int a, int b){
        if(b==0) return 1;
        long c =power(a,b/2);
        long res = c*c;
        if(b%2==1){
            res*=a;
        }
        return res;
    }

//    public static int y_value(int count){
//
//    }
    
    public static int[] x_value(int[] A,int size){
        for (int i = 0; i <size; i++) {
            if(A[i]==1){
                A[i]=0;
            }else if(A[i]==0){
                A[i]=1;
            }
        }
        return A;
    }
    
    
    public static long binary_to_Decimal(int[] A){
        long res=0;
        for (int i = 0; i < A.length; i++) {
            res+=power(2,i)*A[i];
        }
        return res;
    }

}
