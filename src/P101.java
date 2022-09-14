import entity.TreeNode;

import java.util.Objects;

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class P101 {

    public boolean isSymmetric(TreeNode root) {
        return compareTree(root.left, root.right);
    }

    public boolean compareTree(TreeNode left, TreeNode right) {
        if (Objects.isNull(left) && Objects.isNull(right)) {
            return true;
        }
        if (Objects.isNull(left) || Objects.isNull(right)) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return compareTree(left.left, right.right) && compareTree(left.right, right.left);
    }

}
