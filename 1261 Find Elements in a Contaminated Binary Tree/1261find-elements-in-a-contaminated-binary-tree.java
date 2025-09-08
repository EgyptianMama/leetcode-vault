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
class FindElements {
    HashSet<Integer> set= new HashSet<>();
    public FindElements(TreeNode root) {
        dfs(root,0);
    }

    public void dfs(TreeNode node,int val){
        if(node==null) return;
        node.val= val;
        set.add(val);

        dfs(node.left, 2*val+1);
        dfs(node.right, 2*val+2);

    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */