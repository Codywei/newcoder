import java.lang.reflect.Array;
import java.util.*;
/**
 è��������

 �мҶ���������ֻ����è�͹��������������������������������������ʽ����һ��Ϊֱ���������ж�������������������ģ��ڶ���Ϊѡ�������Ķ������ͣ�è�򹷣������������ֶ�������������������ġ�

 ����һ����������int[][2] ope(C++��Ϊvector<vector<int>>)���������¼�������һ��Ԫ��Ϊ1��������ж���������������ڶ���Ԫ��Ϊ����ı�ţ�������������������è��

 ����һ��Ԫ��Ϊ2�������������������ڶ���Ԫ����Ϊ0�����ȡ��һ��������ʽ����Ϊ1����ָ������������Ϊ-1��ָ������è���밴˳�򷵻����������С�

 �����ֲ��Ϸ��Ĳ�������û�п��Է�������Ҫ��Ķ������������������ԡ�

 ���������ཨ��һ���������������ţ�Ҳ���԰�����ٵ�Ū�������н��в���
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
