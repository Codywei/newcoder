/**
 ��ת������̻�����

 ��һ�����ƽ������ݽṹTreeNode��������val���Ժ�ָ����������ָ�롣�����������ʾ���������(����leftָ���ʾ����ӣ�rightָ���ʾ�Ҷ���)�����дһ�������������������ת��Ϊһ���������ж�������������ݽṹ��TreeNodeʵ�֣���������ݽṹ��ListNodeʵ�֡�

 ��������������ĸ����ָ��root���뷵��ת���ɵ������ͷָ�롣
 * */

public class Converter {
    public ListNode head=new ListNode(-1);
    public ListNode q=head;
    public  ListNode treeToList(TreeNode root) {
        if(root!=null){
            treeToList(root.left);
            q.next=new ListNode(root.val);
            q=q.next;
            treeToList(root.right);
        }
        return head.next;
    }
    public static void main(String[]args){

        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        Converter converter=new Converter();
         ListNode list =converter.treeToList(a);
        while(list!=null){
            System.out.println(list.val);
            list=list.next;
        }

    }

}
