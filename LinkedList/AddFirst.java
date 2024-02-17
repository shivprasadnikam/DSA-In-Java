package LinkedList;

public class AddFirst {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Creating linked list head
    public static Node head;
    public static Node tail;

    // Add element first
    public void addFirst(int data) {

        // Create New Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // newNode.next=head
        newNode.next = head;
        // head = new node
        head = newNode;
    }

    // printing linkedlist
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Creating linked list tail
    public static void main(String[] args) {
        AddFirst ll = new AddFirst();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
    }

}
