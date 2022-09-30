package net.husky.link;

/**
 * @author: dingxin.li
 * @date: 2022/9/27 16:45
 * @description: 链表节点
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
