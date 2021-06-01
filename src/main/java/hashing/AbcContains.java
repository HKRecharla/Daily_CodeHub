package hashing;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AbcContains {


    public static void main(String[] args) {
        String a ="abc";
        String b="abcbacabc";

        //abc -
        //bcb
        //cba -
        //bac -
        //aca
        //cab -
        //abc -
        anagram_array(a,b);

        HashMap<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",1);
        map.put("c",1);

        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("a",1);
        map2.put("b",1);
        map2.put("c",1);
        map2.put("d",0);

//
       if(map.equals(map2)){
           System.out.println("equals");
       }
    }



    public static int anagram_array(String A,String B){
        /**
         * Count frequency of A
         * count frequenct of sub array
         * move 1 step ahead
         */
        int[] a = new int[26];
        int[] b = new int[26];

        int count=0;
        for (int i = 0; i < A.length(); i++) {
            a[A.charAt(i)-'a']+=1;

        }

        for (int i = 0; i < A.length(); i++) {
            b[B.charAt(i)-'a']+=1;
        }
        
        count += calculate(a,b);

        for (int i = A.length(), j=0;i<B.length();i+=1,j+=1) {
            b[B.charAt(j)-'a']-=1;
            b[B.charAt(i)-'a']+=1;
            count+=calculate(a,b);
        }
        System.out.println(count);
    return count;

    }

    public static int calculate(int[] a, int[] b){
        for (int i = 0; i < 26; i++) {

            if(a[i]!=b[i]){
                return 0;
            }
        }
        return 1;
    }


    public static void anagram2(String A,String B){
        int alen = A.length();
        int count =0;
        for (int i = 0; i < B.length()-(A.length()-1); i++) {

            String sub = B.substring(i,alen);
            char[] one = A.toCharArray();
            char[] two = sub.toCharArray();

            Arrays.sort(one);
            Arrays.sort(two);
            if(Arrays.equals(one,two)){
                count++;
            }
            alen++;
        }
        System.out.println(count);

    }


    public static int anagram(String A,String B){

        int alen = A.length();

       // System.out.println(alen);
        //System.out.println(B.length());

        int count =0;
        HashMap<String, Integer> map = contain(A);
        String sub = B.substring(0,alen);
        HashMap<String, Integer> map2 = contain(sub);
        if(map.equals(map2)){
            count++;
        }
        for (int i = alen; i < B.length(); i++) {
            //ebbp
        //qaoedpcebeaqocbacoccqoebpqdoqcpbdbqcecdoqcpebqpebbabqdpepcpbqbepbabocpc
            if(map2.containsKey(String.valueOf(B.charAt(i)))){
                map2.put(String.valueOf(B.charAt(i)),map2.get(String.valueOf(B.charAt(i)))+1);
            }else{
                map2.put(String.valueOf(B.charAt(i)),1);
            }
            if(map2.containsKey(String.valueOf(B.charAt(i-alen)))) {
                map2.put(String.valueOf(B.charAt(i - alen)), map2.get(String.valueOf(B.charAt(i - alen))) - 1);
            }

            boolean flag = equal(A,map2);
            if(flag){
                count++;
            }
        }

       System.out.println("count "+count);
        return count;
    }

    public static boolean equal(String A,HashMap<String, Integer> map2){
        for (int i = 0; i < A.length(); i++) {
          if( map2.containsKey(String.valueOf(A.charAt(i)))){
              if(map2.get(String.valueOf(A.charAt(i)))==1){
                  continue;
              }else{
                  return false;
              }
          }else{
              return false;
          }
        }
        return true;
    }




        public static HashMap<String,Integer> contain(String a){
            HashMap<String,Integer> map = new HashMap<>();
            for (int i = 0; i < a.length(); i++) {
               String val =  String.valueOf(a.charAt(i));
               if(map.containsKey(val)){
                   map.put(val,map.get(val)+1);
               }else{
                   map.put(val,1);
               }
            }
            return map;
        }

    public static void mapp(String a,String b){
        HashMap<String,Integer> map = new HashMap<>();

//        for (int i = 0; i < ; i++) {
//
//        }
        
        for (int i = 0; i < b.length()-a.length()+1; i++) {
            int j = i+a.length();
            String sub =  b.substring(i,j);
            
        }
    }


    public static String number(String a){
        String v ="";


        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            v += " "+String.valueOf((int)chars[i]);
        }
       // BigInteger big = new BigInteger(v);
        return v;
    }
}
