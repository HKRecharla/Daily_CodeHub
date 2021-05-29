package hashing;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class SubSequence_colorful {

    public static void main(String[] args) {

        int A = 23;
        color(A);

    }



    public static void color(int A){

        String s =  String.valueOf(A);
        int count=0;
        for (int i = 1; i <=s.length(); i++) {
            count =count+i;
        }
        System.out.println(count);

        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        int total = 1;
        for (int i = 0; i < s.length(); i++) {
            int val = Integer.parseInt(String.valueOf(s.charAt(i)));
            map.put(i,val);
            total=total*val;
            System.out.print(val+" ");
        }

        System.out.println();
        int size = map.size();
        int start=1;
        int key=size;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                map.put(key,map.get(j-1)*map.get(start));
                System.out.print(map.get(key)+" ");
                key++;
                start++;
            }
            start++;
            size--;
            System.out.println();
        }
        System.out.println(total);

        for (int i = 0; i < map.size(); i++) {
            if (map2.containsKey(map.get(i))) {
                System.out.println("    "+1);
                break;
            }else {
                map2.put(map.get(i),1);
            }
        }

    }
}
