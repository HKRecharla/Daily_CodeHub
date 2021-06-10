package prblem_solving_2;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Sliding_Window {

    public static void main(String[] args) {

        int[] a={648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 207, 368};
                //{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
                //{648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 207, 368};
                //{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        int B=9;
        slide_6(list,B);

    }

    
    public static void slide_6(ArrayList<Integer> A, int B){
        Deque<Integer> queue = new LinkedList<>();

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < A.size(); i++) {

            if(queue.peekFirst()!=null && queue.peekFirst()<=(i-B)){
                queue.removeFirst();
            }

            while (queue.peekFirst()!=null && A.get(queue.peekFirst())<A.get(i)){
                queue.removeLast();
            }
            queue.addLast(i);
            if(i>=(B-1)){
                list.add(A.get(queue.peekFirst()));
            }

        }

        System.out.println(list);

    }
    
    

    public static void slide_4( ArrayList<Integer> A, int B){
        int len = A.size();
        int N=B;
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < len-B+1; i++) {
            int max=Integer.MIN_VALUE;
            for (int j = i; j <N ; j++) {
                max = Math.max(A.get(j),max);
            }
            list.add(max);
            N++;
        }


    }


    public static void slide_3(ArrayList<Integer> A, int B){
        Stack<Integer> stack = new Stack<>();
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = B-1; i>=0; i--) {
            push(A.get(i));
           max =  getMax();
        }
         list.add( max);

        for (int i = B; i < A.size(); i++) {
            pop();
            push(A.get(i));
            max =  getMax();
            list.add( max);
            //trackStack.remove(i-B);
        }
        System.out.println(list);
    }



    static Stack<Integer> mainStack = new Stack<Integer> ();

    static Stack<Integer> trackStack = new Stack<Integer> ();

    static void push(int x){
        if(trackStack.size()==0){
            trackStack.push(x);
            return;
        }
        if (x > trackStack.peek())
            trackStack.push(x);
        else
            trackStack.push(trackStack.peek());
    }

    static int getMax(){
        return trackStack.peek();
    }

    static void pop(){
        trackStack.pop();
    }








    public static void slide_2(ArrayList<Integer> A, int B){

//        ArrayList<Integer> l = new ArrayList<>();
//        l.add(A.get(0));
//        for (int i = 1; i <A.size() ; i++) {
//            l.add(l.get(i-1)+A.get(i));
//        }
//        System.out.println(l);

        int len = A.size();
        ArrayList<Integer> list = new ArrayList<>();
        int max =0;


        for (int i = 0; i < B; i++) {
            max= Math.max(max,A.get(i));
        }
        list.add(max);

        System.out.println("Max :: "+max);

        for (int i = B; i < len; i++) {
            if(max >A.get(i) && A.get(i) <max){
                list.add(A.get(i));
            }else if(A.get(i) <max){
                list.add(max);
            }else if(A.get(i)>max){
                max = A.get(i);
                list.add(max);
            }
            System.out.println(list);
        }
        System.out.println(list);
    }

    public static void slide(ArrayList<Integer> A, int B){

        ArrayList<Integer> l = new ArrayList<>();
        l.add(A.get(0));
        for (int i = 1; i <A.size() ; i++) {
            l.add(l.get(i-1)+A.get(i));
        }
        System.out.println(l);

        int len = A.size();
        ArrayList<Integer> list = new ArrayList<>();
        int sum =Integer.MIN_VALUE;;


        for (int i = 0; i < B; i++) {
            sum= Math.max(sum,A.get(i));
        }
        list.add(sum);


        for (int i = B; i < len; i++) {
            if(sum>A.get(i) ){
                if(A.get(i-B+1) > A.get(i) ){
                    list.add(A.get(i-B+1));
                }else {
                    list.add(sum);
                }
            }else{
                sum=A.get(i);
                list.add(sum);
            }

            /**
             * else if(A.get(i-B+1) > A.get(i) ){
             *                     list.add(A.get(i-B+1));
             *                 }
             */

        }
        System.out.println(list);
    }


    public static void slid(int[] A, int B){
        Node node[] = new Node[A.length];
        int i=0;
        for(int n:A){
            node[i]= new Node(n);
            i++;
        }

        int N=B;
        for (int j = 0; j < A.length-B; j++) {

            N++;
        }




    }

    public static class Node implements Comparable<Node>{
        int num;
        public Node(int num){
            this.num=num;
        }
        @Override
        public int compareTo(Node o) {
            String a = String.valueOf(this.num);
            String b = String.valueOf(o.num);
            return a.compareTo(b);
        }
    }



}
