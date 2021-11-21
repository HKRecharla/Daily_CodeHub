package backTracking;

import java.util.ArrayList;
import java.util.List;

public class Anagram {


    public static void main(String[] args) {


        int s = findcount("mn","op");
        System.out.println(s);
    }


    public static int findcount(String a, String b){
        int char_c[] = new int[26];
        int count =0;
        for (int i = 0; i < a.length(); i++) {
            char_c[a.charAt(i)-'a']++;
        }

        for (int j = 0; j < b.length(); j++) {
            char_c[b.charAt(j)-'a']--;
        }

        for (int j2 = 0; j2 < 26; j2++) {
            if(char_c[j2]<0){
                count+=Math.abs(char_c[j2]);
            }
        }
        return count;
    }


    public static int count(String a, String b){

        int count1[] = new int[26];
        int count2[] = new int[26];

        for (int i = 0; i < a.length(); i++) {
            count1[a.charAt(i)-'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            count1[b.charAt(i)-'a']++;
        }

        int result =0;
        for (int i = 0; i < 26; i++) {
            result+=Math.abs(count1[i]-count2[i]);
        }

        return result;
    }

}
