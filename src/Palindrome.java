import java.util.*;
/**
 回文链表

 请编写一个函数，检查链表是否为回文。

 给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。

 第一种解法比较直观，先用stringbuffer将链表的值存起来再对比，第二种解法用到了栈和快慢指针的思想。
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
* 将链表的前半部分元素装入栈中，当快速runner
*（移动的速度是慢速runner的两倍）
 到底链表尾部时，则慢速runner已经处于链表中间位置
*/
        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        //当链表为奇数个时，跳过中间元素
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
