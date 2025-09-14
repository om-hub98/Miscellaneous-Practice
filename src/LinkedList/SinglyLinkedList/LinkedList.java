package LinkedList.SinglyLinkedList;

//import LinkedList.Node;

/**
 * @author omraj
 */
public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }


    public class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    }

}
