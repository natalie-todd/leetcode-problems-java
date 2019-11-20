package addTwoNumbers;

public class Solution {
    public ListNode lastNext(ListNode response) {
        if (response.next == null) {
            return response;
        } else {
            return lastNext(response.next);
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        Integer total = null;
        ListNode prev = null;
        int tempVal;
        ListNode response = null;

        while (carry != 0 || l1 != null || l2 != null) {

            if (l1 != null && l2 != null) {
                tempVal = carry + l1.val + l2.val;

            } else if (l1 == null && l2 != null) {
                    tempVal = carry + l2.val;

            } else if (l1 != null && l2 == null) {
                tempVal = carry + l1.val;

            } else {
                tempVal = carry;
            }

            carry = tempVal / 10 >= 1 ? 1 : 0;
            total = tempVal / 10 >= 1 ? tempVal - 10 : tempVal;
            ListNode tempNode = new ListNode(total);

            if (response == null) {
                response = tempNode;
            } else {
                lastNext(response).next = tempNode;
            }

            prev = tempNode;
            tempNode = null;

            if (l1 != null || l2 != null) {
                l1 = (l1 != null ? l1.next : null);
                l2 = (l2 != null ? l2.next : null);
            }
        }
        return response;
    }
}
