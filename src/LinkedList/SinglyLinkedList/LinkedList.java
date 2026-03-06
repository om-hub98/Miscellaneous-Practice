package LinkedList.SinglyLinkedList;

import LinkedList.Node;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){

        this.size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
            size+=1;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size+=1;
    }

    public void insertAtIndex(int value, int index){
        Node node = new Node(value);

        if(index == 0){
            this.insertFirst(value);
            return;
        }

        if(head == null){
            head = node;
            size+=1;
            return;
        }

        Node temp = head;
        int count = 0;
        while(temp != null){
            if(count == index){
                Node tempRight = temp.next;
                temp.next = node;
                node.next = tempRight;
            }
            temp = temp.next;
            count++;
        }
        size+=1;
    }

    public void removeFirst(){

        Node temp = null;
        if(head != null){
            temp = head.next;
            head.next = null;
        }
        head = temp;
    }

    public void removeLast(){

        // to handle null pointer exception for only one node list
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp != null){
            if(temp.next.next == null){
                temp.next = null;
            }
            temp = temp.next;
        }
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
    }
}
