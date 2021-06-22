package problem_solving_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {



    public static void main(String[] args) {
        int [] a ={10000000};
        int[] b = {10000000};

        if(a[0]==b[0]){
            System.out.println(a[0]);
        }

        List<Integer> A= new ArrayList<>();
        List<Integer> B= new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            A.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            B.add(b[i]);
        }
        int i=0;
        int j=0;
        int o=0;

        int al =A.size();
        int bl =B.size();

        ArrayList<Integer> ans = new ArrayList<>();
        int mini = Math.min(al,bl);
        int maxi = Math.max(al,bl);
        while (i<maxi){

            if(j>=bl){
                break;
            }
            if(i>=al){
                break;
            }

            if(A.get(i).equals(B.get(j))){
                ans.add(A.get(i));
                j++;
                i++;
            }else if(A.get(i)!=B.get(j)){
                if(A.get(i)<B.get(j)){
                    i++;
                }else{
                    j++;
                }
            }


        }
        System.out.println(ans);
    }

}
