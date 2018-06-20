import java.util.ArrayList;
/**
 单词最近距离（编程基础）

 有一篇文章内含多个单词，现给定两个单词，请设计一个高效算法，找出文中这两个单词的最短距离(即最少相隔的单词数,也就是两个单词在文章中位置的差的绝对值)。

 给定一个string数组article，代表所给文章，同时给定文章的单词数n和待查找的两个单词x和y。请返回两个单词的最短距离。保证两个单词均在文中出现且不相同，同时保证文章单词数小于等于1000。

 方法一用数组链表记录两个单词出现的位置，再用双重遍历选出距离最短的值；方法二依序记录下两个单词出现位置时的距离，取最小值。
 * */
public class Distance {
    public static int getDistance(String[] article, int n, String x, String y) {
        ArrayList<Integer> listx=new ArrayList<>();
        ArrayList<Integer> listy=new ArrayList<>();
        int mindistance=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(article[i]==x){
                listx.add(i);
            }
        }
        for(int i=0;i<n;i++){
            if(article[i]==y){
                listy.add(i);
            }
        }
        for(int i=0;i<listx.size();i++){
            for(int j=0;j<listy.size();j++){
                if(Math.abs(listx.get(i)-listy.get(j))<=mindistance){
                    mindistance=Math.abs(listx.get(i)-listy.get(j));
                }
            }

            }
            return mindistance;
    }
    public static int getDistance2(String[] article, int n, String x, String y) {

        int px=-1;
        int py=-1;
        int min=n;
        for(int i=0;i<n;i++)
        {
            if(article[i].equals(x)) {
                px = i;
            }
            if(article[i].equals(y)) {
                py = i;
            }
            if(px!=-1&&py!=-1) {
                min = Math.min(min, Math.abs(px - py));
            }
        }
        return min;
    }
    public static void main(String[]args){
        String[]A={"lab","lab","nhb","nhb","lab","nhb","nhb","nhb","lab"};
        System.out.println(getDistance2(A,9,"nhb","lab"));
    }
}
