package LinkedList.SinglyLinkedList;

public class LLMain {
    public static void main(String[] args) {
       // Node node1 = new Node(4,new Node(8,new Node(9,new Node(1,null))));

        LinkedList ll = new LinkedList();
        ll.insertFirst(3);
//        ll.insertFirst(4);
//        ll.insertLast(10);
//        ll.insertLast(17);
//        ll.insertAtIndex(100,0);
        ll.removeFirst();
       // ll.removeLast();
        ll.display();
    }
}
