import java.util.ArrayList;
/**
 ����������루��̻�����

 ��һƪ�����ں�������ʣ��ָ����������ʣ������һ����Ч�㷨���ҳ��������������ʵ���̾���(����������ĵ�����,Ҳ��������������������λ�õĲ�ľ���ֵ)��

 ����һ��string����article�������������£�ͬʱ�������µĵ�����n�ʹ����ҵ���������x��y���뷵���������ʵ���̾��롣��֤�������ʾ������г����Ҳ���ͬ��ͬʱ��֤���µ�����С�ڵ���1000��

 ����һ�����������¼�������ʳ��ֵ�λ�ã�����˫�ر���ѡ��������̵�ֵ�������������¼���������ʳ���λ��ʱ�ľ��룬ȡ��Сֵ��
 * */
public class Distance {
    public static int getDistance(String[] article, int n, String x, String y) {
        ArrayList<Integer> listx=new ArrayList<>();
        ArrayList<Integer> listy=new ArrayList<>();
        int mindistance=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(article[i]==x){
                listx.add(i);
            }
        }
        for(int i=0;i<n;i++){
            if(article[i]==y){
                listy.add(i);
            }
        }
        for(int i=0;i<listx.size();i++){
            for(int j=0;j<listy.size();j++){
                if(Math.abs(listx.get(i)-listy.get(j))<=mindistance){
                    mindistance=Math.abs(listx.get(i)-listy.get(j));
                }
            }

            }
            return mindistance;
    }
    public static int getDistance2(String[] article, int n, String x, String y) {

        int px=-1;
        int py=-1;
        int min=n;
        for(int i=0;i<n;i++)
        {
            if(article[i].equals(x)) {
                px = i;
            }
            if(article[i].equals(y)) {
                py = i;
            }
            if(px!=-1&&py!=-1) {
                min = Math.min(min, Math.abs(px - py));
            }
        }
        return min;
    }
    public static void main(String[]args){
        String[]A={"lab","lab","nhb","nhb","lab","nhb","nhb","nhb","lab"};
        System.out.println(getDistance2(A,9,"nhb","lab"));
    }
}
