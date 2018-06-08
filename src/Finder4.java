/**
 矩阵元素查找

 有一个NxM的整数矩阵，矩阵的行和列都是从小到大有序的。请设计一个高效的查找算法，查找矩阵中元素x的位置。

 给定一个int有序矩阵mat，同时给定矩阵的大小n和m以及需要查找的元素x，请返回一个二元数组，代表该元素的行号和列号(均从零开始)。保证元素互异。

 方法一利用了两重二分查找，然而第二种方法利用矩阵排序好的性质，巧妙减少了试探的成本（也不一定）
 * */
public class Finder4 {
    public static  int[] findElement1(int[][] mat, int n, int m, int x) {
        int start1=0;
        int start2=0;
        int end1=n-1;
        int end2=m-1;
        int []result={-1,-1};
        while(start1<=end1){
            int mid=(start1+end1)/2;
            if(mat[mid][0]==x){
                result[0]=mid;
                result[1]=0;
                return result;
            }
            if(mat[mid][m-1]==x){
                result[0]=mid;
                result[1]=m-1;
                return result;
            }
            if(mat[mid][0]<x && mat[mid][m-1]>x){
                while(start2<=end2){
                    int mid2=(start2+end2)/2;
                    if(mat[mid][mid2]==x){
                        result[0]=mid;
                        result[1]=mid2;
                        return result;
                    }
                    else if(mat[mid][mid2]>x){
                        end2=mid2-1;
                    }
                    else{
                        start2=mid2+1;
                    }

                }
            }
            else if(mat[mid][0]>x){
                end1=mid-1;
            }
            else{
                start1=mid+1;
            }
        }
        return result;
    }
    public static int[] findElement2(int[][] mat, int n, int m, int x) {
        // write code here
        int[] res=new int[2];
        int row=0,col=m-1;
        while(row<n && col>=0){
            if(mat[row][col]>x){
                col--;
            }
            else if(mat[row][col]<x) {
                row++;
            }
            else{
                res[0]=row;
                res[1]=col;
                break;
            }
        }
        return res;
    }
    public static void main(String[]args){
        int[][] mat={{0,2,3},{8,10,11}};
        int []result={-1,-1};
        result=findElement1(mat,2,3,8);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
