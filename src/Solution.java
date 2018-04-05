/**
 * 链表中的倒数第k个节点
 *
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * 思路：两个指针，先让第一个指针和第二个指针都指向头结点，然后再让第一个指正走(k-1)步，到达第k个节点。然后两个指针同时往后移动，当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了。
 *  （向第二种写法的同学学习）
 */

public class Solution {
    public static ListNode FindKthToTail1(ListNode head,int k) {
        if(head==null||k<=0){
            return null;
        }
       ListNode head2=head;
        //注意是k-1步而不是k步
        for (int i=1;i<k;i++){
            if(head2.next==null){
                return null;
            }
            head2=head2.next;
        }
        while(head2.next!=null){
            head2=head2.next;
            head=head.next;
        }
        return head;
    }


    public static ListNode FindKthToTail2(ListNode head,int k) { //5,{1,2,3,4,5}
        ListNode p, q;
        p = q = head;
        int i = 0;
        for (; p != null; i++) {
            if (i >= k) {
                q = q.next;
            }
                p = p.next;

            }
            return i < k ? null : q;
        }

    public static void main(String[]args){
        ListNode head=new ListNode(1);
        ListNode p1=new ListNode(2);
        ListNode p2=new ListNode(3);
        ListNode p3=new ListNode(4);
        ListNode p4=new ListNode(5);
        head.next=p1;
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        System.out.println(FindKthToTail1(head,1).val);
        System.out.println(FindKthToTail2(head,5).val);

    }
}
