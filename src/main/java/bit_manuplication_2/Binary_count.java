package bit_manuplication_2;

public class Binary_count {

    public static void main(String[] args) {

        int n=00000000000000000000000000001011;
        int b = hammingWeight(n);
        System.out.println(b);
    }

    public static  int hammingWeight(int n) {
        int count =0;
        while(n!=0){
            int val =n%10;
            if(val==1) count++;
            n/=10;
        }
        return count;
    }
}
