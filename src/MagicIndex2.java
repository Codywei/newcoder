/**
 魔术索引II

 在数组A[0..n-1]中，有所谓的魔术索引，满足条件A[i]=i。

 给定一个不下降序列，元素值可能相同，编写一个方法，判断在数组A中是否存在魔术索引。请思考一种复杂度优于o(n)的方法。

 给定一个int数组A和int n代表数组大小，请返回一个bool，代表是否存在魔术索引。

 利用二分查找来递归
 * */

public class MagicIndex2 {
    public  static boolean findMagicIndex2(int[] A, int n) {
        // write code here
        if(A==null||A.length<n||n<0) {
            return false;
        }
        return find(A,0,n-1);
    }
    public  static boolean find(int[] A,int low,int high){
        if(low>high) {
            return false;
        }
        if(low==high){
            if(A[low]==low) {
                return true;
            }
            else {
                return false;
            }
        }
        int mid=(low+high)/2;
        if(A[mid]==mid) {
            return true;
        }

        return find(A,low,mid-1)||find(A,mid+1,high);
    }
    public static void main(String[]args){
        int[]A={1,1,1,2,3};
        System.out.println(findMagicIndex2(A,5));
    }
}