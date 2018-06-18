/**
 第k个数（数学基础）

 有一些数的素因子只有3、5、7，请设计一个算法，找出其中的第k个数。

 给定一个数int k，请返回第k个数。保证k小于等于100。

解题思路是 按序找出能被3，5，7除到1的数。
 * */
public class KthNumber {
    public static int findKth(int k) {
        int count=0;
        int i=3;
        while(count<k){

                double b=i;
                while(b%3==0||b%7==0||b%5==0){
                    if(b%7==0){
                        b=b/7;
                    }
                    else if(b%5==0){
                        b=b/5;
                    }
                    else{
                        b=b/3;
                    }
                }
                if(b==1){
                    count++;
                }
            i++;
        }

        return i-1;
    }
    public static void main(String[]args){
        System.out.println(findKth(4));
    }
}