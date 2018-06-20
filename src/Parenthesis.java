/**
 合法括号序列判断（普通判断）

 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。

 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。

 首先判断长度是否为偶数，然后在循环中判断左括号数量是否大于或等于右括号数量，在结尾再判断左括号数量是否等于右括号数量
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