/**
 输出单层节点（树）

 对于一棵二叉树，请设计一个算法，创建含有某一深度上所有结点的链表。

 给定二叉树的根结点指针TreeNode* root，以及链表上结点的深度，请返回一个链表ListNode，代表该深度上所有结点的值，请按树上从左往右的顺序链接，保证深度不超过树的高度，树上结点的值为非负整数且不超过100000。

 用递归的思路，每一次递归，高度减一，直到达到要求的高度
 * */
public class TreeLevel {
    ListNode cur =new ListNode(-1);
    ListNode list=cur;
    public  ListNode getTreeLevel(TreeNode root, int dep) {
         if(root ==null||dep<0){
             return null;
         }
         else if(dep ==1){
             cur.next=new ListNode(root.val);
             cur=cur.next;
         }
         else{
            getTreeLevel(root.left,dep-1);
            getTreeLevel(root.right,dep-1);
         }
         return list.next;

    }
    public static void main(String[]args){
        TreeLevel tree=new TreeLevel();
        ListNode list=new ListNode(-1);
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        a.left=b;
        b.left=c;
        c.right=d;
        c.left=e;
        list=tree.getTreeLevel(a,4);
        while(list!=null){
            System.out.println(list.val);
            list=list.next;
        }



    }

}