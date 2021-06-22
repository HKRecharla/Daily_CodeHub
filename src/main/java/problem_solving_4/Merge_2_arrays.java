package problem_solving_4;

public class Merge_2_arrays {

    public static void main(String[] args) {
       int[]  A = {4, 7, 9 };
        int[] B = {2 ,11, 19 };
        int i=0;
        int j=0;
        int al =A.length;
        int bl =B.length;
        int[] ans = new int[al+bl];
        int o=0;
        while (i<al || j<bl){

            if(i>=al){
                ans[o]=B[j];
                j++;
            }

            else if(j>=bl){
                ans[o]=A[i];
                i++;
            }else {
                if (A[i] < B[j]) {
                    ans[o] = A[i];
                    i++;
                } else if (A[i] > B[j]) {
                    ans[o] = B[j];
                    j++;
                } else if (A[i] == B[j]) {
                    ans[o] = B[j];
                    o++;
                    ans[o] = A[i];
                    j++;
                    i++;
                }
            }
            o++;
        }

        for (int k = 0; k < ans.length; k++) {
            System.out.println(ans[k]);
        }

    }
}
