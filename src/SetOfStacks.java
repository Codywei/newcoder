import java.util.*;
/**
 ����ջ��ջ��

 ��ʵ��һ�����ݽṹSetOfStacks���ɶ��ջ��ɣ�����ÿ��ջ�Ĵ�СΪsize����ǰһ��ջ����ʱ���½�һ��ջ�������ݽṹӦ֧������ͨջ��ͬ��push��pop������

 ����һ����������int[][2] ope(C++Ϊvector&ltvector&ltint>>)��ÿ�������ĵ�һ��������������ͣ���Ϊ1����Ϊpush��������һ����ΪӦpush�����֣���Ϊ2����Ϊpop��������һ���������塣

 �뷵��һ��int[][](C++Ϊvector&ltvector&ltint>>)��Ϊ������в������SetOfStacks��˳��ӦΪ���µ��ϣ�Ĭ�ϳ�ʼ��SetOfStacksΪ�ա���֤���ݺϷ���

 ����˼·�������������ջ�ͳ�ջ����ջ��δ����ֱ����ӣ������½�����ӣ�����ջ��������Ϊ�գ�����������δ��С�����ѿգ�ɾ���յ�С������ǰһ��С�����ٳ�ջ��С����δ�գ�ֱ�ӳ�ջ��
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
                        System.out.println("����Ԫ�ؿ�ɾ");
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
