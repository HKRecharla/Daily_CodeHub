package stacks;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> arr;
    ArrayList<Integer> min_arr;
    int top;
    int min=Integer.MAX_VALUE;


    Stack(){
        arr= new ArrayList<>();
        min_arr=new ArrayList<>();
        top=-1;
    }
    public int minimum(int a, int b){
      return Math.min(a,b);
    }

    public void push(int x){
        arr.add(x);
        top++;
        min=minimum(min,arr.get(top));
        min_arr.add(min);
    }

    public void pop(){
        arr.remove(top);
        min_arr.remove(top);
        top--;
    }

    public void peek(){
        System.out.println(arr.get(top));
    }

    public void getMin(){
        print_min();
    }

    public void print_min(){
        System.out.println(min_arr.get(top));
    }


}
