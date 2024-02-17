package LinkedList;

public class SearchElement {
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

    public boolean search(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchElement se = new SearchElement();
        se.addFirst(1);
        se.addFirst(2);
        se.addFirst(3);
        System.out.println(se.search(2));
        System.out.println(se.search(0));
    }

}
