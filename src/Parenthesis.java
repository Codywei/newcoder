/**
 �Ϸ����������жϣ���ͨ�жϣ�

 ����һ���ַ����������һ���㷨���ж����Ƿ�Ϊһ���Ϸ������Ŵ���

 ����һ���ַ���A�����ĳ���n���뷵��һ��boolֵ�������Ƿ�Ϊһ���Ϸ������Ŵ���

 �����жϳ����Ƿ�Ϊż����Ȼ����ѭ�����ж������������Ƿ���ڻ�����������������ڽ�β���ж������������Ƿ��������������
 * */
public class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        if (n%2!=0){
            return false;
        }
        int left=0;
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='('){
                left++;
            }
            if(A.charAt(i)==')'){
                left--;
            }
            if(left<0){
                return false;
            }
        }
        if(left!=0){
            return false;
        }
        return true;
    }

    public static void main(String[]args){
        String A=")((()))(";
        System.out.println(chkParenthesis(A,8));
    }
}