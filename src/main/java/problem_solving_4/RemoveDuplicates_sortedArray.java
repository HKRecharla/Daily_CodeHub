package problem_solving_4;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates_sortedArray {


    public static void main(String[] args) {


        int[] a={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        List<Integer> A= new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            A.add(a[i]);
        }
        int len= A.size();
        int count =1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(A.get(0));

        for (int i = 1; i < len; i++) {
            if(!A.get(i-1).equals(A.get(i))){
                ans.add(A.get(i));
            }
        }



        System.out.println(ans);
    }
}
