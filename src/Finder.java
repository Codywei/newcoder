import java.util.*;
/**
 �ҳ�ȱʧ������

 ����A������0��n������������������ȱʧ��һ��������������⣬�����趨���ƣ�ʹ��һ�β����޷�ȡ������number��ĳ���������������ݡ�

 Ψһ�Ŀ��ò�����ѯ�������е�i��Ԫ�صĶ����Ƶĵ�jλ(���λΪ��0λ)���ò�����ʱ�临�Ӷ�Ϊ������������㷨����O(n)��ʱ�����ҵ��������

 ����һ������number��������ʣ�µ�������С�������еĶ����Ƹ�λ��ֵ����A[0][1]��ʾʣ�µĵڶ����������ƴӵ͵��ߵĵڶ�λ��ͬʱ����һ��int n���������⡣�뷵��ȱʧ������

 ��֪�������ź���ģ�����ֻҪ�ж�����λ������ĵ�һλ�Ƿ�Ϊ1��ż��λ������ĵ�һλ�Ƿ�Ϊ0��
 * */
public class Finder {
    public static int findMissing(int[][] numbers, int n) {
        // write code here
        for(int i=0;i<numbers.length;i++){
            if((i%2==0)&&(numbers[i][0]!=0)){
                return i;
            }
            if((i%2==1)&&(numbers[i][0]!=1)){
                return i;
            }
        }
        return n;
    }
    public static void main(String[]args){
        int num[][]={{0},{0,1}};
        System.out.println(findMissing(num,3));

    }
}