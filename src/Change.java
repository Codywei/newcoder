import java.util.*;
/**
 �ַ����任���������������

 ����һ���ֵ䣬ͬʱ�����ֵ��е������ַ���s��t������һ���任��ÿ�ο��Ըı��ַ����е�����һ���ַ��������һ���㷨��������s�任��t��������ٲ�����ͬʱ��Ҫ�����ڱ任�����е�ÿ���������ֵ��еĴ���

 ����һ��string����dic��ͬʱ���������Сn����s�ʹ�t���뷵����s��t�任��������ٲ��������޷��任��t�򷵻�-1����֤�ַ������Ⱦ�С�ڵ���10�����ֵ����ַ�������С�ڵ���500��

 ���ڽӱ�ֻ��һλ��ͬ����������ȱ���
 * */
public class Change {
    public int countChanges(String[] dic, int n, String s, String t) {
        if(dic == null || n <= 0 || s.length() != t.length()) {
            return -1;
        }
        if(s.equals(t)) {
            return 0;
        }
        //��¼��ǰ�ַ������ı�Ĵ���
        Map<String,Integer> map = new HashMap<String,Integer>();
        //BFS�Ķ���
        LinkedList<String> queue = new LinkedList<>();
        map.put(s,0);
        queue.add(s);
        while(!queue.isEmpty()){
            String top = queue.removeFirst();
            //��ȡ��ǰ�ַ������ڽ��ַ�����ֻ��һλ����ͬ���ַ�����
            List<String> adjs =getAdjStr(dic,n,top);
            for (String adj : adjs) {
                //��ǰ�任�Ѿ���Ŀ���ַ���һ��
                if (adj.equals(t)) {
                    //��Ϊ���ڽӵĹ�ϵ��������Ҫ+1
                    return map.get(top) + 1;
                } else {
                    if (map.get(adj) == null) {
                        //��Ϊ���ڽӵĹ�ϵ��������Ҫ+1
                        map.put(adj, map.get(top) + 1);
                        queue.add(adj);
                    }
                }
            }
        }
        return -1;
    }

    public List<String> getAdjStr(String[] dic, int n, String s) {
        //����ڽ��ַ���
        List<String> adjs = new ArrayList<>();
        String t;
        //��¼��ͬ�ַ��ĸ���
        int count;
        for (int i = 0; i < n; i++) {
            t = dic[i];
            count = 0;
            //���Ȳ�һ�µĲ����ж�
            if (s.length() != t.length()) {
                continue;
            }
            int j = 0;
            //��λ�Ƚϣ������ͬλ������1��ֱ�ӽ���
            for (; j < s.length(); j++) {
                if (s.charAt(j) != t.charAt(j)) {
                    if (count != 0) {
                        break;
                    }
                    count++;
                }
            }
            //�ж��Ƿ�������ַ���s�����һλ�����߲���ǡ�øı���һ���ַ�
            if (j != s.length() || count != 1) {
                continue;
            }
            adjs.add(t);
        }
        return adjs;
    }
}
