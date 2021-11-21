package sampleInterview;

public class Missing_number {

    public static void main(String[] args) {
        
        int[] v= {1,3,4,5,7,9,8,6};
        int N=v.length+1;
        int sum =N*(N+1)/2; //sum of array
        int res =0;
        for (int i = 0; i < v.length; i++) {
            res+=v[i];
        }
        System.out.println(res);
        res = sum-res;
        System.out.println(res);
    }
}
