/**
 Լɪ������I������

 Լɪ��������һ���ǳ�������Ȥ�⣬����n��������һȦ����˳ʱ����1��ʼ�����Ǳ�š�Ȼ���ɵ�һ���˿�ʼ����������m���˳��֡�������Ҫ��������һ�����ֵ��˵ı�š�

 ��������int n��m��������Ϸ���������뷵�����һ�����ֵ��˵ı�š���֤n��mС�ڵ���1000��

 ����һ����������whileѭ����ͨ��ȡ��ȷ�����ֵ���
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
