/**
无缓存交换（编程基础）

 请编写一个函数，函数内不使用任何临时变量，直接交换两个数的值。

 给定一个int数组AB，其第零个元素和第一个元素为待交换的值，请返回交换后的数组。

 这题不能利用临时变量，所以要利用加减法先存住要变化的量
* */
public class Exchange2 {
    public static int[] exchangeAB(int[] AB) {
        AB[0]=AB[0]+AB[1];
        AB[1]=AB[0]-AB[1];
        AB[0]=AB[0]-AB[1];
        return AB;
    }
    public static void main(String[]args){
        int []AB={1,3};
        int []res=exchangeAB(AB);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
