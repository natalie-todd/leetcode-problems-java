import AddTwoNumbers.ListNode;
import AddTwoNumbers.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class AddTwoNumbersTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void addTwoNumbers_addsTwoListNodes_intoAThirdListNode() {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        ListNode a1 = new ListNode(7);
        ListNode a2= new ListNode(0);
        ListNode a3 = new ListNode(8);

        l11.next = l12;
        l12.next = l13;

        l21.next = l22;
        l22.next = l23;

        a1.next = a2;
        a2.next = a3;

        solution = new Solution();

        ListNode actual = solution.addTwoNumbers(l11, l21);

        assertThat(actual, equalTo(a1));
    }
}
