import java.util.*;
/**
 集合栈（栈）

 请实现一种数据结构SetOfStacks，由多个栈组成，其中每个栈的大小为size，当前一个栈填满时，新建一个栈。该数据结构应支持与普通栈相同的push和pop操作。

 给定一个操作序列int[][2] ope(C++为vector&ltvector&ltint>>)，每个操作的第一个数代表操作类型，若为1，则为push操作，后一个数为应push的数字；若为2，则为pop操作，后一个数无意义。

 请返回一个int[][](C++为vector&ltvector&ltint>>)，为完成所有操作后的SetOfStacks，顺序应为从下到上，默认初始的SetOfStacks为空。保证数据合法。

 本体思路分两种情况：入栈和出栈。入栈（未满，直接添加；满，新建，添加）；出栈（大链表为空，报错；大链表未空小链表已空，删除空的小链表，到前一个小链表再出栈；小链表未空，直接出栈）
 * */

public class SetOfStacks {
    public static ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> cur=new ArrayList<Integer>(size);
        list.add(cur);
        for(int i=0;i<ope.length;i++){
            switch(ope[i][0]){
                case 1:
                {
                    if(cur.size()<size){
                        cur.add(ope[i][1]);
                    }
                    else{
                        cur=new ArrayList<Integer>(size);
                        list.add(cur);
                        cur.add(ope[i][1]);
                    }
                }
                break;
                case 2: {
                    try {
                        if (list.size() == 0) {
                            System.out.println("wrong input");

                        }
                        if (cur.size() != 0) {
                            cur.remove(cur.size() - 1);

                        } else {
                            list.remove(list.size() - 1);
                            cur = list.get(list.size() - 1);
                            cur.remove(cur.size() - 1);
                        }
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("已无元素可删");
                    }
                }
                break;
                default:{
                    System.out.println("wrong input");
                }
            }
        }
       return list;
    }
    public static void main(String[]args){
        int ope[][]={{1,100},{1,3},{1,4},{1,5},{1,6},{2,100}};
        int size=5;
        ArrayList<ArrayList<Integer>> list=setOfStacks(ope,size);
        ArrayList<Integer> now=new ArrayList<Integer>(size);
        for(int i=0;i<list.size();i++){
            now=list.get(i);
            for(int j=0;j<now.size();j++){
                System.out.println(now.get(j));
            }
        }

    }

}
