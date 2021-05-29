package sorting;

import java.util.Arrays;

public class Longest_NUmber {

    public static void main(String[] args) {

        int[] A={813, 696, 751, 718, 303, 947, 67, 633, 821, 587, 907, 331, 193, 667, 99, 496, 619, 841, 339, 981, 908, 576, 832, 491, 574, 899, 875, 871, 594, 672, 708, 931, 237, 587, 224, 638, 485, 102, 475, 281, 722, 77, 903, 386, 263, 652};
        long_Series(A);
    }



    public static void longest_series(int[] A){
        StringBuilder sb = new StringBuilder();
        Node node[] = new Node[A.length];

        int i=0;
        for (int n:A) {
            node[i] = new Node(n);
            i++;
        }

        Arrays.sort(node);

        for (Node num: node) {
            if(num.number ==0 && sb.length()!=0){
                continue;
            }else{
                sb.append(num.number).toString();
            }
        }
        System.out.println(sb);

    }

    public static class Node implements Comparable<Node>{

        int number;
        public Node(int number){
            this.number =number;
        }



        @Override
        public int compareTo(Node theres) {

            String first = String.valueOf(this.number)+String.valueOf(theres.number);
            String second = String.valueOf(theres.number)+String.valueOf(this.number);
            return second.compareTo(first);
        }
    }


























    public static void long_Series(int[] A){
        StringBuffer sb =  new StringBuffer();
        // create new Node
        Node num[]= new Node[A.length];
        int i=0;

        //Add A element in each Node
        for(int n : A) {
            num[i] = new Node(n);
            i++;
        }

        //sort
        Arrays.sort(num);

        //check and compare
        for (Node n: num) {
            if(n.number ==0 && sb.length()!=0){
                continue;
            }else{
                sb.append(n.number).toString();
            }
        }

        System.out.println(sb);
    }



//    public static class Node implements Comparable<Node>{
//
//        int number;
//        public Node(int number){
//            this.number=number;
//        }
//
//        @Override
//        public int compareTo(Node theres) {
//            String first ="";
//            String second ="";
//            first =String.valueOf(this.number)+String.valueOf(theres.number);
//            second = String.valueOf(theres.number)+String.valueOf(this.number);
//            return second.compareTo(first);
//        }
//    }



    public static void longest_num(int[] A){
        int len = A.length;

        int min= Integer.MAX_VALUE;
        String res="";
        for (int i = 0; i < len; i++) {
                min=i;
            for (int j = i+1; j < len; j++) {
                String a= String.valueOf(A[i])+""+String.valueOf(A[j]);
                String b= String.valueOf(A[j])+""+String.valueOf(A[i]);
                if((long)Integer.parseInt(a)<(long)Integer.parseInt(b)){
                    min=j;
                    int temp = A[min];
                    A[min] =A[i];
                    A[i]=temp;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            res =res+A[i];
        }
    }

    public static void longest(int[] A){

        int len = A.length;

        boolean flag =true;
        int start=0;
        int end =1;
        int[] arr = new int[len];
        int in=0;
        Arrays.sort(A);
        String res="";

        while (flag){
            int count=0;
            for (int i = 0; i < len-1; i++) {
                if(A[start]<0){
                    start++;
                    count++;
                   end++;
                }else if(A[end]<0){
                    end++;
                }else{
                        String a= String.valueOf(A[start])+""+String.valueOf(A[end]);
                        String b= String.valueOf(A[end])+""+String.valueOf(A[start]);
                        if(Integer.parseInt(a)>Integer.parseInt(b)){
                            start =start;
                            end++;
                        }else if(Integer.parseInt(a)<Integer.parseInt(b)){
                            start =end;
                            end++;
                        }
                }
                if(end>len-1){
                    break;
                }
            }
            if(in<len){
                arr[in]=A[start];
                A[start]=-1;
            }

            in++;
            start=0;
            end=1;
            if(count==len-1){
                break;
            }

        }
        for (int i = 0; i < len; i++) {
            res +=arr[i];
        }
        System.out.println(res);
    }
}
