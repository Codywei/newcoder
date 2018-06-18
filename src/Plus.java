/**
 ��ʽA+B����̻���������

 �������������ʾ��������ÿ��������һ����λ����Щ��λ�Ƿ����ŵģ�Ҳ���Ǹ�λ����������ײ�����д������������������ͣ�����������ʽ���ؽ����

 ������������ListNode* A��ListNode* B���뷵��A+B�Ľ��(ListNode*)��

 ��Ҫ��Ҫ���ǽ�λ����������������ȵ����⣬�ڶ��ֽⷨ˼·���ƣ����Ǵ���������ֵ࣬��ѧϰ
 **/

public class Plus {
    public static ListNode plusAB1(ListNode a, ListNode b) {
        ListNode d=new ListNode(-1);
        ListNode e=d;
       int sum=0;
       int c=0;
       while(a!=null&&b!=null){
           sum=a.val+b.val+c;
           if(sum>=10){
               d.next=new ListNode(sum%10);
               c=1;
           }
           else{
               d.next=new ListNode(sum);
               c=0;
           }
           a=a.next;
           b=b.next;
           d=d.next;
       }
       if((a!=null)&&(b==null)){
           while(a!=null){
              sum=a.val+c;
               if(sum>=10){
                   d.next=new ListNode(sum%10);
                   c=1;
               }
               else{
                   d.next=new ListNode(sum);
                   c=0;
               }
               a=a.next;
               d=d.next;
           }
       }
        if((b!=null)&&(a==null)){
            while(b!=null){
                sum=b.val+c;
                if(sum>=10){
                    d.next=new ListNode(sum%10);
                    c=1;
                }
                else{
                    d.next=new ListNode(sum);
                    c=0;
                }
                b=b.next;
                d=d.next;
            }
        }
        if(c==1){
            d.next=new ListNode(c);
        }
        return e.next;
    }


    public static ListNode plusAB2(ListNode a, ListNode b)
    {
        ListNode p=new ListNode(-1);
        ListNode q=p;
        int carry=0;
        while(a!=null||b!=null||carry!=0)
        {
            int aval=a!=null?a.val:0;
            int bval=b!=null?b.val:0;
            int sum=aval+bval+carry;
            carry=sum/10;
            int k=sum%10;
            q.next=new ListNode(k);
            q=q.next;
            a=a!=null?a.next:null;
            b=b!=null?b.next:null;
        }
        return p.next;
    }

    public static void main(String[]args){
        ListNode a=new ListNode(9);
        ListNode e=new ListNode(9);
        ListNode d=new ListNode(9);
        ListNode b=new ListNode(1);

       a.next=e;
       e.next=d;
        ListNode newnode=plusAB1(a,b);
//        ListNode newnode=plusAB2(a,b);
        while(newnode!=null){
            System.out.println(newnode.val);
            newnode=newnode.next;
        }


    }
}
