package maths_PrimeNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Factorial_Prime {

    public static void main(String[] args) {
        int[] A={2,3,4,5,6};
        pre(A);
    }

    public static int power(int a, int b,int MOD){
        if(b==0) return 1;
        int c = power(a,b/2,MOD);
        long res = ((long)c*c)%MOD;
        if((b%2)==1) res=((long)res*a)%MOD;
        return (int)res%MOD;
    }


    public static void pre(int[] A){
        int MOD =1000000007;
        Arrays.sort(A);
        int max = A[A.length-1];
        long ans=0;
        ArrayList<Integer> list = seive_prime(max);//2 3 5 7

        int[] pa = new int[A.length+2];
        int j=0;
        int count=1;
        pa[2]=1;
        for (int i = 3; i < pa.length; i++) {
            if(pa[i-1] == A[i-3]){
                pa[i]=pa[i-1];
            }else{
                pa[i]=pa[i-1]+1;
            }



//            if(j>=list.size()){
//                pa[i]=j;
//            }else{
//                if(A[i-2] == list.get(j)){
//                    pa[i]=j+1;
//                    j++;
//                }else{
//                    pa[i]=j;
//                }
//            }

        }
        for (int i = 0; i < pa.length; i++) {
            System.out.print(pa[i]+" ");
        }
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            if(map.containsKey(pa[A[i]])){
                map.put(pa[A[i]],map.get(pa[A[i]])+1);
            }else{
                map.put(pa[A[i]],1);
            }
        }
        System.out.println(map);

                for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            int val = power(2, entry.getValue(),MOD) - 1;
            ans=ans+val;
        }
        System.out.println(ans);


//        HashMap<ArrayList<Integer>,Integer> map = new HashMap<>();
//        for (int i = 0; i < A.length; i++) {
//            if(A[i]<2){
//                continue;
//            }
//            if(map.containsKey(list)){
//                map.put(list,map.get(list)+1);
//            }else{
//                map.put(list,1);
//            }
//        }
//        for (Map.Entry<ArrayList<Integer>,Integer> entry:map.entrySet()) {
//            int val = power(2, entry.getValue(),MOD) - 1;
//            ans=ans+val;
//        }
    }
    public static void fact_prime(int[] A){
        int MOD =1000000007;
        Arrays.sort(A);
        int max = A[A.length-1]%MOD;
        long ans=0;
        HashMap<ArrayList<Integer>,Integer> map = new HashMap<>();
        ArrayList<Integer> list = seive_prime(max);
        HashMap<Integer,Integer> map1 = new HashMap<>();

        for (int i = A.length-1; i >=0; i--) {
            int j= list.size()-1;

            while (j>=0){
                if(list.get(j)<=A[i]){
                    if(map1.containsKey(list.get(j))){
                        map1.put(list.get(j),map1.get(list.get(j))+1);
                    }else{
                        map1.put(list.get(j),1);
                    }
                    break;
                }else{
                    j--;
                }
            }
        }
        System.out.println(map1);
        
//        for (int i = 0; i < A.length; i++) {
//            if(A[i]<2){
//                continue;
//            }
//            //ArrayList<Integer> list = seive_prime(A[i]);
//            if(map.containsKey(list)){
//            map.put(list,map.get(list)+1);
//            }else{
//                map.put(list,1);
//            }
//        }
        System.out.println(map);
        for (Map.Entry<Integer,Integer> entry:map1.entrySet()) {
            int val = (int)(Math.pow(2, entry.getValue()) - 1)%MOD;
            ans+=val;
        }
        System.out.println(ans);
    }


    public static void find_fact_count(int[] A){
        int MOD =1000000007;
        Arrays.sort(A);
        int max = A[A.length-1]%MOD;

        ArrayList<Integer> list = seive_prime(max);


        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i),1);
        }
        System.out.println(map);

        

        for (int i = 0; i < A.length; i++) {

            if(map.containsKey(A[i])){
                if(map.get(A[i]) <= A[i]){
                    map.put(A[i],(map.get(A[i])+1)%MOD);
                }
            }
        }
        long ans =0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            ans=ans%MOD+entry.getValue()%MOD;
        }
        System.out.println(ans);

//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < A.length; j++) {
//                if(list.get(i)<=A[j]){
//                    map.put(list.get(i),map.get(list.get(i))+1);
//                }
//            }
//        }
//        for (int i = 0; i < A.length; i++) {
//            for (int j = i+1; j < list.size(); j++) {
//                if(list.get(j)<=A[i]){
//                    map.put(list.get(j),map.get(list.get(j))+1);
//                }
//            }
//        }

        System.out.println(map);



        int sum=0;

        for (int i = 0; i < list.size(); i++) {
            int primeNo = list.get(i);
            int nextprime =0;
            if(i+1<list.size()){
                nextprime = list.get(i+1);
                int count=0;
                int j=i;
                while (j<A.length){

                    if(A[j]==nextprime){
                        if(j==0){
                            sum+=Math.pow(2,0)-1;
                        }else{
                            sum+=Math.pow(2,count)-1;
                        }

                        break;
                    }
                    count++;
                    j++;
                }
//                while (j>=0){
//                    if(A[j] ==nextprime){
//                       ans+=Math.pow(2,j);
//                        break;
//                    }
//                    j--;
//                }
            }else{
                int len =A.length-i-1;
                int j=0;
                sum+=Math.pow(2,len)-1;
//                while (j<A.length){
//                    if(A[j]==primeNo){
//                        ans+=Math.pow(2,j)-1;
//                        break;
//                    }
//                    j++;
//                }
                //ans+=Math.pow(2,len)-1;
            }
        }
        System.out.println(sum);
    }



    public static ArrayList<Integer> seive_prime(int A){

        Boolean[] b = new Boolean[A+1];
        for (int i = 0; i < b.length; i++) {
            b[i]=true;
        }

        for (int i = 2; i <=A; i++) {
            if(b[i]==true){
                for (int j = i; j*i<=A ; j++) {
                    b[i*j]=false;
                }
            }
        }

        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 2; i <b.length ; i++) {
            if (b[i]==true){
                list.add(i);
            }
        }
        System.out.println(list);
        return list;
    }
}
