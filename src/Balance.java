import static java.lang.Math.abs;
import static java.lang.Math.max;
/**
 ������ƽ���飨����

 ʵ��һ�����������������Ƿ�ƽ�⣬ƽ��Ķ������£��������е�����һ����㣬�����������ĸ߶Ȳ����1��

 ����ָ����������ָ��TreeNode* root���뷵��һ��bool������������Ƿ�ƽ�⡣

 �Եݹ�ķ�ʽ������ڵ����ȣ����Եݹ�ķ�ʽ�����ҽڵ��Ƿ�ƽ��
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
