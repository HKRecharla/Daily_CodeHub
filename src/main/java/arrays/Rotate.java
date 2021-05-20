package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rotate {

    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> barr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            int n = scan.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr.add(scan.nextInt());
            }
            list.add(arr);
            int b = scan.nextInt();
            arr=  reverse(arr,0,n-1);
            arr= reverse(arr,0,b-1);
            arr= reverse(arr,b,n-1);
            System.out.println(arr);
        }
        scan.close();








    }

    public static void readInput(){
        List<String> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println();
        System.out.println(a);
        for (int i = 0; i < a; i++) {
            int n = scan.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr.add(scan.nextInt());
            }
            int b = scan.nextInt();
            for (int j = 0; j <arr.size() ; j++) {
               arr =  reverse(arr,0,arr.size()-1);
                arr = reverse(arr,0,b-1);
                arr =reverse(arr,b,n-1);
            }
            System.out.println(arr);
        }
    }




    public static List<Integer> reverse(List<Integer> a, int l,int r ){
        while (l<r){
            int temp = a.get(l);
            a.set(l,a.get(r));
            a.set(r,temp);
            l++;
            r--;
        }
        return a;
    }

}
