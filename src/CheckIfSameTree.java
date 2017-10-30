/**
 * TODO: Document this class.
 */
public class CheckIfSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(null == p && null == q){
            return true;
        }

        if((null == p && null != q) || (null == q && null != p)){
            return false;
        }

        if(p.val == q.val){
           return isSameTree(p.left,q.left) ? isSameTree(p.right,q.right) :false;
        } else {
            return false;
        }

    }
}
