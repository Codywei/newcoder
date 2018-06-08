import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 ��λ������

 ���дһ����������һ���ַ�������������򣬽����б�λ�ʺϲ����������ֵ�����С��һ����������ı�λ��ָ�任����ĸ˳�������ɵ��µĴʻ���

 ����"triangle"��"integral"���Ǳ�λ�ʡ�

 ����һ��string������str�������Сint n���뷵������ϲ�������顣��֤�ַ�������С�ڵ���20�������СС�ڵ���300��

 ���ȸ�ÿ����λ������һ�����ֵ��������key�����������ͬ���ֵ���ֵС�ķ���map�У������ͳһ����
 * */
public class SortString {
    public static ArrayList<String> sortStrings(String[] str, int n) {
        ArrayList<String> list=new ArrayList<>();
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<n;i++){

            char []chars =str[i].toCharArray();
            Arrays.sort(chars);

            /**
              ����chars����ʹ��tostring����;
             */
            String key=new String(chars);
            String value=map.get(key);
            if(value==null|| value.compareTo(str[i])>0){
                map.put(key,str[i]);
            }

        }
        list.addAll(map.values());
        Collections.sort(list);
        return list;

    }

    public static  void main(String[]args){
        ArrayList<String> list1=new ArrayList<>();
        String[] str={"ab","ba","abc","cba"};
        list1=sortStrings(str,4);
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

    }
}
