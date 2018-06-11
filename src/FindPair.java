import java.util.Arrays;
/**
 整数对查找

 请设计一个高效算法，找出数组中两数之和为指定值的所有整数对。

 给定一个int数组A和数组大小n以及需查找的和sum，请返回和为sum的整数对的个数。保证数组大小小于等于3000。

 首先做排序，然后两个数分别由头（外遍历）、尾（内遍历）向中间查找
 * */
public class FindPair {
    public  static int countPairs(int[] A, int n, int sum) {
        Arrays.sort(A);
        int res=0;
        for(int i=0;i<A.length;i++){
            for(int j=A.length-1;j>i;j--){
                if(A[i]+A[j]==sum){
                    res++;
                }else if(A[i]+A[j]<sum){
                    break;
                }
            }
        }
        return res;
    }

    public static void  main(String[]args){
          int []A={1,2,3,4,5};
          System.out.println(countPairs(A,5,6));
    }
}
