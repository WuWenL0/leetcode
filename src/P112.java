import entity.TreeNode;

import java.util.Objects;

/**
 * 给你二叉树的根节点root 和一个表示目标和的整数targetSum 。判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和targetSum 。如果存在，返回 true ；否则，返回 false 。
 * 叶子节点 是指没有子节点的节点。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return getPathSum(root, targetSum, 0);
    }

    private boolean getPathSum(TreeNode root, int targetSum, int num) {
        if (Objects.isNull(root)) {
            return false;
        }
        if (Objects.isNull(root.left) && Objects.isNull(root.right)) {
            return num + root.val == targetSum;
        }
        return getPathSum(root.left, targetSum, num + root.val) || getPathSum(root.right, targetSum, num + root.val);
    }
}
