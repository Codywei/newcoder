/**
 最接近的数

 有一个正整数，请找出其二进制表示中1的个数相同、且大小最接近的那两个数。(一个略大，一个略小)

 给定正整数int x，请返回一个vector，代表所求的两个数（小的在前）。保证答案存在。

 这道题主要是实现一个求得二进制中1个数的函数，然后用这个函数只作为条件进行判断。 Integer.bicount()可以实现一样的功能

 * */
public class CloseNumber {
    public static int[] getCloseNumber(int x) {
        int small=x-1,big=x+1;
        while(getCountOne(x)!=getCountOne(small)){
            small--;
        }
        while(getCountOne(x)!=getCountOne(big)){
            big++;
        }

        int arr[]={small,big};
        return arr;


    }
    public static  int  getCountOne(int x){ //求该整数二进制中1的个数
        int  result=0;
        while(x!=0){
            result++;
            x=x&(x-1);
        }
        return result;
    }

    public static void main(String[]args){
        int arr[]=new int[2];
        arr=getCloseNumber(2);
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
    }

}
