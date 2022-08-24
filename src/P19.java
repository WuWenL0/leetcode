import entity.ListNode;

/**
 * 给你一个链表，删除链表的倒数第n个结点，并且返回链表的头结点。
 * <p>
 * <p>
 * 示例 1：
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P19 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node = new ListNode(1, node2);
        ListNode resNode = new P19().removeNthFromEnd(node, 2);
        System.out.println(resNode);
    }

    /**
     * 先后指针
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0,head);
        ListNode before = node,after = node;
        for (int i = 0; i < n; i++) {
            after = after.next;
        }
        while (after.next != null){
            before = before.next;
            after = after.next;
        }
        before.next = before.next.next;
        return node.next;
    }


    /**
     * 笨法，遍历长度后再循环删除
     */
    public ListNode removeNthFromEndNormal(ListNode head, int n) {
        ListNode node = new ListNode(0,head);
        ListNode pre = node;
        int nodeLength = getNodeLength(node);
        for (int i = 0; i < nodeLength - n; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return node.next;
    }

    public int getNodeLength(ListNode head) {
        int length = 0;
        while (head.next != null) {
            ++length;
            head = head.next;
        }
        return length;
    }
}

