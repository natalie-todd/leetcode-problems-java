import addTwoNumbers.ListNode;
import addTwoNumbers.Solution;
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

        assertThat(actual.val, equalTo(a1.val));
        assertThat(actual.next.val, equalTo(a1.next.val));
        assertThat(actual.next.next.val, equalTo(a1.next.next.val));
    }

    @Test
    public void addTwoLargerNumbers_addsTwoListNodes_intoAThirdListNode() {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        ListNode l14 = new ListNode(2);
        ListNode l15 = new ListNode(4);

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        ListNode l24 = new ListNode(5);
        ListNode l25 = new ListNode(6);

        ListNode a1 = new ListNode(7);
        ListNode a2= new ListNode(0);
        ListNode a3 = new ListNode(8);
        ListNode a4 = new ListNode(7);
        ListNode a5 = new ListNode(0);
        ListNode a6 = new ListNode(1);

        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        l14.next = l15;

        l21.next = l22;
        l22.next = l23;
        l23.next = l24;
        l24.next = l25;

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;

        solution = new Solution();

        ListNode actual = solution.addTwoNumbers(l11, l21);

        assertThat(actual.val, equalTo(a1.val));
        assertThat(actual.next.val, equalTo(a1.next.val));
        assertThat(actual.next.next.val, equalTo(a1.next.next.val));
    }

    @Test
    public void addTwoNumbers_respectsCarryValue() {
        ListNode l11 = new ListNode(5);
        ListNode a1 = new ListNode(0);
        ListNode a2 = new ListNode(1);

        a1.next = a2;

        solution = new Solution();

        ListNode actual = solution.addTwoNumbers(l11, l11);

        assertThat(actual.val, equalTo(a1.val));
        assertThat(actual.next.val, equalTo(a1.next.val));
    }

    @Test
    public void addTwoNumbers_doesNotThrowNullPointerException() {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(8);

        ListNode l13 = new ListNode(0);

        l11.next = l12;

        solution = new Solution();

        ListNode actual = solution.addTwoNumbers(l11, l13);

        assertThat(actual.val, equalTo(l11.val));
        assertThat(actual.next.val, equalTo(l11.next.val));
    }
}
