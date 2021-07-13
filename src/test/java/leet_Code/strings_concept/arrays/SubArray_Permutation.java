package leet_Code.strings_concept.arrays;

public class SubArray_Permutation {

    public static void main(String[] args) {

        int[] A ={1,2,3,4,5};
        int res = perm(A);
        System.out.println(res);

        System.out.println(5^1^6);
    }

    public static int perm(int[] A){

        int res=0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j <A.length ; j+=2) {
                for (int k = i; k <=j ; k++) {
                    res =res+A[i];
                }
            }
        }

        return res;
    }
}
