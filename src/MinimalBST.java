/**
 高度最小的BST

 对于一个元素各不相同且按升序排列的有序序列，请编写一个算法，创建一棵高度最小的二叉查找树。

 给定一个有序序列int[] vals,请返回创建的二叉查找树的高度。

 这题主要考察如何构造二叉查找树，因为树的结构限制和函数返回类型的限制，将构造树和求树高度的两个函数分开实现。
 * */
public class MinimalBST {

    public static int buildMinimalBST(int[] vals) {
       if(vals.length==0||vals==null){
           return 0;
       }
       else{
         return height(build(vals,0,vals.length-1));
       }
    }

    public static TreeNode build(int[]vals,int start,int end){
        if(end < start) {
            return null;
        }
        int mid=(start+end)/2;
        TreeNode tree=new TreeNode(vals[mid]);
        tree.left=build(vals,start,mid-1);
        tree.right=build(vals,mid+1,end);
        return tree;
    }
    public static int height(TreeNode tree){
        int Lheight;
        int Rheight;
        if(tree==null){
            return 0;
        }
        else{
            Lheight=height(tree.left);
            Rheight=height(tree.right);
            return Math.max(Lheight,Rheight)+1;
        }
    }
    public static void main(String []args){
        int vals[]={1,2,3,4,5,6,7,8};
//      TreeNode tree =build(vals,0,vals.length-1);
//      System.out.print(tree.val);
//      System.out.print(tree.right.val);
        System.out.println(buildMinimalBST(vals));

    }

}
