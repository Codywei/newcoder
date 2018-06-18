/**
 Ѱ����һ���ڵ㣨����

 �����һ���㷨��Ѱ�Ҷ�������ָ��������һ����㣨����������ĺ�̣���

 �������ĸ����ָ��TreeNode* root�ͽ���ֵint p���뷵��ֵΪp�Ľ��ĺ�̽���ֵ����֤����ֵ���ڵ�����С�ڵ���100000��û���ظ�ֵ���������ں�̷���-1��

 �ȹ���һ����������ĵݹ麯����������˳��Ԫ�ط���list�У������������������ˡ�
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

