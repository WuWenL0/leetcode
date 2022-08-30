import entity.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你两个单链表的头节点headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 * 图示两个链表在节点 c1 开始相交：
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/intersection-of-two-linked-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P160  {

    public static void main(String[] args) {
        ListNode node6 = new ListNode(5,null);
        ListNode node5 = new ListNode(4,node6);
        ListNode node4 = new ListNode(8,node5);

        ListNode nodeA3 = new ListNode(1, node4);
        ListNode nodeA2 = new ListNode(4, nodeA3);

        ListNode nodeB3 = new ListNode(1, node4);
        ListNode nodeB2 = new ListNode(6, nodeB3);
        ListNode nodeB1 = new ListNode(5, nodeB2);

        ListNode listNode = new P160().getIntersectionNode(nodeA2, nodeB1);
        System.out.println(listNode.val);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode flagA = headA, flagB = headB;
        int lengthA = 0,lengthB = 0;
        while (flagA != null){
            flagA = flagA.next;
            lengthA++;
        }
        while (flagB != null){
            flagB = flagB.next;
            lengthB++;
        }
        flagA = headA;
        flagB = headB;
        if (lengthA > lengthB){
            while (lengthA > lengthB){
                flagA = flagA.next;
                lengthB++;
            }
        }else if (lengthA < lengthB){
            while (lengthA < lengthB){
                flagB = flagB.next;
                lengthA++;
            }
        }
        while (flagA != null){
            if (flagA == flagB){
                return flagA;
            }
            flagA = flagA.next;
            flagB = flagB.next;
        }
        return null;
    }

    public ListNode getIntersectionNodeHash(ListNode headA, ListNode headB) {
        Map<ListNode, String> map = new HashMap<>();
        while (headA != null){
            map.put(headA, null);
            headA = headA.next;
        }
        while (headB != null){
            if (map.containsKey(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
