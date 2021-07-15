package maths_PrimeNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Factorial_Prime {

    public static void main(String[] args) {
        int[] A={2,3,4,5,6};
                //{125, 798, 631, 637, 572, 348, 234, 945, 504, 457, 255, 790, 586, 758, 173, 192, 706, 503, 419, 893, 140, 561, 492, 647, 979, 321, 751, 336, 23, 299, 65, 500, 449, 697, 137, 22, 397, 723, 967, 253, 533, 222, 396, 119, 980, 569, 311, 38, 424, 731, 932, 565, 644, 424, 564, 623, 745, 315, 311, 120, 615, 377, 621, 416, 426, 110, 438, 823, 834, 405, 429, 367, 979, 825, 486, 959, 746, 149, 350, 171, 232, 282, 88, 876, 706, 4, 852, 804, 671, 163, 924, 286, 892, 897, 55, 318, 8, 493, 494, 194 };
        solve(A);
    }

    public static int power(int a, int b,int MOD){
        if(b==0) return 1;
        int c = power(a,b/2,MOD);
        long res = ((long)c*c)%MOD;
        if((b%2)==1) res=((long)res*a)%MOD;
        return (int)res%MOD;
    }






    public static int[] seive(int A,int max){


        return null;
    }



    
    public static void solve(int[] A){
        int MOD =1000000007;
        Arrays.sort(A); //sort
        int max = A[A.length-1];
        int[] seive = new int[max+1];
        Arrays.fill(seive,1);

        seive[0]=0;seive[1]=0;
        for (int i = 2; i <=max ; i++) {
            if(seive[i]==1){
                for (int j = i; i*j<=max ; j++) {
                    seive[i*j]=0;
                }
            }
        }
        for (int i = 0; i < seive.length; i++) {
            System.out.print(seive[i]+" ");
        }

        //prefix
        for (int i = 2; i <=max ; i++) {
            seive[i]=seive[i-1]+seive[i];
        }
        System.out.println();
        for (int i = 0; i < seive.length; i++) {
            System.out.print(seive[i]+" ");
        }

        System.out.println();
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i]<2) continue;
            map.put(seive[A[i]],map.getOrDefault(seive[A[i]],0)+1); // Map seive[A[i]]
            System.out.println(map);
            if(map.get(seive[A[i]])==1){
                list.add(seive[A[i]]);
                System.out.println(list);
            }
        }

        int count =0;
        for (int i = 0; i < list.size(); i++) {
            count += power(2,map.get(list.get(i)),MOD)-1;
        }
        System.out.println(count);

    }

















    public static void fact_array(int[] A){
        int MOD =1000000007;
        Arrays.sort(A);
        int max = A[A.length-1];
        long ans=0;
        ArrayList<Integer> list = seive_prime(max);//2 3 5 7
        Map<Integer,Integer> primeMap = new HashMap<>();
        int count =0;
        int lastprime=0;

        int v=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]<2) continue;

            if(b[A[i]]){
                if(A[i]>list.get(list.size()-1)){
                    lastprime=list.get(v-1);
                }
                else if(list.get(v) <=A[i]){
                    lastprime=list.get(v);
                    v++;
                }else{
                    lastprime=list.get(v);
                }
                // lastprime=prime(A[i]);

            }

            if(primeMap.containsKey(lastprime)){
                primeMap.put(lastprime,primeMap.get(lastprime)+1);
            }else{
                primeMap.put(lastprime,1);
            }

        }

        System.out.println(primeMap);
        for (Map.Entry<Integer,Integer> entry:primeMap.entrySet()) {
            int val = power(2, entry.getValue(),MOD) - 1;
            ans=ans+val;
        }
        System.out.println(ans);
    }



    public static int prime(int A){
        for (int i = A; i >1 ; i--) {
            if(b[i]){
                return i;
            }
        }
        return 0;
    }

    public static void pre(int[] A){
        int MOD =1000000007;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int max = A[A.length-1];
        long ans=0;
        ArrayList<Integer> list = seive_prime(max);//2 3 5 7

        int[] pa = new int[A.length+2];
        int j=0;
        int count=1;
        for (int i = 2; i < pa.length; i++) {

            if(j>=list.size()){
                pa[i]=j;
            }else{
                if(A[i-2] == list.get(j) && A[i-1] ==A[i-2]){
                    pa[i]=j;
                    j++;
                }else if(list.get(j)<=A[i-2] ){
                    pa[i]=j+1;
                    j++;
                }else{
                    pa[i]=j;
                }
            }

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


    static Boolean[] b;
    public static ArrayList<Integer> seive_prime(int A){
        b = new Boolean[A+1];

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
