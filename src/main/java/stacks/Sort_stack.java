package stacks;

import java.util.Stack;

public class Sort_stack {


    public static void main(String[] args) {

        int[] A={5, 17, 100, 11};
        Stack<Integer> s = sort(A);
        int size =s.size();
        for (int i = 0; i < size; i++) {
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }


    public static Stack<Integer> sortstack(int[] A){

        Stack<Integer> actual_stack = new Stack<>();
        Stack<Integer> min_stack = new Stack<>();

        actual_stack.push(A[0]);
        int minimum = actual_stack.peek();
        int maximum = actual_stack.peek();

        int len= A.length;
        for (int i = 1; i <len ; i++) {
            minimum = Math.min(minimum,A[i]);
            maximum = Math.max(maximum,A[i]);
            if(minimum>actual_stack.peek()){
                for (int j = 0; j < actual_stack.size(); j++) {
                    min_stack.push(actual_stack.peek());
                    actual_stack.pop();
                }
                actual_stack.push(minimum);
            }
        }
        return actual_stack;
    }


    public static Stack<Integer> sort(int[] A){
        Stack<Integer> min_stack = new Stack<>();
        Stack<Integer> max_stack = new Stack<>();

        min_stack.push(A[0]);

        int min = Integer.MAX_VALUE;
        min= Math.min(min,min_stack.peek());
        for (int i = 1; i <A.length ; i++) {
            boolean flag =true;
            while (flag){
                if(!min_stack.isEmpty() && A[i] > min_stack.peek()){
                    max_stack.push(min_stack.peek());
                    min_stack.pop();
                } else {
                    flag=false;
                }
            }
            min_stack.push(A[i]);
            int size=max_stack.size();
            for (int j = 0; j <size; j++) {
                min_stack.push(max_stack.peek());
                max_stack.pop();
            }
        }


        return min_stack;
    }
}
