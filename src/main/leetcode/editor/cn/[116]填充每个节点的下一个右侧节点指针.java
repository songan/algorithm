
//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        process(root.left, root.right);
        return root;
    }

    private void process(Node o1, Node o2) {
        if (o1 == null || o2 == null) {
            return;
        }

        o1.next = o2;
        process(o1.left, o1.right);
        process(o2.left, o2.right);
        process(o1.right, o2.left);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
