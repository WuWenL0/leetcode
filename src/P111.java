import entity.TreeNode;

import java.util.Objects;

/**
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明：叶子节点是指没有子节点的节点。
 */
public class P111 {
    public int minDepth(TreeNode root) {
        if (Objects.isNull(root)) {
            return 0;
        }
        if (Objects.isNull(root.left) && Objects.isNull(root.right)) {
            return 1;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (Objects.isNull(root.left) || Objects.isNull(root.right)) {
            return left + right + 1;
        }
        return Math.min(left, right) + 1;
    }
}
