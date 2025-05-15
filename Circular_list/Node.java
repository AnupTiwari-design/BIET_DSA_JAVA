package Circular_list;

public class Node {
    int data;
    Node next;
    public Node prev;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class Circular{
    Node head;
    Circular()
    {
        head=null;

    }
    void insert_at_end(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            head.next=head;

        }
        else{
            Node curr=head;
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=newnode;
            newnode.next=head;
        }

    }
        void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
}
