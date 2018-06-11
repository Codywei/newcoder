/**
 数字发音

 有一个非负整数，请编写一个算法，打印该整数的英文描述。

 给定一个int x，请返回一个string，为该整数的英文描述。

 首先要定义一些规定的特殊的后接词，每三位再进行一次判断（1000）
 * */
public class ToString {
    String[] dig = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] tee = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] ten = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] big = {"", "Thousand", "Million", "Billion", "Trillion", "Quadrillion", "Sextillion", "Septillion", "Octillion", "Nonillion"};

    public  String toString(int x) {
        // special cases
        if (x == 0) {
            return "Zero";
        }else if(x<0){
            return "Negative" + toString(-1*x);
        }

        int count=0;
        String str="";
        while(x>0){
            if(x%1000!=0){
                //这句是最重要的一句，1000的发音就在这里处理。
                //前面+一个函数处理100一下的数字
                //利用字符串数组bigs轻松处理每个1000的发音
                //而且巧妙地在第一个位置加上逗号","。
                //str = numUnder100(x % 1000) + big[count] + "," + str;
                if(str!=""){
                    str = numUnder100(x % 1000) + big[count] + "," + str;
                }else{
                    str = numUnder100(x % 1000) + big[count];
                }
            }

            x/=1000;
            count++;
        }
        //remove the last " "(space)
        return str.trim();
    }

    /**
     * 将三位数转换为string
     * */
    public String numUnder100(int num) {
        String str="";
        //1000以下的数字需要四种情况处理，十分麻烦。
        if (num >= 100){
            str += dig[num/100-1] + " Hundred ";
            num %= 100;
        }

        if (num >= 11 && num <= 19){
            return str + tee[num - 11] + " ";
        }

        if (num == 10 || num >= 20){
            str += ten[num/10 - 1] + " ";
            num %= 10;
        }

        if (num >= 1 && num <= 9){
            str += dig[num - 1] + " ";
        }

        return str;
    }
    public static void main(String[]args){
        ToString tostring=new ToString();
        String res=tostring.toString(5363);
        System.out.println(res);
    }
}
