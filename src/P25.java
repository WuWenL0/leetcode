import entity.ListNode;

import java.util.Stack;

/**
 * 给你链表的头节点 head ，每k个节点一组进行翻转，请你返回修改后的链表。
 *
 * k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是k的整数倍，那么请将最后剩余的节点保持原有顺序。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 *
 * 示例 1：
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[2,1,4,3,5]
 * 示例 2：
 * 输入：head = [1,2,3,4,5], k = 3
 * 输出：[3,2,1,4,5]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/reverse-nodes-in-k-group
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P25 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node = new ListNode(1, node2);
        ListNode resNode = new P25().reverseKGroup(node, 2);
        System.out.println(resNode);
    }

    /**
     * 栈法
     * 执行用时: 4 ms
     * 内存消耗: 41.4 MB
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0, null);
        ListNode node = dummyHead;
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.push(head);
            head = head.next;
            if (stack.size() == k){
                while (stack.size() != 0){
                    node.next = stack.pop();
                    node = node.next;
                }
            }
        }
        if (!stack.isEmpty()){
            for (int i = 0; i < stack.size(); i++) {
                node.next = stack.get(i);
                node = node.next;
            }
            stack.clear();
        }
        node.next = null;
        return dummyHead.next;
    }
}
