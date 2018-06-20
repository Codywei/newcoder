import java.util.ArrayList;
import java.util.Arrays;
/**
 集合的子集（二进制）

 请编写一个方法，返回某集合的所有非空子集。

 给定一个int数组A和数组的大小int n，请返回A的所有非空子集。保证A的元素个数小于等于20，且元素互异。各子集内部从大到小排序,子集之间字典逆序排序。

 利用二进制来解题。总共有2^n-1种情况（n是数组个数），每种情况代表一个数，一个数的各位代表取或者不取。
 * */

public class Subet {
    public static ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(A);
        int max = 1 << n;
        for (int k = max - 1; k >= 1; k--) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = k, index = 0; i > 0; i >>= 1, index++) {
                if ((i & 1) == 1) {
                    arr.add(0, A[index]);
                }
            }
            list.add(arr);
        }
        return list;
    }
    public static void main(String[]args){
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        int[] A={123,456,789};
        list=getSubsets(A,3);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
