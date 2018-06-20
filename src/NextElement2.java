/**
下一个较大元素II（编程基础）

 现在有一个数组，请找出数组中每个元素的后面比它大的最小的元素，若不存在则为-1。

 给定一个int数组A及数组的大小n，请返回每个元素所求的值组成的数组。保证A中元素为正整数，且n小于等于1000。

 同前一题， 建一个数组，两重遍历，判断条件改为是否为最小元素。
* */
public class NextElement2 {
    public static int[] findNext(int[] A, int n) {
        int []res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=-1;
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(A[j]>A[i] && (res[i]==-1||res[i]>A[j])) {
                    res[i] = A[j];
                }
            }
        }
        return res;

    }
    public static void main(String[]args){
        int  []A={11,13,10,5,12,21,3};
        int []res=findNext(A,7);
        for(int i=0;i<7;i++){
            System.out.println(res[i]);
        }
    }
}
