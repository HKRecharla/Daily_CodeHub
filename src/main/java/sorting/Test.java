package sorting;

public class Test {

    public static void main(String[] args) {
        int[] A={33, 82, 75, 4, 52, 74, 79, 46, 18, 73, 1, 83, 46, 94, 44, 86, 40, 1, 46, 24, 99, 16, 88, 6, 66, 17, 1};
        int g = solve(A);
        System.out.println(g);
    }

    public static  int solve(int[] A) {
        int res = Integer.MAX_VALUE;

        int l=0;
        int r=A.length-1;

        while(l<r){
            int val = Math.abs(A[l]-A[r]);
            res = Math.min(res,val);
            if(A[l]<A[r]){
                l++;
            }else{
                r--;
                System.out.println();
            }
        }
        return res;
    }
}
