package problem_solving_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class N_by_3 {

    public static void main(String[] args) {

        int[] A={1,2,2,2,2,3,1};

        ArrayList<Integer> list =  new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }
        n_by(list);

    }

    public static void n_by(ArrayList<Integer> A){
        int c1=0;
        int c2=0;
        int n1=0;
        int n2=0;
        int i=0;

        while (i<A.size()){
            if(c1!=0 && A.get(i)==n1){
                c1++;
            }else if(c2!=0 && A.get(i)==n2){
                c2++;
            }else if(c1==0){
                c1++;
                n1=A.get(i);
            }else if(c2==0){
                c2++;
                n2=A.get(i);
            }else {
                c1--;
                c2--;
            }
            i++;
        }

        c1=0;c2=0;
        for (int j = 0; j < A.size(); j++) {
            if(n1==A.get(j)){
                c1++;
            }
            if(n2==A.get(j)){
                c2++;
            }
        }

        if(c1>A.size()/3){
            System.out.println(n1);
        }
        if(c2>A.size()/3){
            System.out.println(n2);
        }



    }



    public static void n_by_3_1(ArrayList<Integer> A){

        int c1 = 0;
        int c2=0;
        int n1=0;
        int n2=0;
        int i=0;

        while (i<A.size()){
            if(c1!=0 && A.get(i)==n1){
            c1++;
            }else if(c2!=0 && A.get(i)==n2){
            c2++;
            }else if(c1==0){
                c1++;
                n1=A.get(i);
            }else if(c2==0){
                c2++;
                n2=A.get(i);
            }else{
                c1--;
                c2--;
            }
            i++;
        }


        c1=0;c2=0;
        for (int j = 0; j < A.size(); j++) {
            if(A.get(j)==n1){
                c1++;
            }
            if(A.get(j)==n2){
                c2++;
            }
        }

        if(c1>A.size()/3){
            System.out.println(n1);
        }
        if(c2>A.size()/3){
            System.out.println(n2);
        }

    }


    public static void n_by_3(ArrayList<Integer> A){

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < A.size(); i++) {
            if(map.containsKey(A.get(i))){
                map.put(A.get(i),map.get(A.get(i))+1);
            }else{
                map.put(A.get(i),1);
            }
        }


        int max = Integer.MIN_VALUE;
        int val=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if(entry.getValue()>max){
                max = Math.max(entry.getValue(),max);
            }
        }

    }


}
