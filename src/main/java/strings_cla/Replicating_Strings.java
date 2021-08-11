package strings_cla;

import java.util.HashMap;
import java.util.Map;

public class Replicating_Strings {

    public static void main(String[] args) {
        int A=2;
        String B="bbaabbc";


        HashMap<Character,Integer> map = new HashMap<>();

        char[] c = B.toCharArray();
        for (int i = 0; i < B.length(); i++) {
            if(map.containsKey(c[i])){
                map.put(c[i],map.get(c[i])+1);
            }else{
                map.put(c[i],1);
            }
        }


        for (Map.Entry<Character,Integer> entry:map.entrySet()
             ) {

            if(entry.getValue()<A){
                break;
            }
        }

    }
}
