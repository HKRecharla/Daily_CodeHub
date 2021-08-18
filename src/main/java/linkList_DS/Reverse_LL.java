package linkList_DS;

public class Reverse_LL {

    ListNode head;
    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
        data=data;
        next=null;
        }
    }


    ListNode reverse(ListNode list){
        ListNode prev=null;
        ListNode curr = list;
        ListNode next=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        list=prev;
        return list;
    }

    ListNode reverse(ListNode list,int K){
        ListNode prev=null;
        ListNode curr = list;
        ListNode next=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        list=prev;
        return list;
    }

}
