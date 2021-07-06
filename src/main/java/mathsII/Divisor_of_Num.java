package mathsII;

import java.util.ArrayList;

public class Divisor_of_Num {
    public static void main(String[] args) {

        int[] A={8,9,10};
            ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }
        sol(list);


    }

    public static int divisor(int a){
        int count =1;
        int i=2;
        while (i<= Math.sqrt(a)){
           // System.out.print((i%a)+" ");
            if(a%i==0){
                count++;
            }
            i++;
        }
        return count;
    }

    int prime[] = new int[1000001];

    void generate_prime(){
        prime[0] = 1;
        prime[1] = 1;
        for(int i =2;i<=1000000;i++)
            prime[i] = i;
        for(int i = 2;i*i <= 1000000;i++){
            if(prime[i] == i){
                for(int j = i*i; j<=1000000;j = j+i){
                    if(prime[j]==j)
                        prime[j] = i;    // storing the largest prime factor i of j
                }
            }
        }
    }


    public static  ArrayList<Integer> sol( ArrayList<Integer> A){


        int n = A.size();
        int max=-1;

        for (int i = 0; i < n; i++) {
            max =Math.max(max,A.get(i));
        }
        max++;
        int[] count = new int[max];

        for (int i = 0; i < max; i++) {
            count[i]=1;
        }

        for (int i = 2; i < max; i++) {
            for (int j = 1; i*j <max ; j++) {

                count[i*j]++;
            }
        }

        ArrayList<Integer> list = new  ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int a = A.get(i);
            int co =count[a];
            list.add(co);
        }

        return list;

    }



//    public static int div(int a, int i){
//
//        if(i<=a){
//            if(a%i==0){
//                count+=count+1;
//            }
//        }
//
//        return div(a,i+1);
//    }
}
