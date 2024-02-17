package LinkedList;

public class AddMiddle {

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

    public void insert(int idx, int val) {
        int count = 0;
        Node newNode = new Node(val);
        Node temp = head;
        while (count < idx - 1) {

            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void size() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        System.out.println("size->" + size);
    }

    public static void main(String[] args) {
        AddMiddle ll = new AddMiddle();
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print();
        ll.size();
        ll.insert(2, 2);
        ll.print();
        ll.size();
    }

}
