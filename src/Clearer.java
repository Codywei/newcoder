import java.util.*;
/**
 清除行列

 请编写一个算法，若N阶方阵中某个元素为0，则将其所在的行与列清零。

 给定一个N阶方阵int[][](C++中为vector<vector><int>>)mat和矩阵的阶数n，请返回完成操作后的int[][]方阵(C++中为vector<vector><int>>)，保证n小于等于300，矩阵中的元素为int范围内。

 这里我写了两个解法，解法一采用hashset，记录元素为零时对应的行列值，二次遍历时按hashset清除；解法二是错误的，hashmap在插入一个key,value后，再碰到相同的key就会覆盖。
 * */
public class Clearer {
    public static int[][] clearZero1(int[][] mat, int n) {
        HashSet A=new HashSet();
        HashSet B=new HashSet();
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(mat[i][j]==0){
                   A.add(i);
                   B.add(j);
               }
           }
       }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             if(A.contains(i)||B.contains(j)){
                 mat[i][j]=0;
             }
                }
            }
            return mat;
        }

    public static int[][] clearZero2(int[][] mat, int n) {
        HashMap AB=new HashMap();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    AB.put(i,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(AB.containsKey(i)||AB.containsValue(j)){
                    mat[i][j]=0;
                }
            }
        }
        return mat;
    }
    public static void main(String[]args){
        int[][] mat = {{1, 2, 3}, {0,0,2}, {3,1,3}};
//        int[][] mat2 = new int[3][3];
        int[][] mat3 = new int[3][3];
//        mat2 = clearZero1(mat, 3);
        mat3 = clearZero2(mat, 3);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(mat2[i][j]+" ");
//
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat3[i][j]+" ");

            }
            System.out.println();
        }
    }

    }
