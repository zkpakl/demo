package com.example.demo.algorithm_test.test20210329;

import com.example.demo.algorithm_test.ListNode;

/**
 * 判断给定的链表中是否有环。如果有环则返回true，否则返回false。
 */

public class Solution01 {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        //仅用判断fast，因为fast快，无环一定比slow先为null
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
