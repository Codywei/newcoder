import java.util.*;
/**
 找出缺失的整数

 数组A包含了0到n的所有整数，但其中缺失了一个。对于这个问题，我们设定限制，使得一次操作无法取得数组number里某个整数的完整内容。

 唯一的可用操作是询问数组中第i个元素的二进制的第j位(最低位为第0位)，该操作的时间复杂度为常数，请设计算法，在O(n)的时间内找到这个数。

 给定一个数组number，即所有剩下的数按从小到大排列的二进制各位的值，如A[0][1]表示剩下的第二个数二进制从低到高的第二位。同时给定一个int n，意义如题。请返回缺失的数。

 已知数组是排好序的，所以只要判定奇数位的数组的第一位是否为1，偶数位的数组的第一位是否为0。
 * */
public class Finder {
    public static int findMissing(int[][] numbers, int n) {
        // write code here
        for(int i=0;i<numbers.length;i++){
            if((i%2==0)&&(numbers[i][0]!=0)){
                return i;
            }
            if((i%2==1)&&(numbers[i][0]!=1)){
                return i;
            }
        }
        return n;
    }
    public static void main(String[]args){
        int num[][]={{0},{0,1}};
        System.out.println(findMissing(num,3));

    }
}