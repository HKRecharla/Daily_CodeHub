package arrays;

import java.util.HashMap;
import java.util.Map;

public class Sum_of_all_SubMatrices {
    public static void main(String[] args) {

        int[][] A={{1,1},
                {1,1}};

        int ans= 0;
        int N=A.length;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                int sum =((i+1)*(j+1))*(N-(i+1)+1)*(N-(j+1)+1);
                ans+=sum*A[i][j];
            }
        }
        System.out.println(ans);

        HashMap<Integer,Integer> map = new HashMap<>();

        for (Map.Entry<Integer,Integer> entry:map.entrySet()
             ) {
            entry.getValue();
            entry.getKey();
            
        }
    }
    
}
