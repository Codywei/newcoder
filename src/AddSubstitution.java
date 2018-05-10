/**
 加法运算替代

 请编写一个方法，实现整数的乘法、减法和除法运算(这里的除指整除)。只允许使用加号。

 给定两个正整数int a,int b,同时给定一个int type代表运算的类型，1为求a ＊ b，0为求a ／ b，-1为求a － b。请返回计算的结果，保证数据合法且结果一定在int范围内。

 乘法：迭代的加  除法：迭代的加到超过为止  减法：两种情况 a>b;a<b
 * */

public class AddSubstitution {
    public static int calc(int a, int b, int type) {
        int result=0;
        int count=0;
        if(type==1){
            while(b!=0){
                result+=a;
                b--;
            }
        }
        if(type==0){
            count=b;
            while(b<=a){
                b+=count;
                result++;
            }
            return result;
        }
        if(type==-1){
            if(a>=b){
                while(a!=(b+result)){
                    result++;
                }
            }
            else{
                while(b!=(a+count)){
                    count++;
                    result+=-1;
                }
            }
            return result;
        }
        return result;

    }

    public static void main(String[]args){
        System.out.println(calc(16,5,0));
    }
}