/**
 n�ʺ�����

 �����һ���㷨�����������n�ʺ����⡣�����n�ʺ�����ָ��һ��nxn�������Ϸ���n�����ӣ�ʹ��ÿ��ÿ�к�ÿ���Խ����϶�ֻ��һ�����ӣ�����ڷŵķ�������

 ����һ��int n���뷵�ط���������֤nС�ڵ���15��

 ��������������һ����ʼ����������������  �������������Ƿ����
 * */
public class Queens {
    public static int nQueens(int n) {
        int[] cols = new int[n];
        //�˴�num������洢
        int[] num = { 0 };
        for (int i = 0; i < n; i++) {
            //��һ�лʺ��λ��
            cols[0] = i;
            getCount(cols, 1, num);

        }
        return num[0];
    }

    public static void getCount(int[] cols, int row, int[] num) {
        if (row == (cols.length)) {
            num[0]++;
            return;
        }
        for (int i = 0; i < cols.length; i++) {
            if (checkValid(cols, row, i)) {
                cols[row] = i;
                getCount(cols, row + 1, num);
            }
        }

    }
    /**
    �жϲ���Ļʺ�λ���Ƿ����
    * */
    private static boolean checkValid(int[] cols, int row, int col) {
        for (int i = 0; i < row; i++) {
            int temp = cols[i];
            if (temp == col) {
                return false;
            }
            if (Math.abs(row - i) == Math.abs(temp - col)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String []args){
        System.out.println(3);
    }
}

