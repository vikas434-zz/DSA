import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Document this class.
 */
public class CheckIfSymmetric {
    List<Integer> treeTraversalList = new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
       if(null == root){
           return true;
       }

       return checkMirror(root, root);
    }

    private boolean checkMirror(final TreeNode root, final TreeNode root1) {
        if(null == root && null == root1){
            return true;
        }

        if(null != root && null != root1 && root.val == root1.val){
            if(checkMirror(root.left, root1.right) && checkMirror(root.right , root1.left)){
                return true;
            }
        }

        return false;
    }

}
