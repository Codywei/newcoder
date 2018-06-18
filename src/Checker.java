/**
检查是否为BST（树）

 请实现一个函数，检查一棵二叉树是否为二叉查找树。

 给定树的根结点指针TreeNode* root，请返回一个bool，代表该树是否为二叉查找树。

 依旧是递归实现，主要的是确定判断条件。1.左子节点不大于当前节点值 2.左子节点的右子节点值不大于当前节点值  3.右子节点值大于当前节点值 4.右子节点的左子节点值不大于当前节点值
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
          //左子节点的右子节点值不得大于该节点值
          if (root.left.right != null && root.left.right.val > root.val) {
              return false;
          }
      }
      if(root.right!=null){
            if (root.right.val < root.val) {
                return false;
            }
            //右子节点的左子节点值不得小于该节点值
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
