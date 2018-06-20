/**
 树转链表（编程基础）

 有一个类似结点的数据结构TreeNode，包含了val属性和指向其它结点的指针。其可以用来表示二叉查找树(其中left指针表示左儿子，right指针表示右儿子)。请编写一个方法，将二叉查找树转换为一个链表，其中二叉查找树的数据结构用TreeNode实现，链表的数据结构用ListNode实现。

 给定二叉查找树的根结点指针root，请返回转换成的链表的头指针。
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
