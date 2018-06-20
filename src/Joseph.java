/**
 约瑟夫问题I（链表）

 约瑟夫问题是一个非常著名的趣题，即由n个人坐成一圈，按顺时针由1开始给他们编号。然后由第一个人开始报数，数到m的人出局。现在需要求的是最后一个出局的人的编号。

 给定两个int n和m，代表游戏的人数。请返回最后一个出局的人的编号。保证n和m小于等于1000。

 设置一个链表，建立while循环，通过取余确定出局的人
 * */
import java.util.LinkedList;

public class Joseph {
    public static int getResult(int n, int m) {
         LinkedList<Integer>list=new LinkedList<Integer>();
         for(int i=1;i<=n;i++){
               list.add(i);
         }
         int bt=0;
        while(list.size()>1){
            int delpos=(bt+m-1)%list.size();
            list.remove(delpos);
            bt=delpos;
        }
        return list.get(0);
    }
    public static void main(String[]args){
        System.out.println(getResult(5,3));
    }
}
