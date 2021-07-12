package maths_Combinations;

public class Dividiors_of_number {

    public static void main(String[] args) {
        div_seive(10);

    }
    
    
    public static void div_seive(int A){

        int res[] = new int[A];
        for (int i = 0; i < A; i++) {
            res[i]=1;
        }

        for (int i = 2; i <A; i++) {
            for (int j = i; j < A; j=j+i) {
                res[j] =res[j]+1;
            }
        }


        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
        
    }
    
    
    public static int divisor(int A){
        int count=0;
        for (int i = 1; i <=A; i++) {
            if(A%i==0){
                count++;
            }
        }
        return count;
    }

    public static int[] divisor_all(int A){
        int[] res = new int[A];
        for (int i = 1; i < A; i++) {
            res[i]=divisor(i);
        }
        return res;
    }
}
