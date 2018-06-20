/**
 �����ӣ���̬�滮��

 ��һ�����ӣ�ÿ�����ӿ�Ϊwi����Ϊdi����Ϊhi��������Ҫ�����Ӷ�������������Ϊ��ʹ�����������Ӳ�������������ӵĿ�Ⱥͳ��ȱ���С����������ӡ�

 ��ʵ��һ������������ܶѳ�����ߵĸ߶ȣ�����ĸ߶ȼ����������������ӵĸ߶�֮�͡�

 ��������int����w,l,h���ֱ��ʾÿ�����ӿ����͸ߣ�ͬʱ�������ӵ���Ŀn���뷵���ܶѳɵ���ߵĸ߶ȡ���֤nС�ڵ���500��

 ������һ�����ö�̬�滮������ϸ����������е����⣬����Ҫ���� ���̳�������ƣ� ���ֻ��Ҫ�ҵ����� ��������õ�һ��������������м��ɣ�Ȼ��������߶ȡ�

 ���м���ǰ����Ҫ�Գ�ʼ�����������(�������������)�������ؼ������򼴿�,����Ȼ�߶ȡ�
 * */
public class Box {
    public int getHeight(int[] w, int[] l, int[] h, int n) {
        if(n <= 0){
            return 0;
        }
        //����Ƚ�������
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
                    //tmax��¼�����i-1������ʱ�ɴﵽ�����߶�
                    tmax = (tmax > maxH[j])? tmax : maxH[j];
                }
            }
            maxH[i] += tmax;
            //res���浽�����i������Ϊֹ�����ֹ��ĸ߶����ֵ
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
