/**
 �ж�ֱ���ཻ

 ����ֱ������ϵ�ϵ�����ֱ�ߣ�ȷ��������ֱ�߻᲻���ཻ��

 �߶���б�ʺͽؾ����ʽ��������double s1��double s2��double y1��double y2���ֱ����ֱ��1��2��б��(��s1,s2)�ͽؾ�(��y1,y2)���뷵��һ��bool���������������ֱ���Ƿ��ཻ��������ֱ���غ�Ҳ��Ϊ�ཻ��

 ����б����ͬ��ֲ�ͬ�������������������ཻ��
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
