/**
 * TODO: Document this class.
 */
public class TreeTraversal {

    public static void inOrderTraversal(TreeNode root){
        if(null != root){
            System.out.println(root.val);
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
        }

    }

    public static void preOrderTraversal(TreeNode root) {
        if(null != root){
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
            System.out.println(root.val);
        }
    }

    public static void postOrderTraversal(TreeNode root){
        if(null != root){
            System.out.println(root.val);
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
        }
    }
}
