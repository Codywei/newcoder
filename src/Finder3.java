public class Finder3 {
    public static int findString(String[] str, int n, String x) {
        int left=0;
        int right=n-1;
        //先找到左右两端都不是空格的点
        while(str[left]==""){
            left++;
        }
        while(str[right]==""){
            right --;
        }
        while(left<=right){
            int mid=(left+right)/2;
            while(str[mid]==""){
                mid--;
            }
            if(str[mid].compareTo(x)==0){
                return mid;
            }
            else if(str[mid].compareTo(x)>0){
                right=mid-1;
                while(str[right]==""){
                    right--;
                }
            }
            else{
                left=mid+1;
                while(str[left]==""){
                    left++;
                }
            }
        }
        return -1;
    }
    public static void main(String[]args){
        String []str={"a","b","","c","","d"};
        System.out.println(findString(str,6,"c"));
    }
}
