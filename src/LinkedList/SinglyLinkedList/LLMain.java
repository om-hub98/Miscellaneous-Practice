package LinkedList.SinglyLinkedList;
//import LinkedList.Node;
/**
 * @author omraj
 */
public class LLMain {
    public static void main(String[] args) {
       // Node node1 = new Node(4,new Node(8,new Node(9,new Node(1,null))));

        LinkedList ll = new LinkedList();
        ll.insertFirst(4);
        ll.insertFirst(8);
        ll.insertFirst(9);
        ll.insertFirst(3);
        ll.display();
    }
}
