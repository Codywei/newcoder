/**
 ���޺�I����̬�滮��

 ���޺���һ����������Ϸ����Ϸ��һ����Ҫվ����һ���˵ļ���ϡ�ͬʱ����Ӧ����������˱�������˸���һ�㡣��֪�μ���Ϸ��ÿ���˵���ߣ����д�������ͨ��ѡ�������Ϸ���ˣ����Ƕ��ܵ����ٸ��ˡ�

 ע��������˶����Ⱥ󵽵ģ���ζ�Ųμ���Ϸ���˵��Ⱥ�˳����ԭ�����е�˳��Ӧ��һ�¡�

 ����һ��int����men��������������ÿ���˵���ߡ�ͬʱ����������n���뷵������ܵ�����������֤nС�ڵ���500��

 ��̬�滮������������У�
 * */
public class Stack1 {
    public static  int getHeight(int[] men, int n) {
        // �� iλ��ʱ�������������еĳ���
        int []dp=new int[n];
        int longest=0;
        dp[0]=1;
        for(int i=0;i<n;i++){
            int sublongest=0;
            int subindex=0;
            //�ҳ� i ǰ��� 0-i-1��Ԫ���� �� i��Ԫ�ؽ����ĵ��������е����ֵ
            while(subindex<i){
                if(men[subindex]<men[i]){
                    sublongest=sublongest>dp[subindex]?sublongest:dp[subindex];
                }
                subindex++;
            }
            dp[i]=sublongest+1;
            //ȡdp�е������
            longest=dp[i]>longest?dp[i]:longest;
        }
        return longest;
    }
    public static void main(String[]args){
        int []men={1,6,2,5,3,4};
        System.out.println(getHeight(men,6));
    }
}
