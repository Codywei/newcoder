/**
 最大和子矩阵

 有一个正整数和负整数组成的NxN矩阵，请编写代码找出元素总和最大的子矩阵。请尝试使用一个高效算法。

 给定一个int矩阵mat和矩阵的阶数n，请返回元素总和最大的子矩阵的元素之和。保证元素绝对值小于等于100000，且矩阵阶数小于等于200。

 把二维数组M x N 每一行分别相加，就可以得出一个一维数组(长度为N），这个一维数组的最大子数组和就是原矩阵中包含M行X列的一个最大子矩阵和。

 这样只用枚举出原N x N 矩阵的所有 M x N的子矩阵的最大子矩阵和，就可以得出最后结果
 * */
public class SubMatrix2 {
    public static int sumOfSubMatrix(int[][] mat, int n) {
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int[] temp = mat[i];
            maxVal = Math.max(maxVal,helper(temp));
            for(int j = i + 1; j < n; j++){
                for(int k = 0; k < n; k++){
                    temp[k] += mat[j][k];
                }
                maxVal = Math.max(maxVal,helper(temp));
            }
        }
        return maxVal;
    }
    /**
     * 找出该数组的最大子数组和
     */

     static int helper(int[] temp2){
        int temp = temp2[0];
        int maxVal = temp;
        for(int i = 1; i < temp2.length; i++){
            if(temp < 0){
                temp = temp2[i];
            }else{
                temp +=temp2[i];
            }
            if(temp > maxVal){
                maxVal = temp;
            }
        }
        return maxVal;
    }

    public static void main(String[]args){
//        int [][]A={{1,2,-3},{3,4,-5},{-5,-6,-7}};
        int [][]A={{10,-10,12},{15,-24,12},{1,-1,1}};
        System.out.println(sumOfSubMatrix(A,3));

    }
}
