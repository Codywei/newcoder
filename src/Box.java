/**
 堆箱子（动态规划）

 有一堆箱子，每个箱子宽为wi，长为di，高为hi，现在需要将箱子都堆起来，而且为了使堆起来的箱子不到，上面的箱子的宽度和长度必须小于下面的箱子。

 请实现一个方法，求出能堆出的最高的高度，这里的高度即堆起来的所有箱子的高度之和。

 给定三个int数组w,l,h，分别表示每个箱子宽、长和高，同时给定箱子的数目n。请返回能堆成的最高的高度。保证n小于等于500。

 本题是一个利用动态规划求最大严格上升子序列的问题，由于要满足 底盘长宽的限制， 因此只需要找到满足 长与宽闲置的一个最大上升子序列即可，然后求出最大高度。

 进行计算前，需要对初始数组进行排序(即三个传入参数)，按单关键字排序即可,即宽度或高度。
 * */
public class Box {
    public int getHeight(int[] w, int[] l, int[] h, int n) {
        if(n <= 0){
            return 0;
        }
        //按宽度降序排列
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(w[i] < w[j]){
                    swap(w, i, j);
                    swap(l, i, j);
                    swap(h, i, j);
                }
            }
        }

        int[] maxH = new int[n];
        maxH[0] = h[0];
        int res = maxH[0];
        for(int i = 1; i < n; i++){
            maxH[i] = h[i];
            int tmax = 0;
            for(int j = i-1; j >=0; j--){
                if(w[j] > w[i] && l[j] > l[i]){
                    //tmax记录放入第i-1个箱子时可达到的最大高度
                    tmax = (tmax > maxH[j])? tmax : maxH[j];
                }
            }
            maxH[i] += tmax;
            //res仅存到放入第i个箱子为止，出现过的高度最大值
            res = res > maxH[i] ? res : maxH[i];
        }
        return res;
    }

    private void swap(int[] mat, int x, int y) {

        int tmp = mat[x];
        mat[x] = mat[y];
        mat[y] = tmp;
    }

    public static void main(String[]args){
        int []w={1,1,1};
        int []l={1,1,1};
        int []h={1,1,1};
        Box b=new Box();
        System.out.println(b.getHeight(w,l,h,3));
    }

}
