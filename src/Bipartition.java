/**
 平分的直线

 在二维平面上，有两个正方形，请找出一条直线，能够将这两个正方形对半分。假定正方形的上下两条边与x轴平行。

 给定两个vecotrA和B，分别为两个正方形的四个顶点。请返回一个vector，代表所求的平分直线的斜率和截距，保证斜率存在。

 这题主要是求两个正方形的中心，两个中心的连线可以平分两个正方形。
 * */
public class Bipartition {
    public static double[] getBipartition(Point[] A, Point[] B) {
        double x1=0;
        double y1=0;
        double x2=0;
        double y2=0;
        double[] res=new double[2];

          for(int i=0;i<4;i++){
              x1+=(A[i].x)/4.0;
              y1+=(A[i].y)/4.0;
              x2+=(B[i].x)/4.0;
              y2+=(B[i].y)/4.0;
          }

          double xielv=(y2-y1)/(x2-x1);
          double jieju=y1-xielv*x1;
          res[0]=xielv;
          res[1]=jieju;
          return res;
    }
    public static void main(String[]args){
        Point a1=new Point(0,0);
        Point a2=new Point(0,1);
        Point a3=new Point(1,1);
        Point a4=new Point(1,0);
        Point b1=new Point(1,0);
        Point b2=new Point(1,1);
        Point b3=new Point(2,0);
        Point b4=new Point(2,1);
        Point []A={a1,a2,a3,a4};
        Point []B={b1,b2,b3,b4};
        double []res=getBipartition(A,B);
        System.out.println(res[0]);
        System.out.println(res[1]);

    }
}
