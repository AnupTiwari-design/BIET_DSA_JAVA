package Double_Linked_list;
class Main{
    public static void main(String[] args) {
        Double_linked_list ob=new Double_linked_list();
        ob.insert_at_end(10);
        ob.insert_at_end(20);
        ob.insert_at_end(30);
        ob.forward_traversal();
        ob.backward_traversal();
    }
}