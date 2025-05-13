package Double_Linked_list;

public class Double_linked_list {
    Node head;
    Node tail;
    Double_linked_list(){
        head=tail=null;
    }
    void insert_at_end(int data){
        Node newnode=new Node(data);
        if (head == null) {
            head = tail = newnode;
        }
        else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        } 
    }
    void forward_traversal(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
        System.out.print("null");
    }
        void backward_traversal(){
        Node curr=tail;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.prev;
        }
        System.out.print("null");
    }
    
}
