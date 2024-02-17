package LinkedList;

public class RemoveLast {
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

    public int removeLast() {
        int val = tail.data;

        return val;

    }

    public static void main(String[] args) {
        RemoveLast rl = new RemoveLast();
        rl.AddLast(1);
        rl.AddLast(2);
        rl.AddLast(3);
        rl.print();
        rl.removeLast();
        rl.print();
        System.out.println(rl.removeLast());

    }

}
