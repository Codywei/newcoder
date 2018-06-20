/**
 最近公共祖先(树)

 有一棵无穷大的满二叉树，其结点按根结点一层一层地从左往右依次编号，根结点编号为1。现在有两个结点a，b。请设计一个算法，求出a和b点的最近公共祖先的编号。

 给定两个int a,b。为给定结点的编号。请返回a和b的最近公共祖先的编号。注意这里结点本身也可认为是其祖先。

 这一道题主要利用二叉树的性质，比较简单，不多作介绍
 * */
public class LCA {
    public static int getLCA(int a, int b) {
        while(a!=b) {
            if (a < b) {
                b = b / 2;
            } else {
                a = a / 2;
            }
        }
        return a;
    }
    public static void main(String[]args){
        int a =12;
        int b=15;
        System.out.println(getLCA(a,b));

    }

}