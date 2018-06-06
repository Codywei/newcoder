/**
 n皇后问题

 请设计一种算法，解决著名的n皇后问题。这里的n皇后问题指在一个nxn的棋盘上放置n个棋子，使得每行每列和每条对角线上都只有一个棋子，求其摆放的方法数。

 给定一个int n，请返回方法数，保证n小于等于15。

 三个方法（方法一：初始化，方法二：计数  方法三：检验是否合理）
 * */
public class Queens {
    public static int nQueens(int n) {
        int[] cols = new int[n];
        //此处num由数组存储
        int[] num = { 0 };
        for (int i = 0; i < n; i++) {
            //第一行皇后的位置
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
    判断插入的皇后位置是否合理
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

