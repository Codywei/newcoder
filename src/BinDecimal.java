/**
 二进制小数

 有一个介于0和1之间的实数，类型为double，返回它的二进制表示。如果该数字无法精确地用32位以内的二进制表示，返回“Error”。

 给定一个double num，表示0到1的实数，请返回一个string，代表该数的二进制表示或者“Error”。

 将小数点后的每一位 看做 1/2 1/4 1/8 ，按顺序*2 *4 *8 看每一位是否大于1，大于1 则置为1，否则置为0
 * */
public class BinDecimal {
    public static String printBin(double num) {
           StringBuffer sb=new StringBuffer("0.");
           int count=32;
           while(num!=0){
               count--;
               if(count<0){
                   return "Error";
               }
               num=num*2;
               if(num>=1){
                   sb.append("1");
                   num-=1;
               }
               else{
                   sb.append("0");
               }
           }
           return sb.toString();
    }
    public static void main(String[]args){
        double a=0.625;
        System.out.println(printBin(a));
    }
}