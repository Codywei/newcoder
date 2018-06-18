/**
����Ƿ�ΪBST������

 ��ʵ��һ�����������һ�ö������Ƿ�Ϊ�����������

 �������ĸ����ָ��TreeNode* root���뷵��һ��bool����������Ƿ�Ϊ�����������

 �����ǵݹ�ʵ�֣���Ҫ����ȷ���ж�������1.���ӽڵ㲻���ڵ�ǰ�ڵ�ֵ 2.���ӽڵ�����ӽڵ�ֵ�����ڵ�ǰ�ڵ�ֵ  3.���ӽڵ�ֵ���ڵ�ǰ�ڵ�ֵ 4.���ӽڵ�����ӽڵ�ֵ�����ڵ�ǰ�ڵ�ֵ
 * */
public class Checker {
    public static boolean checkBST(TreeNode root) {
        if(root==null){
            return true;
        }
      if(root.left!=null) {
          if (root.left.val > root.val) {
              return false;
          }
          //���ӽڵ�����ӽڵ�ֵ���ô��ڸýڵ�ֵ
          if (root.left.right != null && root.left.right.val > root.val) {
              return false;
          }
      }
      if(root.right!=null){
            if (root.right.val < root.val) {
                return false;
            }
            //���ӽڵ�����ӽڵ�ֵ����С�ڸýڵ�ֵ
            if (root.right.left != null && root.right.left.val <root.val) {
                return false;
            }

        }
      return checkBST(root.left)&&checkBST(root.right);
    }
    public static void main(String[]args){
        TreeNode a=new TreeNode(4);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(6);
        TreeNode d=new TreeNode(1);
        TreeNode e=new TreeNode(3);
        TreeNode f=new TreeNode(5);
        TreeNode g=new TreeNode(7);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        System.out.println(checkBST(a));
    }
}
