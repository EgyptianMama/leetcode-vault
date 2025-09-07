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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums== null)  return null;
        return maxInsert(nums,0, nums.length-1);
    } 

    public TreeNode maxInsert(int[] nums, int start, int end){
        if(start>end) return null;

        int max= start;

        for(int i=start+1;i<=end;i++){
            if(nums[i]> nums[max]){ max= i;}
        }

        TreeNode root= new  TreeNode(nums[max]);

        root.left= maxInsert(nums, start, max-1);
        root.right= maxInsert(nums, max+1, end);

        return root;
    }
}