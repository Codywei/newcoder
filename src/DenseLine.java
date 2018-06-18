import java.util.HashMap;
/**
 ��������ֱ�ߣ���ѧ������

 �ڶ�άƽ���ϣ���һЩ�㣬���ҳ������������������ߡ�

 ����һ���㼯vector<point>p�͵㼯�Ĵ�Сn,û��������ĺ�������ȵ����,�뷵��һ��vector<double>��������������������ֱ�ߵ�б�ʺͽؾࡣ</double></point>

 ����������ֱ�ߣ���б�ʺͽؾࣩ,��hashmap��¼������ȡֵ����
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
