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
    public int goodNodes(TreeNode root) {
        int maxSoFar = root.val;
        return helper(root,maxSoFar);
        
    }
    private int helper(TreeNode node, int maxSoFar){
        if (node == null) return 0;
        int curr = node.val;
        int count =0;
        if(curr>=maxSoFar){
            maxSoFar = curr;
            count=1;
        }
        int leftCount = helper(node.left,maxSoFar);
        int rightCount = helper(node.right,maxSoFar);

        return count + leftCount+rightCount;
    }
}
