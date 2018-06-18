/**
访问单个节点的删除（编程基础、链表）

 实现一个算法，删除单向链表中间的某个结点，假定你只能访问该结点。

 给定带删除的节点，请执行删除操作，若该节点为尾节点，返回false，否则返回true

 这道题的主体思想是把后一个节点的值和next都赋给要删除的节点，然后删除后一个节点，其中第二种解法并不能改写节点中的值

 [方法二中传入的pNode不是对象而是对象的引用，不能直接修改这个引用，而是要修改这个引用所指向对象的值]

 * */
public class Remove {
    public static boolean removeNode1(ListNode pNode) {
        if (pNode.next==null){
            return false;
        }
        pNode.val=pNode.next.val;
        pNode.next=pNode.next.next;
        return true;
    }
    public static boolean removeNode2(ListNode pNode) {
        if (pNode.next==null){
            return false;
        }
        pNode=pNode.next;
//      System.out.println(pNode.val);
        return true;
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
//      removeNode1(p3);
        removeNode2(p3);
        while(head!=null){
            System.out.println(head.val);
            head =head.next;

      }



    }
}
