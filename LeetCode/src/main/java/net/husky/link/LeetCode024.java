package net.husky.link;

/**
 * @author: dingxin.li
 * @date: 2022/9/30 15:41
 * @description: 24. 两两交换链表中的节点
 */
public class LeetCode024 {

    public static void main(String[] args) {

    }

    private static ListNode swapPairs(ListNode head) {

//        ListNode dummy = new ListNode(-1,head);
//        ListNode prev = head.next;
//        ListNode cur = head;
//        ListNode temp = null;
//        while (prev != null) {
//            if (prev.next != null){
//                temp = prev.next;
//                cur.next = temp;
//                prev.next = cur.next;
//                dummy.next = prev;
//                prev = temp.next;
//                cur = temp;
//            }
//        }
//
//        return dummy.next;

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode prev = dummyNode;

        while (prev.next != null && prev.next.next != null) {
            ListNode temp = head.next.next; // 缓存 next
            prev.next = head.next;          // 将 prev 的 next 改为 head 的 next
            head.next.next = head;          // 将 head.next(prev.next) 的next，指向 head
            head.next = temp;               // 将head 的 next 接上缓存的temp
            prev = head;                    // 步进1位
            head = head.next;               // 步进1位
        }
        return dummyNode.next;
    }

}
