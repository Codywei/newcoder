import java.util.*;
/**
 ��ϳ��Ӵ�����̻��������ѵĵݹ飩

 ��һ�鵥�ʣ����дһ���������������ҳ����������ַ�����ɵ���Ĵ�A����A��������������ɵ�(���ظ�)��ĵ��ʡ�

 ����һ��string����str��ͬʱ��������Ĵ�Сn���뷵������ʵĳ��ȣ���֤��������������ʴ��ڡ�

 �Ƚ����鰴�ַ����������������õݹ��ж��Ƿ��к��ʵ��Ӵ����ɵ�ǰ�ַ���
 * */
public class LongestString {
    public int getLongest(String[] str, int n) {
        if(n <=  1) {
            return 0;
        }
        //���ճ��ȴӴ�С����
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < n; i++ ) {
            set.add(str[i]);
        }
        for(int i = 0; i < n; i++) {
            if(isOk(str[i], str, 1, set, false)) {
                return str[i].length();
            }
        }
        return 0;


    }

    public boolean isOk(String s, String[] str, int i, HashSet<String> set, boolean isFirst) {
        if(s.length() == 0) {
            return true;
        }
        if(i > s.length()) {
            return false;
        }
        if(i == s.length() && !isFirst) {
            return false;
        }
        String left = s.substring(0, i);
        String right = s.substring(i);
        //���Ƶݹ�ѭ�����ж���i�ָ�õ����Ӵ��Ƿ�������������������ת����i+1Ϊ�ָ��
        return (set.contains(left) && isOk(right, str, 1, set, true)) || isOk(s, str, i + 1, set, isFirst);

    }
    public static void main(String []args){
        String []str={"a","b","c","ab","bc","abc"};
        LongestString ls=new LongestString();
        System.out.println(ls.getLongest(str,6));
    }
}
