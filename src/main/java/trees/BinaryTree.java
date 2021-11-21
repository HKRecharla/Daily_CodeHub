package trees;

public class BinaryTree {

    Node root;

    public void add(int value){

    }
}

class Node{
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value=value;
        left=null;
        right=null;
    }


    public Node addRecursive(Node current, int value){

        if (current==null) return new Node(value);

        if(value < current.value){
            current.left = addRecursive(current.left,value);
        }else if(value> current.value){
            current.right =addRecursive(current.right,value);
        }else{
            return current;
        }
        return current;
    }




    /**
     * add
     * Traverse
     */
}
