package LinkedList;

public class RemoveFirst {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

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

    public void removeFirst() {
        Node temp = head;
        head = temp.next;
    }

    public static void main(String[] args) {
        RemoveFirst rf = new RemoveFirst();
        rf.addFirst(1);
        rf.addFirst(2);
        rf.addFirst(3);
        rf.print();
        rf.removeFirst();
        rf.print();

    }

}
