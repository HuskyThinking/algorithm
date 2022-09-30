package net.husky.link;

/**
 * @author: dingxin.li
 * @date: 2022/9/30 15:40
 * @description: 206. 反转链表
 */
public class LeetCode206 {

    public static void main(String[] args) {

    }

    /**
     * 双指针法
     * @param head
     * @return
     */
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null){
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }

}
