package stacks;

import java.util.Stack;

public class Balanced_Paranthieses {


    public static void main(String[] args) {

    }

    public static boolean paranth(String A){

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
           char c =  A.charAt(i);
           if(c=='{' || c=='(' || c=='['){
               stack.push(c);
           }

           if (stack.isEmpty()){
               return false;
           }

           char check;
           switch (c){
               case ')':
                   check =stack.pop();
                   if(check=='{' || check == '['){
                       return false;
                   }
                   break;
               case '}':
                   check=stack.pop();
                   if(check=='(' || check=='[') return false;
                   break;
               case ']':
                   check=stack.pop();
                   if(check=='(' || check=='{' ) return false;
                   break;
           }

        }


        return stack.isEmpty();
    }
}
