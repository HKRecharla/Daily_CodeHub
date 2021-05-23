package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SUm_subarray {
    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 4, 5 };
        // {42, 9, 38, 36, 48, 33, 36, 50, 38, 8, 13, 37, 33, 38, 17, 25, 50, 50, 41,
        // 29, 34, 18, 16, 6, 49, 16, 21, 29, 41, 7, 37, 14, 5, 30, 35, 26, 38, 35, 9,
        // 36, 34, 39, 9, 4, 41, 40, 3, 50, 27, 17, 14, 5, 31, 42, 5, 39, 38, 38, 47,
        // 24, 41, 5, 50, 9, 29, 14, 19, 27, 6, 23, 17, 1, 22, 38, 35, 6, 35, 41, 34,
        // 21, 30, 45, 48, 45, 37};
        // {5, 10, 20, 100, 105};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }
        int B = -10;
        sub_sum(list, B);

    }

    public static ArrayList<Integer> solve2(ArrayList<Integer> A, int B) {

        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> plist = new ArrayList<>();
        plist.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            plist.add(plist.get(i - 1) + A.get(i));
        }
        System.out.println(A);
        System.out.println(plist);

        ArrayList<Integer> array = new ArrayList<>();

        plist.add(A.get(0));

        for (int i = 1; i < A.size(); i++) {
            plist.add(plist.get(i - 1) + A.get(i));
            int x = B - plist.get(i);
            if (map.containsKey(x)) {
                String c = String.valueOf(map.get(x));
                map.put(x, c + "," + x);
            } else {
                map.put(plist.get(i), String.valueOf(x));
            }
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

        // for (int i = 0; i < plist.size(); i++) {
        // int val = A.get(i)+plist.get(i);
        // if(val==B){
        // System.out.println(val);
        // list.add(A.get(i));
        // list.add(plist.get(i));
        // return list;
        // }
        // }
        // for (int i = 0; i < A.size(); i++) {
        // int val = B-A.get(i);
        // if(map.containsKey(A.get(i))){
        // int uv = map.get(A.get(i))+A.get(i);
        // if(uv==B){
        // list.add(map.get(A.get(i)));
        // list.add(A.get(i));
        // System.out.println(list);
        // return list;
        // }
        // }else{
        // map.put(val,A.get(i));//4:1,3:2,
        // }
        // }

        list.add(-1);
        System.out.println(list);
        return list;
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            int val = B - A.get(i);
            if (map.containsKey(A.get(i))) {
                int uv = map.get(A.get(i)) + A.get(i);
                if (uv == B) {
                    list.add(map.get(A.get(i)));
                    list.add(A.get(i));
                    System.out.println(list);
                    return list;
                }
            } else {
                map.put(val, A.get(i));// 4:1,3:2,
            }
        }

        list.add(-1);
        System.out.println(list);
        return list;
    }

    public static ArrayList<Integer> solv4(ArrayList<Integer> A, int B) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            int val = B - A.get(i);

            if (map.containsKey(A.get(i))) {
                int uv = map.get(A.get(i)) + A.get(i);
                if (uv == B) {
                    list.add(map.get(A.get(i)));
                    list.add(A.get(i));
                    System.out.println(list);
                    return list;
                }
            } else {
                map.put(val, A.get(i));// 4:1,3:2,
            }
        }

        list.add(-1);
        System.out.println(list);
        return list;
    }

    public static int sum(ArrayList<Integer> A, int B) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            int sum = 0;
            for (int j = i; j < A.size(); j++) {
                sum = sum + A.get(j);
                if (sum == B) {
                    return 1;
                }
            }
        }
        return 0;

    }

    public static ArrayList<Integer> psub(ArrayList<Integer> A, int B, int start) {
        ArrayList<Integer> plist = new ArrayList<>();

        plist.add(start);
        for (int i = start; i < A.size(); i++) {
            plist.add(plist.get(i) + A.get(i + 1));
        }
        return plist;
    }

    public static void sub_sum(ArrayList<Integer> A, int B) {
        ArrayList<Integer> plist = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        plist.add(0);
        for (int i = 1; i < A.size(); i++) {
            plist.add(plist.get(i - 1) + A.get(i));
        }
        map.put(plist.get(0), 1);
        for (int i = 1; i < A.size(); i++) {
            int val = B - plist.get(i);
            if (map.containsKey(val)) {
                int uv = map.get(val);
                map.put(plist.get(i), uv + 1);
            } else {
                map.put(plist.get(i), 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

//    public static void sub_sum1(ArrayList<Integer> A) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 1; i < A.size(); i++) {
//            int val = B - plist.get(i);
//            if (map.containsKey(val)) {
//                int uv = map.get(val);
//                map.put(plist.get(i), uv + 1);
//            } else {
//                map.put(plist.get(i), 1);
//            }
//        }
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }

    public static int sum2(ArrayList<Integer> A, int B) {

        int len = A.size();
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int val = B - A.get(i);
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + "," + String.valueOf(i + 1));
                break;
            } else {
                map.put(A.get(i), String.valueOf(i + 1));
            }
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // System.out.println("Zero :: "+0);
        return 0;
    }
}
