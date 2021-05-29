package strings_cla;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ChangeCharacter {

    public static void main(String[] args) {

        String A="qghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrtkjprepggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxfxtlsgypsfadpooefxzbcoejuvpvaboygpoeylfpbnpljvrvipyamyehwqnqrqpmxujjloovaowuxwhmsncbxcoksfzkvatxdknlyjyhfixjswnkkufnuxxzrzbmnmgqooketlyhnkoaugzqrcddiuteiojwayyzpvscmpsajlfvgubfaaovlzylntrkdcpwsrtesjwhdizcobzcnfwlqijtvdwvxhrcbldvgylwgbusbmborxtlhcsmpxohgmgnkeufdxotogbgxpeyanfetcukepzshkljugggekjdqzjenpevqgxiepjsrdzjazujllchhbfqmkimwzobiwybxduunfsksrsrtekmq";
        int B=119;
        cc(A,B);
    }




    public static void cc(String A,int B){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            if(map.containsKey(A.charAt(i))){
                map.put(A.charAt(i), map.get(A.charAt(i))+1);
            }else{
                map.put(A.charAt(i),1);
            }
        }

        int[] a = new int[map.size()];
        int i=0;
        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
           a[i]=entry.getValue();
            i++;
        }

        Arrays.sort(a);
        int val =B;
        for (int j = 0; j < B; j++) {
            if(a[j]<=val){
                val = val-a[j];
                a[j]=0;
            }
            if(j>=map.size()-1){
                break;
            }
            System.out.print(a[j]+" ");
        }

        System.out.println();
        int count  =0;
        for (int j = 0; j < a.length; j++) {
            if(a[j]>0){
                count++;
            }
        }

        System.out.println(count);


    }

    public static void character(String A,int B){

        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            if(map.containsKey(A.charAt(i))){
                map.put(A.charAt(i), (char) (map.get(A.charAt(i))+1));
            }else{
                map.put(A.charAt(i),'1');
            }
        }


        int i=1;
        for (Map.Entry<Character,Character> entry:map.entrySet()
             ) {

            if(entry.getValue() == '1'){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }


        }
    }
}
