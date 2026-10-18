/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }

        if(root == null){
            return false;
        }

        if(aux(root, subRoot)){
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    private boolean aux(TreeNode root, TreeNode subroot){
        if(root == null && subroot == null){
            return true;
        }

        if(root != null && subroot == null){
            return false;
        }

        if(root == null && subroot != null){
            return false;
        }

        if(root.val != subroot.val){
            return false;
        }

        return aux(root.right, subroot.right) && aux(root.left, subroot.left);




    }
}
