import java.util.HashMap;
/**
 ��Ƶͳ�ƣ���̻�����

 �����һ����Ч�ķ������ҳ�����ָ��������һƪ�����еĳ���Ƶ����

 ����һ��string����article�������Сn��һ����ͳ�Ƶ���word���뷵�ظõ����������еĳ���Ƶ������֤���µĴ���С�ڵ���1000��

 ����һ��hashmap��������г��ֵĴʵĴ�Ƶ��
 * */

public class Frequency {
    public static int getFrequency(String[] article, int n, String word) {
        HashMap <String,Integer>freq=new HashMap();
        for(int i=0;i<n;i++){
           if(!freq.containsKey(article[i])) {
               freq.put(article[i],1);
           }
           else{
               freq.put(article[i],freq.get(article[i])+1);
           }
        }

        return freq.get(word)!=null?freq.get(word):0 ;
    }
    public static void main(String []args){
        String []article={"12","12","23"};
        System.out.println(getFrequency(article,3,"34"));
    }
}
