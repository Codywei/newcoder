/**
 �������к�Ϊĳһֵ��·��

 ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����

 �����������������ߵĵĴ𰸣��Եݹ����ʽ�ҳ�����·�����ܼ�࣬��list.remove(list.size()-1);//��ȱ�����Ҫ���ˣ���һ���������뵽��
 * */

import java.util.ArrayList;

public class Solution3 {
    private ArrayList<Integer> list=new ArrayList<Integer>();
    private ArrayList<ArrayList<Integer>> listall=new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root ==null)
        {
            return listall;
        }
        list.add(root.val);
        target-=root.val;
        if(target==0 && root.left==null && root.right==null){
            listall.add(new ArrayList<Integer>(list));
        }
        if(root.left!=null) {
            FindPath(root.left, target);
        }
        if(root.right!=null) {
            FindPath(root.right, target);
        }
        list.remove(list.size()-1);//��ȱ�����Ҫ����
        return listall;



    }
    public static void main(String[]args){
            Solution3 sol=new Solution3();
            TreeNode a=new TreeNode(1);
            TreeNode b=new TreeNode(1);
            TreeNode c=new TreeNode(1);
            TreeNode d=new TreeNode(1);
            TreeNode e=new TreeNode(1);
            TreeNode f=new TreeNode(1);

            a.left=b;
            b.left=c;
            c.left=d;
            a.right=e;
            e.left=f;
            ArrayList<ArrayList<Integer>> listall=sol.FindPath(a,3 );

            for(int i=0;i<listall.size();i++){
                for(int j=0;j<listall.get(i).size();j++){
                    System.out.print(listall.get(i).get(j));
                }
                System.out.println();
            }

        }
    }

