package LinkedList;

public class AddLast {

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
    public void AddLast(int data) {
        // Create New Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // tail=newNode.next
        tail.next = newNode;
        // tail = new node
        tail = newNode;
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
        AddLast ll = new AddLast();
        ll.print();
        ll.AddLast(1);
        ll.print();
        ll.AddLast(2);
        ll.print();
    }

}
