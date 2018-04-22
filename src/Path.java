import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/**
 有向路径检查

 对于一个有向图，请实现一个算法，找出两点之间是否存在一条路径。

 给定图中的两个结点的指针UndirectedGraphNode* a,UndirectedGraphNode* b(请不要在意数据类型，图是有向图),请返回一个bool，代表两点之间是否存在一条路径(a到b或b到a)。

 根据图的结构，可从邻居节点入手，构建队列存放邻居，hashset存放遍历过的节点（广度优先搜索）
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
