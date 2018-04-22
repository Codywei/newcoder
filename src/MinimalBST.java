/**
 �߶���С��BST

 ����һ��Ԫ�ظ�����ͬ�Ұ��������е��������У����дһ���㷨������һ�ø߶���С�Ķ����������

 ����һ����������int[] vals,�뷵�ش����Ķ���������ĸ߶ȡ�

 ������Ҫ������ι���������������Ϊ���Ľṹ���ƺͺ����������͵����ƣ����������������߶ȵ����������ֿ�ʵ�֡�
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
