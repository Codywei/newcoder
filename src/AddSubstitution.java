/**
 �ӷ��������

 ���дһ��������ʵ�������ĳ˷��������ͳ�������(����ĳ�ָ����)��ֻ����ʹ�üӺš�

 ��������������int a,int b,ͬʱ����һ��int type������������ͣ�1Ϊ��a �� b��0Ϊ��a �� b��-1Ϊ��a �� b���뷵�ؼ���Ľ������֤���ݺϷ��ҽ��һ����int��Χ�ڡ�

 �˷��������ļ�  �����������ļӵ�����Ϊֹ  ������������� a>b;a<b
 * */

public class AddSubstitution {
    public static int calc(int a, int b, int type) {
        int result=0;
        int count=0;
        if(type==1){
            while(b!=0){
                result+=a;
                b--;
            }
        }
        if(type==0){
            count=b;
            while(b<=a){
                b+=count;
                result++;
            }
            return result;
        }
        if(type==-1){
            if(a>=b){
                while(a!=(b+result)){
                    result++;
                }
            }
            else{
                while(b!=(a+count)){
                    count++;
                    result+=-1;
                }
            }
            return result;
        }
        return result;

    }

    public static void main(String[]args){
        System.out.println(calc(16,5,0));
    }
}