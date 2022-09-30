package net.husky.link;

/**
 * @author: dingxin.li
 * @date: 2022/9/30 15:41
 * @description: 203. 移除链表元素
 */
public class LeetCode203 {

    /**
     * 给你一个链表的头节点 head 和一个整数 val ,请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点
     *
     */
    public static void main(String[] args) {

        ListNode a7 = new ListNode(6,null);
        ListNode a6 = new ListNode(5,a7);
        ListNode a5 = new ListNode(4,a6);
        ListNode a4 = new ListNode(3,a5);
        ListNode a3 = new ListNode(6,a4);
        ListNode a2 = new ListNode(2,a3);
        ListNode a1 = new ListNode(1,a2);
        removeElements(a1,6);
    }

    private static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        // 因为删除可能涉及到头节点，所以设置dummy节点，统一操作
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;

    }

}
