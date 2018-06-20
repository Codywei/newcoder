import java.util.ArrayList;
import java.util.Collections;

/**
 �ַ������У��ݹ飩

 ��дһ��������ȷ��ĳ�ַ���������������ϡ�

 ����һ��string A��һ��int n,�����ַ������䳤�ȣ��뷵�����и��ַ����ַ������У���֤�ַ�������С�ڵ���11���ַ������ַ���Ϊ��дӢ���ַ��������е��ַ������ֵ���Ӵ�С����(���ϲ��ظ��ַ���)

 ͨ���ݹ����ʽ�����е�������ϱ�ʾ������ȷ���ݹ���ֹ�������ݹ鵽��������һλ ��
 * */
public class Permutation {
    public ArrayList<String> getPermutation(String A) {
        // write code here
        ArrayList<String> list = new ArrayList<>();
        permutation(list, A.toCharArray(), 0);
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }

    public void permutation(ArrayList<String> list, char[] array, int k) {
        //����Ƿ�ݹ鵽�����һλ
        if(k == array.length) {
            list.add(new String(array));
            return ;
        }
        for(int i = k; i < array.length; i++) {
            // �˴���ʾ��ǰλ�����������ַ�����
            swap(array, i, k);
            //��ǰλ�ĺ�һλ�ظ��뵱ǰλһ���Ĳ������ݹ�ʵ��ÿ��λ�õĽ�����
            permutation(list, array, k + 1);
            //��������λ�û���Ҫ�ٽ�����������������ʵ�ֵݹ飩
            swap(array, i, k);
        }
    }

    /**
     *  ��������
     */
    public void swap(char[] array, int i, int j) {
        if(i != j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    public static void main(String[]args){
        String A="ABC";
        Permutation x=new Permutation();
        ArrayList<String> list=new ArrayList<>();
        list=x.getPermutation(A);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
