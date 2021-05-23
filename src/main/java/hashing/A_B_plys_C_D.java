package hashing;

import java.util.HashMap;
import java.util.Map;

public class A_B_plys_C_D {

    public static void main(String[] args) {

                //0,1,2,3,4
        int[] A={9, 5, 4, 9, 3, 6, 8, 7, 1, 2, 8, 7, 2, 9, 7, 1, 3, 9, 7, 8, 1, 0, 5, 5};
                //{3, 4, 7, 1, 2, 9, 8};
                //{1, 1, 1, 1, 1};
        int[] b = equal(A);

        System.out.println();
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] +" ");
//        }
    }



    public  static int[] equal(int[] A) {
        HashMap<Integer, int[]> map = new HashMap<>();
        HashMap<Integer, int[]> map2 = new HashMap<>();
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int v =0;
        int[] n =new int[4];


        if(A[0]+A[1]==A[2]+A[3]){
            for(int i=0;i<4;i++){
                n[i]=i;
            }
            return n;
        }
        n=new int[1];
        n[0]=-1;
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                int[] a= new int[2];
                int val =  A[i]+A[j];
                System.out.print(A[i]+A[j]+" ");

                if(map.containsKey(val)){
                    int[] c = map.get(val);
                    int[] b = new int[4];
                    if(c[0]!=i && c[0]!=j && c[1]!=i && c[1]!=j && !map2.containsKey(val)){
                        b[0]=c[0];
                        b[1]=c[1];
                        b[2]=i;
                        b[3]=j;
                        map2.put(val,b);
                        min1= Math.min(min1,b[0]);
                        min2= Math.min(min2,b[1]);
                         //System.out.println("min max"+min1+" "+min2);
                    }
                }else{
                    a[0]=i;
                    a[1]=j;
                    map.put(val,a);
                }
            }

            System.out.println();
        }
        System.out.println();
        for (Map.Entry<Integer,int[]> entry: map2.entrySet()
        ) {
            //System.out.print(entry.getKey()+" ");
            if(min1==entry.getValue()[0] && min2==entry.getValue()[1]){
                v= entry.getKey();
                for (int i = 0; i < map2.get(v).length; i++) {
                    System.out.print(map2.get(v)[i]+" ");
                }
                System.out.println();
            }
            System.out.println();
           // System.out.println(entry.getValue());
        }

        return n;
    }


    public static void solve3(int[] A){

        boolean flag =true;
        int i=0;
        int j=1;
        HashMap<Integer,int[]> map = new HashMap<>();
        HashMap<Integer, int[]> map2 = new HashMap<>();
        while(flag){
            int[] a= new int[2];
            int val = A[i]+A[j];
            if(map.containsKey(val)){
                int[] c = map.get(val);
                int[] b = new int[4];
                if(c[0]!=i && c[1]!=j && !map2.containsKey(val)){
                    b[0]=c[0];
                    b[1]=c[1];
                    b[2]=i;
                    b[3]=j;
                    map2.put(val,b);
                }
            }else{
                a[0]=i;
                a[1]=j;
                map.put(val,a);
            }


        }

    }

    public static int[] solve2(int[] A){

       HashMap<Integer, int[]> map = new HashMap<>();
        HashMap<Integer, int[]> map2 = new HashMap<>();
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int min3=Integer.MAX_VALUE;
        int min4=Integer.MAX_VALUE;
        int v =0;
        int[] n =new int[4];

            if(A[0]+A[1]==A[2]+A[3]){
                for(int i=0;i<4;i++){
                    n[i]=i;
                    System.out.print(n[i]+" ");
                }
                return n;
            }

        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                int[] a= new int[2];
                int val =  A[i]+A[j];
                System.out.print(A[i]+A[j]+" ");

                if(map.containsKey(val)){
                    int[] c = map.get(val);
                    int[] b = new int[4];
                        if(c[0]!=i && c[1]!=j && !map2.containsKey(val)){
                            b[0]=c[0];
                            b[1]=c[1];
                            b[2]=i;
                            b[3]=j;
                            map2.put(val,b);
                            min1= Math.min(min1,b[0]);
                            min2= Math.min(min2,b[1]);

                            System.out.println("min max"+min1+" "+min2);
                        }
                     }else{
                    a[0]=i;
                    a[1]=j;
                    map.put(val,a);
                }
            }


            System.out.println();
        }

        for (Map.Entry<Integer,int[]> entry: map2.entrySet()
        ) {
            System.out.print(entry.getKey()+" ");
                if(min1==entry.getValue()[0] && min2==entry.getValue()[1]){
                    v= entry.getKey();
                    for (int i = 0; i < map2.get(v).length; i++) {
                        System.out.print(map2.get(v)[i]+" ");
                    }
                    System.out.println();
            }
            System.out.println();
            //System.out.println(entry.getValue());
        }
        return null;
    }

    public static void solve(int[] A){

        int len = A.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < len-1; i++) {
           int val =  A[i]+A[i+1];
            System.out.println(val);
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {

            if(entry.getValue() >=2){
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }

    }
}
