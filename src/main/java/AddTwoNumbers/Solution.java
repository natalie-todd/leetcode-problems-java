package AddTwoNumbers;

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
            //zero is put on the head, response, and prev
            if (response == null) {
                head.val = tempNode.val;
                //response == 0
                response = head;
            } else {
                //1 = total value
                //2 = total value
                //3 = total value
                prev.next = new ListNode(total);
                //1 = 0 which has 1 attached
                //1 = 1 with 2
                //1 = 2 with 3
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
