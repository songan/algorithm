
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

    private void process(List<Integer> result, TreeNode root) {
        if (root == null) {
            return;
        }

        process(result, root.left);
        result.add(root.val);
        process(result, root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
