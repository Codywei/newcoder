/**
 �������ڵ㣨����

 ����һ�ö������������һ���㷨����������ĳһ��������н�������

 �����������ĸ����ָ��TreeNode* root���Լ������Ͻ�����ȣ��뷵��һ������ListNode���������������н���ֵ���밴���ϴ������ҵ�˳�����ӣ���֤��Ȳ��������ĸ߶ȣ����Ͻ���ֵΪ�Ǹ������Ҳ�����100000��

 �õݹ��˼·��ÿһ�εݹ飬�߶ȼ�һ��ֱ���ﵽҪ��ĸ߶�
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