package maths_PrimeNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactor {

    public static void main(String[] args) {
        int[] B ={11};
        solve(B);
    }


    public static void solve(ArrayList<Integer> B){
        int[] pm =new int[1000001];
        Arrays.fill(pm,1);
        pm[0]=0;
        pm[1]=0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <=1000000 ; i++) {
            int count=0;
            if(pm[i]==1){
                for (int j = i; j <=1000000 ; j+=i) {
                    if(pm[j]==1){
                        pm[j]=0;
                        count++;
                    }
                }
            }
        pm[i]=count;
        }
        for (int j = 0; j < B.size(); j++) {
            list.add(pm[B.get(j)]);
        }
        System.out.println(list);

    }
}
