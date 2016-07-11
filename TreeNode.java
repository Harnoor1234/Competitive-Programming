package treenode;

/**
 *
 * @author Harnoor
 */
public class TreeNode {

    
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    public static void main(String[] args) {
        
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
        return true;
        else
         return symmetric(root.left, root.right);
}
    public boolean symmetric(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left==null || right == null){
            return false;
        }
        if (left.val != right.val)
            return false;
        
        if (!symmetric(left.left, right.right))
            return false;
        
        if (!symmetric(left.right, right.right))
            return false;
        return true;
    }
}
