import java.util.HashMap;

public class DenseLine {
    public static double[] getLine(Point[] p, int n) {
        HashMap<Double,Integer> pointmap=new HashMap();
        int max=0;
        double xie=0;
        Point maxp=null;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(p[i].x==p[j].x){
                    continue;
                }
                double tempxie=(p[j].y-p[i].y)/(p[j].x-p[i].x);
                if(pointmap.get(i)==null){
                    pointmap.put(tempxie,1);
                }
                else{
                    int count=pointmap.get(tempxie);
                    pointmap.put(tempxie,count+1);
                }
                if(pointmap.get(tempxie)>max){
                    max=pointmap.get(tempxie);
                    maxp=p[i];
                    xie=tempxie;
                }
            }
        }
        double jie=maxp.y-(maxp.x)*xie;
        double  []res=new double[2];
        res[0]=xie;
        res[1]=jie;
        return res;

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
