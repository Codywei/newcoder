/**
�޻��潻������̻�����

 ���дһ�������������ڲ�ʹ���κ���ʱ������ֱ�ӽ�����������ֵ��

 ����һ��int����AB��������Ԫ�غ͵�һ��Ԫ��Ϊ��������ֵ���뷵�ؽ���������顣

 ���ⲻ��������ʱ����������Ҫ���üӼ����ȴ�סҪ�仯����
* */
public class Exchange2 {
    public static int[] exchangeAB(int[] AB) {
        AB[0]=AB[0]+AB[1];
        AB[1]=AB[0]-AB[1];
        AB[0]=AB[0]-AB[1];
        return AB;
    }
    public static void main(String[]args){
        int []AB={1,3};
        int []res=exchangeAB(AB);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
