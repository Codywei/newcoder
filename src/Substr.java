/**
 �Ӵ��ж�

 ����һ��СдӢ����ĸ��ɵ��ַ���s��һ�������϶�СдӢ���ַ���������p�������һ����Ч�㷨������p�е�ÿһ���϶��ַ������ж����Ƿ�Ϊs���Ӵ���

 ����һ��string����p�����Ĵ�Сn��ͬʱ����string s��Ϊĸ�����뷵��һ��bool���飬ÿ��Ԫ�ش���p�еĶ�Ӧ�ַ����Ƿ�Ϊs���Ӵ���

 ��֤p�еĴ�����С�ڵ���8����p�еĴ��ĸ���С�ڵ���500��ͬʱ��֤s�ĳ���С�ڵ���1000��

 ֻ��Ҫѭ���ж��ַ����Ƿ������ǰ���������ַ������ɡ�
 * */

public class Substr {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        boolean []res=new boolean [n];
        for(int i=0;i<n;i++){
            if(s.contains(p[i])){
                res[i]=true;
            }
            else{
                res[i]=false;
            }
        }
        return res;
    }
    public static void main(String[]args){
        String []p={"a","b","c","d"};
        String s="abc";
        boolean []res=chkSubStr(p,4,s);
        for(int i=0;i<p.length;i++){
            System.out.println(res[i]);
        }
    }
}