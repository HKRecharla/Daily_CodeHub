package bit_manuplication_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Bit_Count_sort {

    public static void main(String[] args) {
        int[] A={1024,512,256,128,64,32,16,8,4,2,1};
       int[] res=  sortByBits(A);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] sortByBits(int[] arr) {

        int[] res = new int[501];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int[] ar = decimal_to_Binary(arr[i]);
            int set = setbits(ar);
            res[arr[i]]=set;
            //res[arr[i]] = set;
        }

        for (int set = 0; set < res.length; set++) {
            ArrayList<Integer> list = new ArrayList<>();
            if(map.containsKey(set)){
                ArrayList<Integer> listmap= map.get(set);
                listmap.add(res[set]);
                map.put(set,listmap);
            }else{
                list.add(res[set]);
                map.put(set,list);
            }
        }



        int k=0;
        for(int i=0;i<=31;i++){
            ArrayList<Integer> list =  map.get(i);
            if(list!=null){
                for(int j=0;j<list.size();j++){
                    arr[k]=list.get(j);
                    k++;
                }
            }

        }
        return arr;
    }

    public static int[] decimal_to_Binary(int a){
        int[] arr = new int[31];
        int i=0;
        while(a!=0){
            arr[i]= a%2;
            a/=2;
            i++;
        }
        return arr;
    }



    public static int setbits(int[] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
            }
        }
        return count;
    }
}
