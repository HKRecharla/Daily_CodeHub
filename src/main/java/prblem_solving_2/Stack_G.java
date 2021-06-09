package prblem_solving_2;

public class Stack_G {


    static class Node{
        int val,max;
    }



    static class Stack{
        Node s[];
        int size, top;

        Stack(int size){
            this.size=size;
            s = new Node[size];
            for (int i = 0; i < size; i++) {
                s[i] = new Node();
            }
            top=-1;
        }

        void push(int n){
            if(top == size-1){
                //full
            }else{
                top++;
                if(top==0){
                    s[top].val=n;
                    s[top].max=n;
                }else{

                }
            }
        }




    }




}
