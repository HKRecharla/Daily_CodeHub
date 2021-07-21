package bit_manuplication_2;

public class Xor_Operation_array {

    public static void main(String[] args) {
        int n=1;
        int start=7;
        int ans=0;
        int val=start;

        int[] arr = new int[n];
        arr[0]=start;
        for(int i=1;i<n;i++){
            //ans^=val;
            val=val+2;
            arr[i]=val;
        }
        ans=arr[0];
        for(int i=1;i<arr.length;i++){
            ans=ans^arr[i];
        }

        System.out.println(ans);
    }
}
