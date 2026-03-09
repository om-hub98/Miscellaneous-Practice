package LinkedList.SinglyLinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1,new Node(2, new Node(3, new Node(4, new Node(5,null)))));

        System.out.println("Complete Reversal of Linked List ::");
        Node result = reverseLL(head);
        printLL(result);
        System.out.println();

        Node head2 = new Node(1,new Node(2, new Node(3, new Node(4, new Node(5,null)))));
        System.out.println("Index based Reversal of Linked List ::");
        int left = 3, right = 4;
        Node resultNode = reverseBasedOnPosition(head2, left, right);
        printLL(resultNode);

    }
    /*
    Approach is :  3 pointer algorithm
    Time complexity : O(N) , Space complexity : O(1)
    prev, curr and temp pointer => to hold previous node, current node, temporary reference node
     -iterating till curr node is not null
     -after each iteration reverse the address of the node
    */

    public static Node reverseLL(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    /*
    Approach :
        - Find previous node before left position
        - reverse the sublist between left and right position
     */
    public static Node reverseBasedOnPosition(Node head, int left, int right){

        Node dummy = new Node(0, head);     // instead of modifying original node head, use dummy init with 0
        Node prev = dummy;
        for(int index = 0; index < left - 1; index++){
            prev = prev.next;
        }
        Node curr = prev.next;
        Node forw = curr.next;
        for(int index = 0; index < right - left; index++){
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
            forw = curr.next;
        }
        return dummy.next;
    }

    public static void printLL(Node head){
        while(head != null){
            if(head.next == null) {
                System.out.print(head.val);
                break;
            }
            System.out.print(head.val+"->");
            head = head.next;
        }
    }
}
