import entity.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 141. 环形链表
 * 给定一个链表的头节点 head，返回链表开始入环的第一个节点。如果链表无环，则返回null。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 不允许修改 链表。
 *
 * 示例 1：
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：返回索引为 1 的链表节点
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 * 示例2：
 * 输入：head = [1,2], pos = 0
 * 输出：返回索引为 0 的链表节点
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 * 示例 3：
 * 输入：head = [1], pos = -1
 * 输出：返回 null
 * 解释：链表中没有环。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/linked-list-cycle-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P142 {
    public static void main(String[] args) {
        ListNode node4 = new ListNode(4, null);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node = new ListNode(1, node2);
        node2.next = node;
        ListNode res = new P142().detectCycle(node);
        System.out.println(res);
    }

    /**
     * 快慢指针找环形入口，找到相遇位置
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head, flag1 = head, flag2 = null;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                flag2 = slow;
                while (flag1 != flag2){
                    flag1 = flag1.next;
                    flag2 = flag2.next;
                }
                return flag2;
            }
        }
        return null;
    }

    /**
     * 哈希表
     * 5ms
     */
    public ListNode detectCycleHash(ListNode head) {
        Map<ListNode, String> map = new HashMap<>();
        while (!map.containsKey(head) && head != null){
            map.put(head, null);
            head = head.next;
        }
        return head;
    }
}
