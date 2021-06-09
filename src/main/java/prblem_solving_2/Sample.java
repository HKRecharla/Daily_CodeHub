package prblem_solving_2;

import java.util.Stack;

public class Sample {

    static Stack<Integer> mainStack = new Stack<Integer> ();

    static Stack<Integer> trackStack = new Stack<Integer> ();

    static void push(int x){
        mainStack.push(x);
        if (mainStack.size() == 1) {
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

    static void pop()
    {
        mainStack.pop();
        trackStack.pop();
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        s.push(20);
        s.push(10);
        s.push(50);
        System.out.println(s.getMax());
        pop();
        System.out.println(s.getMax());
    }
}
