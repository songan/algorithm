//leetcode submit region begin(Prohibit modification and deletion)
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        process(res, root);
        return res;
    }

    public void process(List<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }

        process(res, root.left);
        res.add(root.val);
        process(res, root.right);
    }

}
//leetcode submit region end(Prohibit modification and deletion)
