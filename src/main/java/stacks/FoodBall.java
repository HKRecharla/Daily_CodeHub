package stacks;

import java.util.Stack;

public class FoodBall {

    public static void main(String[] args) {
        int A=10;
        int B=38;
        int[] C={23,0,2,0,39,28,19,0,0,0};
        Stack<Integer> stack = new Stack<>();

        int ans = stack(A,B,C);
        System.out.println(ans);

    }

    public static int stack(int A, int B, int[] C){
        Stack<Integer> stack = new Stack<>();

        if(C.length==1) return C[0];

        for (int i = 0; i < C.length; i++) {
            if(C[i]==0){
                stack.pop();
            }else{
                stack.push(C[i]);
            }
        }
        if(stack.isEmpty()) return B;
        return stack.peek();
    }
}
