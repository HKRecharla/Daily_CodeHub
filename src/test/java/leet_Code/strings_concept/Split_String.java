package leet_Code.strings_concept;

import java.util.HashMap;

public class Split_String {


    public static void main(String[] args) {

        String s="thequickbrownfoxjumpsoverthelazydog";
        HashMap<Character,Integer> map= new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else{
                    map.put(c,1);
                }
            }
        }

        if(map.size()==26) System.out.println("true");
        else System.out.println("false");


    }
}
