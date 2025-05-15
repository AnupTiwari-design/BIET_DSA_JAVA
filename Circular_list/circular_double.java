package Circular_list;

class CircularDoublyLinkedList {
    Node head;
    Node tail;

    CircularDoublyLinkedList() {
        head = tail = null;
    }

    void insert_at_end(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            head.next = head;
            head.prev = head;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            newnode.next = head;
            head.prev = newnode;
            tail = newnode;
        }
    }