import java.lang.reflect.Array;
import java.util.*;
/**
 猫狗收容所

 有家动物收容所只收留猫和狗，但有特殊的收养规则，收养人有两种收养方式，第一种为直接收养所有动物中最早进入收容所的，第二种为选择收养的动物类型（猫或狗），并收养该种动物中最早进入收容所的。

 给定一个操作序列int[][2] ope(C++中为vector<vector<int>>)代表所有事件。若第一个元素为1，则代表有动物进入收容所，第二个元素为动物的编号，正数代表狗，负数代表猫；

 若第一个元素为2，则代表有人收养动物，第二个元素若为0，则采取第一种收养方式，若为1，则指定收养狗，若为-1则指定收养猫。请按顺序返回收养的序列。

 若出现不合法的操作，即没有可以符合领养要求的动物，则将这次领养操作忽略。

 这个方法里多建了一个动物类来存放序号，也可以把序号再单弄两个队列进行操作
 * */
public class CatDogAsylum {
    public static  ArrayList<Integer> asylum(int[][] ope) {

        class Animal{
            int num = 0;
            int val = 0;
            public Animal(int num,int val){
                this.num = num;
                this.val = val;
            }
        }

            ArrayList<Integer> res = new ArrayList<Integer>();
            //dog
            ArrayList<Animal> queue1 = new ArrayList<Animal>();
            //cat
            ArrayList<Animal> queue2 = new ArrayList<Animal>();
            for(int i=0;i<ope.length;i++){
                if(ope[i][0]==1){
                    if(ope[i][1]>0){
                        queue1.add(new Animal(i,ope[i][1]));
                    }else if(ope[i][1]<0){
                        queue2.add(new Animal(i,ope[i][1]));
                    }
                }else if(ope[i][0]==2){
                    if(ope[i][1]==1&&!queue1.isEmpty()){
                        res.add(queue1.remove(0).val);
                    }else if(ope[i][1]==-1&&!queue2.isEmpty()){
                        res.add(queue2.remove(0).val);
                    }else if(ope[i][1]==0){
                        if(!queue1.isEmpty()&&!queue2.isEmpty()){
                            if(queue1.get(0).num<queue2.get(0).num){
                                res.add(queue1.remove(0).val);
                            }else{
                                res.add(queue2.remove(0).val);
                            }
                        }else if(!queue1.isEmpty()){
                            res.add(queue1.remove(0).val);
                        }else if(!queue2.isEmpty()){
                            res.add(queue2.remove(0).val);
                        }
                    }
                }
            }
            return res;

    }
    public static void main(String[]args){
        int [][]num={{1,1},{1,-1},{2,0},{2,-1}};
        ArrayList<Integer> result=new ArrayList<>();
        result=asylum(num);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}
