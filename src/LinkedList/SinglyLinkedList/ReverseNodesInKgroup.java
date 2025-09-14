package LinkedList.SinglyLinkedList;

class Node{
    int val;
    Node next;

    Node(){ }
    Node(int val, Node next){
        this.val=val;
        this.next=next;
    }
}
public class ReverseNodesInKgroup {
    public static void main(String[] args) {

        Node node= new Node(1,new Node(2, new Node(3, new Node(4,new Node(5, new Node())))));
        printNode(node);

        reverse(node);
        System.out.println("After reverse");
        Node result = reverse(node);
        printNode(result);




    }
    public static void printNode(Node head){
        Node curr = head;
        int i=1;
        while(curr.next!=null){
            System.out.println("Value : "+ curr.val);
            curr=curr.next;
        }
    }

    public static Node reverse(Node head){
        Node curr = head;
        Node result=null;
        Node prev = null;
        while(curr.next!=null){
            Node temp = curr;
            curr.next = prev;
            prev=temp;
            curr=temp.next;
        }
        return prev;
    }
}
