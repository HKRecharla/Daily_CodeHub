package maths_PrimeNumber;

import java.util.ArrayList;

public class Lucky_primeNumber {

    public static void main(String[] args) {

         o_logn(10);

    }


    public static void o_logn(int A){

        int [] c = new int[5001];
        for (int i = 0; i < c.length; i++) {
            c[i]=0;
        }

        for (int i = 2; i <=A; i++) {
            boolean flag = isPrime(i);
            if(flag){
                for (int j = 2*i; j <=A ; j=j+i) {
                    c[j]+=1;
                }
            }
        }
        int count=0;
        for (int i = 0; i < c.length; i++) {
            if(c[i]==2){
                count++;
            }
        }
        System.out.println(count);
    }


    public static int o_sqrt_n(int A){
        int ans=0;
        for (int i = 2; i <=A ; i++) {
            int count=0;
            for (int j = 2; j <=i ; j++) {
                if(isPrime(j) && i%j ==0){
                    count++;
                }
            }
            if(count==2) ans++;

        }
        return ans;

    }

    public static boolean isPrime(int A){
        boolean flag =true;
        for (int i = 2; i*i <=A ; i++) {
            if(A%i==0){
                flag=false;
            }
        }
        return flag;
    }

    public static void seive_prime(int A){
        ArrayList<Integer> list = new ArrayList<>();

       int flag=0;
       int count=0;
        for (int i = 2; i <=A ; i++) {

            int k=i;
            flag=0;
            for (int j = 2; j*j <=k; j++) {

                if(k%j==0){
                    flag++;
                    while (k%j==0){
                        k/=j;
                    }
                }
            }

            if(k!=1){
                flag++;
            }
            if(flag==2){
                count++;
            }
            System.out.println(count);
        }
    }



    public static void seive_Prime_fact_disc(int A){
        Boolean[] b = new Boolean[A];

        for (int i = 0; i < A; i++) {
            b[i]=true;
        }

        for (int i = 2; i <A ; i++) {
            if(b[i]==true){
                for (int j = i; i*j <A; j++) {
                    b[i*j]=false;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < b.length; i++) {
           if (b[i]==true)  list.add(i);
        }
        System.out.println(list);
        ArrayList<Integer> list_twos = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list_twos.add(2*list.get(i));
        }

        System.out.println(list_twos);
        int co[] = new int[5001];
        for (int i = 2; i < co.length; i++) {
            co[i]+=co[i-1]+list_twos.get(i-2);
            if(list_twos.get(i-2) ==1){

            }
        }

        int count=0;
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> res = prime_factor(list.get(i));
            if(res.size()==2){
                count++;
            }
        }
        System.out.println(count);
    }


    public static ArrayList<Integer> prime_factor(int A){
        ArrayList<Integer> list = new ArrayList<>();


        for (int j = 2; j <Math.sqrt(A); j++) {
            int i=0;
            while (A%j==0){
                if(i>0){
                    if(list.get(i-1)!=j){
                        list.add(j);
                        i++;
                    }

                }else{
                    list.add(j);
                    i++;
                }
                A=A/j;

            }
        }
        if(A>1){
            list.add(A);
        }
        System.out.println(list);
        return list;
    }


    public static  int lucky(int A){
        int count =0;
        for (int i = 2; i <=A ; i++) {
            ArrayList<Integer> list = prime_factor(i);
            if(list.size()==2){
                count++;
            }
        }
        return count;
    }

    public static void prim_lucky(int A){


        for (int i = 2; i <=A; i++) {
            for (int j = 2; j <=Math.sqrt(A) ; j++) {
                while (i%2==0){
                    System.out.println(i);
                    A/=i;
                }
            }
        }
    }

    public static void prim_fact(int A){

        Boolean[] b = new Boolean[A+1];
        for (int i = 0; i <=A; i++) {
            b[i]=true;
        }

        for (int i = 2; i<=A; i++) {
            if(b[i]==true){
                ArrayList<Integer> list = new ArrayList<>();
                for (int j = i; i*j <=A; j++) {
                   b[i*j] =false;
                }
            }

        }

        for (int i = 2; i < b.length; i++) {
            if(b[i]==true){
                System.out.print(i+" ");
            }
        }




    }
}
