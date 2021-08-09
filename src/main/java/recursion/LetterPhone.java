package recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class LetterPhone {
    public static void main(String[] args) {
        letters("2");
    }


    public static ArrayList<String> letters(String A ){
        ArrayList<String> list = new ArrayList<>();
        HashMap<Character,String> map = new HashMap<>();
        map.put('0',"0");
        map.put('1',"1");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        char[] c = A.toCharArray();
        int len = A.length();
        if(A.length()==1){
            char[] ac = map.get(A.charAt(0)).toCharArray();
            for (int i = 0; i <ac.length ; i++) {
                list.add(String.valueOf(ac[i]));
            }
            System.out.println(list);
            return list;
        }else if(A.length()>1){
            for (int i = 0; i < map.get(c[len-2]).length(); i++) {
                for (int j = 0; j < map.get(c[len-1]).length(); j++) {
                    char[] cl = map.get(c[len-2]).toCharArray();
                    char[] cb = map.get(c[len-1]).toCharArray();
                    String val =String.valueOf(cl[i])+String.valueOf(cb[j]);
                    list.add(val);
                }
            }
            System.out.println(list);
        }
        if(len>2){
            for (int i =A.length()-3; i >=0; i--) {
                list = generate(A, list, map, i);
            }
        }

        System.out.println(list);
        return list;
    }
    
    public static ArrayList<String> generate(String A,ArrayList<String > list,
                                HashMap<Character,String> map,int i){
        ArrayList<String> newlist = new ArrayList<>();
           String cmap = map.get(A.charAt(i));
            char[] subc = cmap.toCharArray();
            for (int j = 0; j < subc.length; j++) {
                for (int k = 0; k < list.size(); k++) {
                    newlist.add(String.valueOf(subc[j])+list.get(k));
                }
            }
        return newlist;
    }
}
