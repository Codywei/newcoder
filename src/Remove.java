import java.util.*;
/**
ɾ�����������е�ĳһ�ڵ�

 ʵ��һ���㷨��ɾ�����������м��ĳ����㣬�ٶ���ֻ�ܷ��ʸý�㡣

 ������ɾ���Ľڵ㣬��ִ��ɾ�����������ýڵ�Ϊβ�ڵ㣬����false�����򷵻�true

 ����������˼���ǰѺ�һ���ڵ��ֵ��next������Ҫɾ���Ľڵ㣬Ȼ��ɾ����һ���ڵ㣬���еڶ��ֽⷨ�����ܸ�д�ڵ��е�ֵ��ע����Ŀ�����Ľڵ�ṹ��[�����д����pNode���Ƕ���������ã�����ֱ�Ӹ���������ã�����Ҫ������������е�ֵ]

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
        System.out.println(pNode.val);
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
        p1.next=p3;
        p3.next=p4;
//        removeNode1(p3);
//        while(head!=null){
//            System.out.println(head.val);
//            head =head.next;
//
//        }
        removeNode2(p3);
        while(head!=null){
            System.out.println(head.val);
            head =head.next;

        }



    }
}
