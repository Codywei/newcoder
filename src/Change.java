import java.util.*;
/**
 字符串变换（广度优先搜索）

 现有一个字典，同时给定字典中的两个字符串s和t，给定一个变换，每次可以改变字符串中的任意一个字符，请设计一个算法，计算由s变换到t所需的最少步数，同时需要满足在变换过程中的每个串都是字典中的串。

 给定一个string数组dic，同时给定数组大小n，串s和串t，请返回由s到t变换所需的最少步数。若无法变换到t则返回-1。保证字符串长度均小于等于10，且字典中字符串数量小于等于500。

 用邻接表（只有一位不同）做广度优先遍历
 * */
public class Change {
    public int countChanges(String[] dic, int n, String s, String t) {
        if(dic == null || n <= 0 || s.length() != t.length()) {
            return -1;
        }
        if(s.equals(t)) {
            return 0;
        }
        //记录当前字符串被改变的次数
        Map<String,Integer> map = new HashMap<String,Integer>();
        //BFS的队列
        LinkedList<String> queue = new LinkedList<>();
        map.put(s,0);
        queue.add(s);
        while(!queue.isEmpty()){
            String top = queue.removeFirst();
            //获取当前字符串的邻接字符串（只有一位不相同的字符串）
            List<String> adjs =getAdjStr(dic,n,top);
            for (String adj : adjs) {
                //当前变换已经与目的字符串一致
                if (adj.equals(t)) {
                    //因为是邻接的关系，所以需要+1
                    return map.get(top) + 1;
                } else {
                    if (map.get(adj) == null) {
                        //因为是邻接的关系，所以需要+1
                        map.put(adj, map.get(top) + 1);
                        queue.add(adj);
                    }
                }
            }
        }
        return -1;
    }

    public List<String> getAdjStr(String[] dic, int n, String s) {
        //存放邻接字符串
        List<String> adjs = new ArrayList<>();
        String t;
        //记录不同字符的个数
        int count;
        for (int i = 0; i < n; i++) {
            t = dic[i];
            count = 0;
            //长度不一致的不做判断
            if (s.length() != t.length()) {
                continue;
            }
            int j = 0;
            //逐位比较，如果不同位数超过1，直接结束
            for (; j < s.length(); j++) {
                if (s.charAt(j) != t.charAt(j)) {
                    if (count != 0) {
                        break;
                    }
                    count++;
                }
            }
            //判断是否遍历到字符串s的最后一位，或者不是恰好改变了一个字符
            if (j != s.length() || count != 1) {
                continue;
            }
            adjs.add(t);
        }
        return adjs;
    }
}
