/**
 判断直线相交（数学基础）

 给定直角坐标系上的两条直线，确定这两条直线会不会相交。

 线段以斜率和截距的形式给出，即double s1，double s2，double y1，double y2，分别代表直线1和2的斜率(即s1,s2)和截距(即y1,y2)，请返回一个bool，代表给定的两条直线是否相交。这里两直线重合也认为相交。

 除开斜率相同结局不同的情况，其他情况都会相交。
 * */

public class CrossLine {
    public static  boolean checkCrossLine(double s1, double s2, double y1, double y2) {

        if((s1==s2)&&(y1!=y2)){
            return false;
        }
        return true;
    }
    public static void main(String[]args){
        double s1=3.14;
        double s2=3.14;
        double y1=1;
        double y2=2;
        System.out.println(checkCrossLine(s1,s2,1,2));

    }
}
