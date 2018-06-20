import java.util.LinkedList;
/**
 Լɪ������II(����)

 Լɪ��������һ��������Ȥ�⡣�������������޸�һ�¹�����n����վ��һ�С�����ͷ��β�����Ǳ�ţ���һ���˱��Ϊ1��Ȼ���ͷ��ʼ��������һ�����α�1��2��1��2...Ȼ�󱨵�2���˳��֡�

 ���ŵڶ����ٴ���һ�����һ���������˿�ʼ���α�1��2��3��1��2��3...����2��3���˳��֡��Դ�����ֱ��ʣ���Ժ�һ���ˡ�������Ҫ��ļ�������˵ı�š�

 ����һ��int n��������Ϸ���������뷵�����һ���˵ı��.

 Ҫע������ 1.size�����Žڵ㱻�Ƴ�����С��Ҫע��߽��������ж� ��2.����ĿҪ��Ҫ�����һ��Ԫ���Ƶ��������λ
 * */
public class Joseph2 {
    public static int getResult(int n) {
        if (n < 1) {
            return -1;
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        int round = 2, i, curr = 0;
        for (i = 1; i <= n; i++) {
            list.add(i);
        }
        while (list.size() > 1) {
            i = 0;
            //����ڵ㱻�Ƴ�sizeҲͬ����С����������i������i++
            while (list.size() > 1 && i < list.size()) {
                curr = (curr + 1) % round;
                if (curr != 1) {
                    list.remove(i);
                } else {
                    i++;
                }
            }
            // ��һ�ֵ������
            round++;
            // ����һ�ֵ�λ������
            curr = 0;
            // ���������Ԫ���ƶ��������ײ�����ȷ��ÿ�α����������ײ���ʼ��
            int last = list.removeLast();
            list.addFirst(last);

        }
        // �������һ��Ԫ��
        return list.pop();
    }

    public static void main(String[]args){
        System.out.println(getResult(5));
    }
}