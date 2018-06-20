import java.util.ArrayList;
import java.util.Arrays;
/**
 ���ϵ��Ӽ��������ƣ�

 ���дһ������������ĳ���ϵ����зǿ��Ӽ���

 ����һ��int����A������Ĵ�Сint n���뷵��A�����зǿ��Ӽ�����֤A��Ԫ�ظ���С�ڵ���20����Ԫ�ػ��졣���Ӽ��ڲ��Ӵ�С����,�Ӽ�֮���ֵ���������

 ���ö����������⡣�ܹ���2^n-1�������n�������������ÿ���������һ������һ�����ĸ�λ����ȡ���߲�ȡ��
 * */

public class Subet {
    public static ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(A);
        int max = 1 << n;
        for (int k = max - 1; k >= 1; k--) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = k, index = 0; i > 0; i >>= 1, index++) {
                if ((i & 1) == 1) {
                    arr.add(0, A[index]);
                }
            }
            list.add(arr);
        }
        return list;
    }
    public static void main(String[]args){
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        int[] A={123,456,789};
        list=getSubsets(A,3);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
