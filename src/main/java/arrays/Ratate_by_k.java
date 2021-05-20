package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ratate_by_k {

    public static void main(String[] args) {

        List<String> array = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();

        //System.out.println(v);
        for (int i = 1; i <=(v*2)+1; i++) {
            array.add(scanner.nextLine());
        }
        scanner.close();
        //System.out.println(array);


        for (int i = 1; i <(v*2) ; i =i+2) {
           String c=  array.get(i);
            //System.out.println(c);
            String[] sp = c.split("\\s+");

            int string_array_length = sp.length;
            int []  integer_array = new int [string_array_length-1];
            for(int k=1; k<string_array_length; k++) {
                integer_array[k-1] = Integer.parseInt(sp[k]);
                //System.out.print(integer_array[k-1]);
            }
            int s = Integer.parseInt(array.get(i+1));

            integer_array  =reverse(integer_array, 0, integer_array.length - 1);

            reverse(integer_array,0,s-1);

            reverse(integer_array,s,integer_array.length-1);
            String vl = "";
            for (int j = 0; j < integer_array.length; j++) {
                vl =vl+" "+integer_array[j];
            }
            vl = vl.replaceFirst("\\s+","");
            System.out.println(vl);
        }

    }

//    public static String[] reverse(String[] s,int start,int end){
//
//        String[] a = new String[s.length-1];
//        int v= 0;
//        for (int i = start; i >=end; i--) {
//            a[v] = s[i];
//            System.out.print(a[v]);
//            v++;
//        }
//        System.out.println();
//        return a;
//    }


    public static int[] reverse(int[] a, int l,int r ){
        while (l<r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        return a;
    }

}
