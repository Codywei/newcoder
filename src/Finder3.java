/**
 �ҳ��ַ��������ֲ��ң�

 ��һ���Ź�����ַ������飬���������в�����һЩ���ַ����������һ���㷨���ҳ������ַ�����λ�á��㷨�Ĳ��Ҳ��ֵĸ��Ӷ�Ӧ��Ϊlog����

 ����һ��string����str,ͬʱ���������Сn����Ҫ���ҵ�string x���뷵�ظô���λ��(λ�ô��㿪ʼ)

 ���ֲ��ң������ո�ע��ͷβ���˵Ŀո��ж�
 * */
public class Finder3 {
    public static int findString(String[] str, int n, String x) {
        int left=0;
        int right=n-1;
        //���ҵ��������˶����ǿո�ĵ�
        while(str[left]==""){
            left++;
        }
        while(str[right]==""){
            right --;
        }
        while(left<=right){
            int mid=(left+right)/2;
            while(str[mid]==""){
                mid--;
            }
            if(str[mid].compareTo(x)==0){
                return mid;
            }
            else if(str[mid].compareTo(x)>0){
                right=mid-1;
                while(str[right]==""){
                    right--;
                }
            }
            else{
                left=mid+1;
                while(str[left]==""){
                    left++;
                }
            }
        }
        return -1;
    }
    public static void main(String[]args){
        String []str={"a","b","","c","","d"};
        System.out.println(findString(str,6,"c"));
    }
}
