/**
 找出字符串（二分查找）

 有一个排过序的字符串数组，但是其中有插入了一些空字符串，请设计一个算法，找出给定字符串的位置。算法的查找部分的复杂度应该为log级别。

 给定一个string数组str,同时给定数组大小n和需要查找的string x，请返回该串的位置(位置从零开始)

 二分查找，跳过空格，注意头尾两端的空格判断
 * */
public class Finder3 {
    public static int findString(String[] str, int n, String x) {
        int left=0;
        int right=n-1;
        //先找到左右两端都不是空格的点
        while(str[left]==""){
            left++;
        }
        while(str[right]==""){
            right --;
        }
        while(left<=right){
            int mid=(left+right)/2;
            while(str[mid]==""){
                mid--;
            }
            if(str[mid].compareTo(x)==0){
                return mid;
            }
            else if(str[mid].compareTo(x)>0){
                right=mid-1;
                while(str[right]==""){
                    right--;
                }
            }
            else{
                left=mid+1;
                while(str[left]==""){
                    left++;
                }
            }
        }
        return -1;
    }
    public static void main(String[]args){
        String []str={"a","b","","c","","d"};
        System.out.println(findString(str,6,"c"));
    }
}
