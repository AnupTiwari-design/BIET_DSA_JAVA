package Linked_list;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

class Linkedlist {
    Node head;

    Linkedlist() {
        head = null;
    }

    void insert_at_end(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newnode;
        }
    }

    void insert_at_beg(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void insert_at_position(int data, int position) {
        Node newnode = new Node(data);

        if (position == 0) {
            newnode.next = head;
            head = newnode;
            return;
        }

        Node curr = head;
        int count = 0;
        while (curr != null && count < position - 1) {
            curr = curr.next;
            count++;
        }

        if (curr == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newnode.next = curr.next;
        curr.next = newnode;
    }

    void delete_at_beg() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        head = head.next;
    }

    void delete_at_end() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    void delete_at_pos(int pos) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node curr = head;
        int count = 0;

        while (curr != null && count < pos - 1) {
            curr = curr.next;
            count++;
        }

        if (curr == null || curr.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        curr.next = curr.next.next;
    }

    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    void count_nodes() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        System.out.println("Total nodes: " + count);
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Linkedlist ob = new Linkedlist();

        ob.insert_at_end(1);
        ob.insert_at_end(2);
        ob.insert_at_end(9);
        ob.insert_at_end(10);
        ob.display();

        ob.insert_at_beg(11);
        ob.display();

        ob.insert_at_position(100, 3);
        ob.display();

        ob.reverse();
        ob.display();

        ob.delete_at_beg();
        ob.display();

        ob.delete_at_end();
        ob.display();

        ob.delete_at_pos(2);
        ob.display();

        ob.count_nodes();
    }
}