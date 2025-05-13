package Double_Linked_list;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        next=prev=null;
    }
}