/**
 魔术索引I

 在数组A[0..n-1]中，有所谓的魔术索引，满足条件A[i]=i。给定一个升序数组，元素值各不相同，编写一个方法，判断在数组A中是否存在魔术索引。请思考一种复杂度优于o(n)的方法。

 给定一个int数组A和int n代表数组大小，请返回一个bool，代表是否存在魔术索引。

 由题意可以判断，如果排除负数的存在的话，满足条件的数组的值必然会和索引值一一对应，所以第零位必定为零。
 * */
public class MagicIndex {

    public static boolean findMagicIndex(int[] A, int n) {

        if(A[0]!=0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[]main){
        int A[]={0,2,3,4,5,6};
        System.out.println(findMagicIndex(A,6));
    }
}