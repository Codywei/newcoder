/**
 * �����еĵ�����k���ڵ�
 *
 * ����һ����������������е�����k����㡣
 *
 * ˼·������ָ�룬���õ�һ��ָ��͵ڶ���ָ�붼ָ��ͷ��㣬Ȼ�����õ�һ��ָ����(k-1)���������k���ڵ㡣Ȼ������ָ��ͬʱ�����ƶ�������һ����㵽��ĩβ��ʱ�򣬵ڶ����������λ�þ��ǵ�����k���ڵ��ˡ�
 *  ����ڶ���д����ͬѧѧϰ��
 */

public class Solution {
    public static ListNode FindKthToTail1(ListNode head,int k) {
        if(head==null||k<=0){
            return null;
        }
       ListNode head2=head;
        //ע����k-1��������k��
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
