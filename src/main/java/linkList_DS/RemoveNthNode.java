package linkList_DS;

public class RemoveNthNode {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            data=data;
            next=null;
        }
        public  int length(){
            Node temp = head;
            int count =0;
            while (temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }


        public  RemoveNthNode delete(RemoveNthNode list, int B){

            Node curr = list.head;
            Node prev= null;

            if(B==0 && curr!=null){
                list.head =curr.next;
                return list;
            }

            int count=0;
           while (curr!=null){
              if(count==B){
                  prev.next=curr.next;
                  break;
              }else{
                  prev =curr;
                  curr=curr.next;
                  count++;
              }
           }
            return list;
        }

    }

}
