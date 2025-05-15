package BST;

class Node{
    int data;
    Node left,right;
    Node(int item){
        data=item;
        left=right=null;
    }
}

public class BST_EX {
    Node root;
    //insert a node into BST
    Node insert(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        if(key<root.data){
            root.left=insert(root.left,key);

        }
        else if(key>root.data){
            root.right=insert(root.right, key);
        }
        return root;

        }
          boolean search(Node root, int key) {
            if(root==null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            else if(key<root.data){
                return search(root.left,key);
            }
            else{
                return search(root.right, key);
            }
          }
              // Inorder traversal (sorted order)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    Node delete(Node root,int key){
        if(root==null){
            return root;
        }
        if(key<root.data){
            root.left=delete(root.left, key);
        }
        else if (key>root.data) {
            root.right=delete(root.right, key);
            
        }
        else{
            //case 1 :no child
            if(root.left==null&&root.right==null){
                return null;
            }
            //case 2:one cild
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }  
            //case 3 :two child
            Node temp=minvaluenode(root.right);//finding inorder successor
            root.data=temp.data;
            root.right=delete(root.right, key);


        }
        return root;
    }
    Node minvaluenode(Node node){
         Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;


    }
    public static void main(String[] args) {
        BST_EX tree = new BST_EX();
        int[] values = {50, 30, 20, 40, 70, 60, 80};

        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.print("Inorder before deletion: ");
        tree.inorder(tree.root);  // Output: 20 30 40 50 60 70 80
        System.out.println();

        // Search
        System.out.println("Search 40: " + tree.search(tree.root, 40)); // true
        System.out.println("Search 100: " + tree.search(tree.root, 100)); // false

        // Deletion
        tree.root = tree.delete(tree.root, 20); // Case 1: no child
        tree.root = tree.delete(tree.root, 30); // Case 2: one child
        tree.root = tree.delete(tree.root, 50); // Case 3: two children

        System.out.print("Inorder after deletion: ");
        tree.inorder(tree.root);  // Output: 40 60 70 80
    }
}–
    }
    }



    
    

