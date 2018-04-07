import java.util.*;
/**
 ��������

 ���дһ����������������Ƿ�Ϊ���ġ�

 ����һ������ListNode* pHead���뷵��һ��bool�����������Ƿ�Ϊ���ġ�

 ��һ�ֽⷨ�Ƚ�ֱ�ۣ�����stringbuffer�������ֵ�������ٶԱȣ��ڶ��ֽⷨ�õ���ջ�Ϳ���ָ���˼�롣
 * */
public class Palindrome {

    public static boolean isPalindrome1(ListNode pHead) {
        StringBuffer s = new StringBuffer();
        while (pHead != null) {
            s.append(pHead.val);
            pHead = pHead.next;
        }

        if (s.toString().equals(s.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPalindrome2(ListNode pHead) {
        ListNode fast = pHead;
        ListNode slow = pHead;
        Stack<Integer> stack = new Stack<>();
/**
* �������ǰ�벿��Ԫ��װ��ջ�У�������runner
*���ƶ����ٶ�������runner��������
 ��������β��ʱ��������runner�Ѿ����������м�λ��
*/
        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        //������Ϊ������ʱ�������м�Ԫ��
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            if (stack.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(3);
        ListNode p3 = new ListNode(2);
        ListNode p4 = new ListNode(1);
        head.next = p1;
        p1.next = p2;
        p1.next = p3;
        p3.next = p4;
        System.out.println(isPalindrome1(head));
        System.out.println(isPalindrome2(head));


    }
}
