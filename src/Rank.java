/**
 维护x的秩（查找）

 现在我们要读入一串数，同时要求在读入每个数的时候算出它的秩，即在当前数组中小于等于它的数的个数(不包括它自身)，请设计一个高效的数据结构和算法来实现这个功能。

 给定一个int数组A，同时给定它的大小n，请返回一个int数组，元素为每次加入的数的秩。保证数组大小小于等于5000。

 本题用了简单的双重遍历实现，但正确的做法应该是用二叉查找树边插入边排序
 * */
public class Rank {
    public  static int[] getRankOfNumber(int[] A, int n) {
        int R[] = new int[n];
        for(int i = 1;i< n;i++){
            for(int j = 0;j<i;j++){
                if(A[j]<= A[i]){
                    R[i]+=1;
                }

            }
        }
        return R;
    }

    public static void main(String []args){
        int []A={1,2,3,4,5,6};
        int []res=getRankOfNumber(A,6);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }
}
