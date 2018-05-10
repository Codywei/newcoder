import java.util.*;
/**
 碰撞的蚂蚁

 在n个顶点的多边形上有n只蚂蚁，这些蚂蚁同时开始沿着多边形的边爬行，请求出这些蚂蚁相撞的概率。(这里的相撞是指存在任意两只蚂蚁会相撞)

 给定一个int n(3<=n<=10000)，代表n边形和n只蚂蚁，请返回一个double，为相撞的概率。

 每个蚂蚁爬行的方向都有两个，即围绕多边形顺时针爬和逆时针爬，因此n个蚂蚁爬行的方法有2^n种。
 只有当所有的蚂蚁按照同一个方向爬行才能保证所有的蚂蚁都不相撞，只有两种方法--都按逆时针或顺时针方向爬行。
 所以相撞的概率为1 - （double）2 / (2 ^n)。
 * */
public class Ants {
    public static double antsCollision(int n) {
        return 1-2/Math.pow(2, n);
    }
    public static void main(String[]args){
        int a=3;
        System.out.println(antsCollision(3));
    }
}
