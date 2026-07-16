class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) { return true; }
        if (root == null) { return false; }
        
        if (aux(root, subRoot)) {
            return true;
        }
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot); 
    }
    
    private boolean aux(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root != null && subRoot != null && root.val == subRoot.val) {
            return aux(root.left, subRoot.left) && aux(root.right, subRoot.right);
        }
        return false;
    }
}