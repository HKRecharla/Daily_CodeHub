package problem_solving_4;

import java.util.ArrayList;

public class Smallest_sequence {
    public static void main(String[] args) {

       int A = 2;
        int B = 3;
        int C = 5;
        int D = 5;


        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        int k=0;
        int count=1;
        list.add(1);
        int min =0;
        while (D>0){
            int a = A*list.get(i);
            int b = B*list.get(j);
            int c = C*list.get(k);

            min = Math.min(a,Math.min(b,c));

            if(min!=list.get(list.size()-1)){
                list.add(min);
                D--;
            }

            if(min == a) i++;
            else if(min == b) j++;
            else if(min == c) k++;

        }

        list.remove(0);



    }
}
