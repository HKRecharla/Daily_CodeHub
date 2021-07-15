package maths_PrimeNumber;

import java.util.ArrayList;

public class Largest_Co_prime {


    public static void main(String[] args) {

        int a =gcd(2,12);
        System.out.println(a);
        ArrayList<Integer> list = divisors(30);
        System.out.println(list);
        int max =list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(gcd(list.get(i),12)==1){
                max= Math.max(max,list.get(i));
            }
        }
        System.out.println(max);

    }


    public static ArrayList<Integer> divisors(int A){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=A; i++) {
            if(A%i==0){
                list.add(i);
            }
        }
        return list;
    }


    //GCD
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
