/**
 上楼梯（递归和动态规划）

 有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。请实现一个方法，计算小孩有多少种上楼的方式。为了防止溢出，请将结果Mod 1000000007

 给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。

 用动态规划。首先判断倒数第二个状态（终止状态的前一个状态）有几种，再根据初始条件推导每步状态转移的通用公式。
 * */
public class GoUpstairs {
    public static int countWays(int n) {
        int n1=1;
        int n2=2;
        int n3=4;
        int sum=0;
        if(n==1){
            return n1;
        }
        if(n==2){
            return n2;
        }
        if(n==3){
            return n3;
        }

        for(int i=4;i<=n;i++){
            sum=((n1+n2)%1000000007+n3)%1000000007;
            n1=n2;
            n2=n3;
            n3=sum;
        }
        return  sum;
    }
    public static void main(String[]args){
        System.out.println(countWays(4));
    }
}
