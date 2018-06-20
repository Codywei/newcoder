import java.util.Arrays;
/**
 实时中位数（编程基础）

 现有一些随机生成的数字要将其依次传入，请设计一个高效算法，对于每次传入一个数字后，算出当前所有传入数字的中位数。(若传入了偶数个数字则令中位数为第n/2小的数字，n为已传入数字个数)。

 给定一个int数组A，为传入的数字序列，同时给定序列大小n，请返回一个int数组，代表每次传入后的中位数。保证n小于等于1000。

遍历： 用一个临时数组记录从首位到当前位的元素，排序后取中位数
 * */
public class Middle {
    public static int[] getMiddle(int[] A, int n) {
        int []res=new int[n];
        for(int i=0;i<n;i++){
            int []temp=new int[i+1];
            for(int j=0;j<=i;j++){
                 temp[j]=A[j];
            }
            Arrays.sort(temp);
            res[i]=temp[(temp.length-1)/2];
        }
        return res;
    }
    public static void main(String []args){
        int []A={1,2,3,4,5,6};
        int []res=getMiddle(A,6);
        for(int i=0;i<A.length;i++){
            System.out.println(res[i]);
        }
    }
}
