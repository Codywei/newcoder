import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/**
 ����·�����

 ����һ������ͼ����ʵ��һ���㷨���ҳ�����֮���Ƿ����һ��·����

 ����ͼ�е���������ָ��UndirectedGraphNode* a,UndirectedGraphNode* b(�벻Ҫ�����������ͣ�ͼ������ͼ),�뷵��һ��bool����������֮���Ƿ����һ��·��(a��b��b��a)��

 ����ͼ�Ľṹ���ɴ��ھӽڵ����֣��������д���ھӣ�hashset��ű������Ľڵ㣨�������������
 * */
public class Path {
    public static boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
          if(a==b){
              return true;
          }
          else{
              return helper(a,b)||helper(b,a);
          }
    }
    public static boolean helper(UndirectedGraphNode a,UndirectedGraphNode b){
         Queue<UndirectedGraphNode> queue=new LinkedList<UndirectedGraphNode>();
         HashSet<UndirectedGraphNode> hashset=new HashSet<UndirectedGraphNode>();
         UndirectedGraphNode temp=null;
         queue.add(a);
         hashset.add(a);
         while(!queue.isEmpty()){
             temp=queue.poll();
             Iterator<UndirectedGraphNode> it =temp.neighbors.iterator();
             while(it.hasNext()){
                 temp=it.next();
                 if(b==temp){
                     return true;
                 }
                 else{
                     if(!hashset.contains(temp)) {
                         queue.add(temp);
                         hashset.add(temp);
                     }
                 }
             }
         }
         return false;
    }
    public static void main(String[]args){
        UndirectedGraphNode a=new UndirectedGraphNode(0);
        UndirectedGraphNode c=new UndirectedGraphNode(1);
        UndirectedGraphNode d=new UndirectedGraphNode(2);
        UndirectedGraphNode b=new UndirectedGraphNode(3);
        a.neighbors.add(c);
        c.neighbors.add(d);
        d.neighbors.add(a);
//      d.neighbors.add(b);

        System.out.println(checkPath(a,b));
    }
}
