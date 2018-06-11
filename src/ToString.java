/**
 ���ַ���

 ��һ���Ǹ����������дһ���㷨����ӡ��������Ӣ��������

 ����һ��int x���뷵��һ��string��Ϊ��������Ӣ��������

 ����Ҫ����һЩ�涨������ĺ�Ӵʣ�ÿ��λ�ٽ���һ���жϣ�1000��
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
                //���������Ҫ��һ�䣬1000�ķ����������ﴦ��
                //ǰ��+һ����������100һ�µ�����
                //�����ַ�������bigs���ɴ���ÿ��1000�ķ���
                //����������ڵ�һ��λ�ü��϶���","��
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
     * ����λ��ת��Ϊstring
     * */
    public String numUnder100(int num) {
        String str="";
        //1000���µ�������Ҫ�����������ʮ���鷳��
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
