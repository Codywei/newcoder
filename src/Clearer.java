import java.util.*;
/**
 �������

 ���дһ���㷨����N�׷�����ĳ��Ԫ��Ϊ0���������ڵ����������㡣

 ����һ��N�׷���int[][](C++��Ϊvector<vector><int>>)mat�;���Ľ���n���뷵����ɲ������int[][]����(C++��Ϊvector<vector><int>>)����֤nС�ڵ���300�������е�Ԫ��Ϊint��Χ�ڡ�

 ������д�������ⷨ���ⷨһ����hashset����¼Ԫ��Ϊ��ʱ��Ӧ������ֵ�����α���ʱ��hashset������ⷨ���Ǵ���ģ�hashmap�ڲ���һ��key,value����������ͬ��key�ͻḲ�ǡ�
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
