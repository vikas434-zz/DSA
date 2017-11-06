/**
 * TODO: Document this class.
 */
public class TestTreeTraversal {

    public static void main (String[] args) {
        TreeNode t1 = new TreeNode(10);
        t1.left = new TreeNode(8);
        t1.right = new TreeNode(7);
        t1.left.left = new TreeNode(6);
        t1.left.right = new TreeNode(5);
        t1.right.left = new TreeNode(4);
        t1.right.right = new TreeNode(3);

        System.out.println("Inorder traversal :: ");
        TreeTraversal.inOrderTraversal(t1);
        System.out.println();
        System.out.println("Preorder traversal :: ");
        TreeTraversal.preOrderTraversal(t1);
        System.out.println();
        System.out.println("Post order traversal");
        TreeTraversal.postOrderTraversal(t1);

    }
}
