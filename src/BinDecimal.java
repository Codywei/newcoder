/**
 ������С��

 ��һ������0��1֮���ʵ��������Ϊdouble���������Ķ����Ʊ�ʾ������������޷���ȷ����32λ���ڵĶ����Ʊ�ʾ�����ء�Error����

 ����һ��double num����ʾ0��1��ʵ�����뷵��һ��string����������Ķ����Ʊ�ʾ���ߡ�Error����

 ��С������ÿһλ ���� 1/2 1/4 1/8 ����˳��*2 *4 *8 ��ÿһλ�Ƿ����1������1 ����Ϊ1��������Ϊ0
 * */
public class BinDecimal {
    public static String printBin(double num) {
           StringBuffer sb=new StringBuffer("0.");
           int count=32;
           while(num!=0){
               count--;
               if(count<0){
                   return "Error";
               }
               num=num*2;
               if(num>=1){
                   sb.append("1");
                   num-=1;
               }
               else{
                   sb.append("0");
               }
           }
           return sb.toString();
    }
    public static void main(String[]args){
        double a=0.625;
        System.out.println(printBin(a));
    }
}