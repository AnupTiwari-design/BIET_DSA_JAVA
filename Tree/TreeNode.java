package Tree;

public class TreeNode {
    int data;
    TreeNode left,right;
    TreeNode(int value){
        data=value;
        left=right=null;
    }
    
}
class BinaryTree {
    TreeNode root;

    // In-order Traversal: Left -> Root -> Right
    void inorder(TreeNode node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new TreeNode(10);
        tree.root.left=new TreeNode(11);
        tree.root.right=new TreeNode(14);

    }
}
