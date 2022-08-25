import entity.ListNode;

/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 *
 * 示例 1：
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 *
 * 示例 2：
 * 输入：head = []
 * 输出：[]
 *
 * 示例 3：
 * 输入：head = [1]
 * 输出：[1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/swap-nodes-in-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P24 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node = new ListNode(1, node2);
        ListNode resNode = new P24().swapPairs(node);
        System.out.println(resNode);
    }

    /**
     * 迭代
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode node = new ListNode(0,head);
        ListNode temp = node;
        while(temp.next != null && temp.next.next!=null){
            ListNode node1 = temp.next, node2 = node1.next;
            node1.next = node2.next;
            node2.next = node1;
            temp.next = node2;
            temp = node1;
        }
        return node.next;
    }
}
