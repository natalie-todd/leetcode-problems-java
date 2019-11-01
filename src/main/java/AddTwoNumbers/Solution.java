package AddTwoNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static ListNode l11 = new ListNode(2);
    public static ListNode l12 = new ListNode(4);
    public static ListNode l13 = new ListNode(3);
    public static ListNode l21 = new ListNode(5);
    public static ListNode l22 = new ListNode(6);
    public static ListNode l23 = new ListNode(4);

    public static ListNode createTheNode1() {
        l11.next = l12;
        l12.next = l13;

        return l11;
    }

    public static ListNode createTheNode2() {
        l21.next = l22;
        l22.next = l23;

        return l21;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        Integer total = null;
        ListNode prev = null;
        int tempVal;
        ListNode head = new ListNode(0);

        while (l1 != null || l2 != null) {
            tempVal = carry + l1.val + l2.val;

            carry = tempVal / 10 >= 1 ? 1 : 0;
            total = tempVal / 10 >= 1 ? tempVal - 10 : tempVal;
            ListNode tempNode = new ListNode(total);

            if (head.val == 0) {
                head.val = tempNode.val;
                prev = head;
            } else {
                prev.next = new ListNode(total);
                prev = tempNode;
            }

            tempNode = null;
            l1 = l1.next;
            l2 = l2.next;

        }
        return head;

    }

    public static void main(String args[]) {
        System.out.println(addTwoNumbers(createTheNode1(), createTheNode2()));
    }
}
