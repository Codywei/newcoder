/**
 ��k��������ѧ������

 ��һЩ����������ֻ��3��5��7�������һ���㷨���ҳ����еĵ�k������

 ����һ����int k���뷵�ص�k��������֤kС�ڵ���100��

����˼·�� �����ҳ��ܱ�3��5��7����1������
 * */
public class KthNumber {
    public static int findKth(int k) {
        int count=0;
        int i=3;
        while(count<k){

                double b=i;
                while(b%3==0||b%7==0||b%5==0){
                    if(b%7==0){
                        b=b/7;
                    }
                    else if(b%5==0){
                        b=b/5;
                    }
                    else{
                        b=b/3;
                    }
                }
                if(b==1){
                    count++;
                }
            i++;
        }

        return i-1;
    }
    public static void main(String[]args){
        System.out.println(findKth(4));
    }
}