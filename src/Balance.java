import static java.lang.Math.abs;
import static java.lang.Math.max;
/**
 二叉树平衡检查（树）

 实现一个函数，检查二叉树是否平衡，平衡的定义如下，对于树中的任意一个结点，其两颗子树的高度差不超过1。

 给定指向树根结点的指针TreeNode* root，请返回一个bool，代表这棵树是否平衡。

 以递归的方式求各个节点的深度，再以递归的方式求左右节点是否平衡
 * */
public class Balance {
    public static boolean isBalance(TreeNode root) {
      if(root==null){
          return true;
      }
      else if(abs(deepth(root.left)-deepth(root.right))>1){
          return false;
      }
      else {
          return isBalance(root.left)&&isBalance(root.right);

      }
    }
    public static int deepth(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            return max(deepth(root.left),deepth(root.right))+1;
        }
    }
    public static void main(String[]args){
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(1);
        TreeNode c=new TreeNode(1);
        TreeNode d=new TreeNode(1);
        TreeNode e=new TreeNode(1);

        a.left=b;
        b.left=c;
        c.left=d;
        a.right=e;
        System.out.println(isBalance(a));
    }
}
