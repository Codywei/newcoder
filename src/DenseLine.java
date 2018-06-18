import java.util.HashMap;
/**
 穿点最多的直线（数学基础）

 在二维平面上，有一些点，请找出经过点数最多的那条线。

 给定一个点集vector<point>p和点集的大小n,没有两个点的横坐标相等的情况,请返回一个vector<double>，代表经过点数最多的那条直线的斜率和截距。</double></point>

 遍历出所有直线（按斜率和截距）,用hashmap记录数量，取值最大的
 * */

public class DenseLine {
    public static double[] getLine(Point[] p, int n) {

        HashMap<double[],Integer> pointmap=new HashMap();

        double []maxpointkey=new double[2];
        int max=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(p[i].x==p[j].x){
                    continue;
                }

                double []pointkey=new double[2];
                pointkey[0]=(p[j].y-p[i].y)/(p[j].x-p[i].x);
                pointkey[1]=p[i].y-(p[i].x)*pointkey[0];
                if(pointmap.get(pointkey)==null){
                    pointmap.put(pointkey,1);
                }
                else{
                    int count=pointmap.get(pointkey);
                    pointmap.put(pointkey,count+1);
                }
                if(pointmap.get(pointkey)>max){
                    max=pointmap.get(pointkey);
                    maxpointkey=pointkey;

                }
            }
        }

        return maxpointkey;

    }
    public static void main(String[]args){
        Point a1=new Point(1,1);
        Point a2=new Point(2,2);
        Point a3=new Point(3,3);
        Point a4=new Point(4,4);
        Point a5=new Point(6,5);
        Point[] p={a1,a2,a3,a4,a5};
       double[] res =getLine(p,5);
       System.out.println(res[0]);
       System.out.println(res[1]);

    }
}
