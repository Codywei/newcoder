/**
 ��ӽ�����

 ��һ�������������ҳ�������Ʊ�ʾ��1�ĸ�����ͬ���Ҵ�С��ӽ�������������(һ���Դ�һ����С)

 ����������int x���뷵��һ��vector�������������������С����ǰ������֤�𰸴��ڡ�

 �������Ҫ��ʵ��һ����ö�������1�����ĺ�����Ȼ�����������ֻ��Ϊ���������жϡ� Integer.bicount()����ʵ��һ���Ĺ���

 * */
public class CloseNumber {
    public static int[] getCloseNumber(int x) {
        int small=x-1,big=x+1;
        while(getCountOne(x)!=getCountOne(small)){
            small--;
        }
        while(getCountOne(x)!=getCountOne(big)){
            big++;
        }

        int arr[]={small,big};
        return arr;


    }
    public static  int  getCountOne(int x){ //���������������1�ĸ���
        int  result=0;
        while(x!=0){
            result++;
            x=x&(x-1);
        }
        return result;
    }

    public static void main(String[]args){
        int arr[]=new int[2];
        arr=getCloseNumber(2);
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
    }

}
