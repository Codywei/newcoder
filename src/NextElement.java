/**
 下一个较大元素

 现在我们有一个int数组，请你找出数组中每个元素的下一个比它大的元素。

 给定一个int数组A及数组的大小n，请返回一个int数组，代表每个元素比他大的下一个元素,若不存在则为-1。保证数组中元素均为正整数。

 建一个数组，两重遍历，找到下一个较大的元素后退出一种循环。
 * */
public class NextElement {
    public static int[] findNext(int[] A, int n) {
       int []res=new int[n];
       for(int i=0;i<n;i++){
           res[i]=-1;
       }
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
               if(A[j]>A[i]) {
                   res[i] = A[j];
                   break;
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
