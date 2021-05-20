package bitwise_operations;

public class Xor {

    public static void main(String[] args) {


        int l =5;
        int r =6;
        maximizingXor(l,r);
    }



    public static int maximizingXor(int l, int r) {
        // Write your code here

        int m = r-l;
        int val = l^l;
        int max =val;
        System.out.println(val);
        System.out.println("");
        for(int i=1;i<=m;i++){
            for(int j=0;j<m;j++){

                int iv = (l+i)^(l+j);
                System.out.println(iv);
                max = Math.max(max,iv);
            }
        }
        System.out.println("");
        System.out.println(max);
        return max;
    }
}
