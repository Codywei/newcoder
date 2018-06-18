/**
 寻找下一个节点（树）

 请设计一个算法，寻找二叉树中指定结点的下一个结点（即中序遍历的后继）。

 给定树的根结点指针TreeNode* root和结点的值int p，请返回值为p的结点的后继结点的值。保证结点的值大于等于零小于等于100000且没有重复值，若不存在后继返回-1。

 先构建一个中序遍历的递归函数，按遍历顺序将元素放入list中，接下来操作就容易了。
 * */
import java.util.ArrayList;

public class Successor {
    ArrayList<TreeNode> list=new ArrayList<TreeNode>();
    public int findSucc(TreeNode root, int p) {
        find(root);
        for(int i=0;i<list.size();i++){
            if(p==list.get(i).val){
                return list.get(i+1).val;
            }
        }
        return -1;


    }
    public void find(TreeNode root){
        if(root!=null){
            find(root.left);
            list.add(root);
            find(root.right);
        }
    }
    public static void main(String[]args){
        Successor su=new Successor();
        TreeLevel tree=new TreeLevel();

        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        a.left=b;
        b.left=c;
        c.right=d;
        c.left=e;
        System.out.println(su.findSucc(a,2));




    }

}

