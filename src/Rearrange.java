import java.util.Arrays;
/**
 ��С�������򣨱�̻�����

 ��һ���������飬���дһ���������ҳ�����m��n��ֻҪ��m��n֮���Ԫ���ź������������������ġ�ע�⣺n-mӦ��ԽСԽ�ã�Ҳ����˵���ҳ�����������������С�

 ����һ��int����A������Ĵ�Сn���뷵��һ����Ԫ�飬�����������е������յ㡣(ԭ����λ�ô�0��ʼ���,��ԭ�������򣬷���[0,0])����֤A��Ԫ�ؾ�Ϊ��������

 �ȹ���һ������õ����飬��ͨ��������õ�����Աȣ�ȷ����ʼ��һ���ĵط������һ���ĵط�
 * */
public class Rearrange {
    public int[] findSegment(int[] A, int n) {
        int b[] ={0,0};
        int c[]=new int[n];
        if(n<=1) {
            return b;
        }
        for(int i=0;i<n;i++){
            c[i] =A[i];
        }
        Arrays.sort(c);
        int start =0;
        int end=n-1;
        while(c[start]==A[start]){
            start++;
            if(start==n){
                return b;
            }
        }
        while(c[end]==A[end]){
            end--;
            if(end==0){
                return b;
            }
        }
        b[0]=start;
        b[1]=end;
        return b;

    }
}
