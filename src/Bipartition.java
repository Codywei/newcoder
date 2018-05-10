/**
 ƽ�ֵ�ֱ��

 �ڶ�άƽ���ϣ������������Σ����ҳ�һ��ֱ�ߣ��ܹ��������������ζ԰�֡��ٶ������ε�������������x��ƽ�С�

 ��������vecotrA��B���ֱ�Ϊ���������ε��ĸ����㡣�뷵��һ��vector�����������ƽ��ֱ�ߵ�б�ʺͽؾ࣬��֤б�ʴ��ڡ�

 ������Ҫ�������������ε����ģ��������ĵ����߿���ƽ�����������Ρ�
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
