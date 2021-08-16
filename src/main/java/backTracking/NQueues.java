package backTracking;

import java.util.HashSet;
import java.util.Set;

public class NQueues {
   static Set<int[]> ans =new HashSet<int[]>();
    public static void main(String[] args) {

        int N=2;
        int[] curr = new int[N];
        for (int i = 0; i <N ; i++) {
            generate(curr,i,N);
        }


        for (int[] x:ans
             ) {
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i]);
            }
            System.out.println();
        }
    }


    public static void generate(int[] curr, int index,int N){

        if (index==N){
            ans.add(curr);
            return ;
        }

        curr[index]=1;
        generate(curr,index+1,N);
        curr[index]=2;
        generate(curr,index+1,N);
        return ;
    }

}
