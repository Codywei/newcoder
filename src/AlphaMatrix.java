import java.util.*;
/**
 �����ĸ���󣨱�̻�����

 ��һ�������嵥�������һ����Ч�㷨���������嵥�е�����ɵ�����Ӿ���Ҫ������е��к��ж����嵥�еĵ��ʡ�

 ����һ��string����dic���������嵥��ͬʱ�����嵥�Ĵ�Сn���뷵������Ӿ�����������֤�����嵥�Ĵ�СС�ڵ���50����ĳһ���ȵĴ�������С�ڵ���12��

 ���ʳ��ֵĴ���*���ʳ���(��Ŀ������)
 * */
public class AlphaMatrix {
    public static int findAlphaMatrix(String[] dic, int n) {

        int result = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<dic.length; i++){
            if(!map.containsKey(dic[i])) {
                map.put(dic[i], 1);
            }
            else{
                map.put(dic[i], map.get(dic[i])+1);
            }
        }

        for(int i=0; i<dic.length; i++){
            result = Math.max(result, map.get(dic[i])*dic[i].length());
        }

        return result;
    }
    public static void main(String[]args){
        String []dic={"aba","aba","aba","bb","bb"};
        System.out.println(findAlphaMatrix(dic,5));
    }
}
