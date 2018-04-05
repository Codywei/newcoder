import java.util.*;
/**
 ��д���룬�Ը���ֵxΪ��׼������ָ�������֣�����С��x�Ľ�����ڴ��ڻ����x�Ľ��֮ǰ

 ����һ�������ͷָ�� ListNode* pHead���뷵���������к�������ͷָ�롣ע�⣺�ָ��Ժ󱣳�ԭ��������˳�򲻱䡣

 ��һ������˼·��Ҫע��ڵ�ĸ��ƣ�һ�������ߣ�һ������
 * */
public class Partition {
    public static  ListNode partition(ListNode pHead, int x) {
        ListNode cur=pHead;
        ListNode small1 =new ListNode(-1);
        ListNode big1 =new ListNode(-1);
        ListNode small2 =small1;
        ListNode big2 = big1;
        if (pHead == null) {
            return null;
        }
        while (pHead != null) {

            if (pHead.val < x) {
                small1.next =new ListNode(pHead.val);
                small1=small1.next;

            } else {
                big1.next =new ListNode(pHead.val);
                big1=big1.next;

            }
            pHead = pHead.next;
        }

            small1.next=big2.next;

        return small2.next;
    }

    public static void main(String[]args){
        ListNode head=new ListNode(5);
        ListNode p1=new ListNode(2);
        ListNode p2=new ListNode(3);
        ListNode p3=new ListNode(3);
        ListNode p4=new ListNode(3);
        head.next=p1;
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        ListNode newnode= partition(head,3);
        while(newnode!=null){
            System.out.println(newnode.val);
            newnode=newnode.next;
        }


    }



}





