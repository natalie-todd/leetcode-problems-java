package AddTwoNumbers;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        Integer total = null;
        ListNode prev = null;
        int tempVal;
        ListNode head = new ListNode(0);
        ListNode response = null;

        while (carry != 0 || l1 != null || l2 != null) {
            if(l1 != null || l2 != null) {
                tempVal = carry + l1.val + l2.val;
            } else {
                tempVal = carry;
            }

            carry = tempVal / 10 >= 1 ? 1 : 0;
            total = tempVal / 10 >= 1 ? tempVal - 10 : tempVal;
            ListNode tempNode = new ListNode(total);

            if (response == null) {
                head.val = tempNode.val;
                response = head;
            } else {
                prev.next = tempNode;
                response.next = prev;
            }

            prev = tempNode;
            tempNode = null;
            if(l1 != null || l2 != null) {
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        return response;

    }
}
