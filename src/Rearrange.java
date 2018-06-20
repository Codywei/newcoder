import java.util.Arrays;
/**
 最小调整有序（编程基础）

 有一个整数数组，请编写一个函数，找出索引m和n，只要将m和n之间的元素排好序，整个数组就是有序的。注意：n-m应该越小越好，也就是说，找出符合条件的最短序列。

 给定一个int数组A和数组的大小n，请返回一个二元组，代表所求序列的起点和终点。(原序列位置从0开始标号,若原序列有序，返回[0,0])。保证A中元素均为正整数。

 先构造一个排序好的数组，再通过和排序好的数组对比，确定开始不一样的地方和最后不一样的地方
 * */
public class Rearrange {
    public int[] findSegment(int[] A, int n) {
        int b[] ={0,0};
        int c[]=new int[n];
        if(n<=1) {
            return b;
        }
        for(int i=0;i<n;i++){
            c[i] =A[i];
        }
        Arrays.sort(c);
        int start =0;
        int end=n-1;
        while(c[start]==A[start]){
            start++;
            if(start==n){
                return b;
            }
        }
        while(c[end]==A[end]){
            end--;
            if(end==0){
                return b;
            }
        }
        b[0]=start;
        b[1]=end;
        return b;

    }
}
