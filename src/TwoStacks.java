import org.omg.PortableInterceptor.INACTIVE;
/**
 ˫ջ����

 ���дһ�����򣬰������ջ�������򣨼����Ԫ��λ��ջ������Ҫ�����ֻ��ʹ��һ�������ջ�����ʱ���ݣ������ý�Ԫ�ظ��Ƶ�������ݽṹ�С�

 ����һ��int[] numbers(C++��Ϊvector&ltint>)�����е�һ��Ԫ��Ϊջ�����뷵��������ջ����ע������һ��ջ����ζ�������������ֻ�ܷ��ʵ���һ��Ԫ�ء�

 �ڶ��ֽⷨ˼·������һЩ����ʵ��һ�֣������ģ�Ҳ���ã�
 * */
import java.util.*;

public class TwoStacks {
    public static ArrayList<Integer> twoStacksSort1(int[] numbers) {
    Stack<Integer>initstack=new Stack<Integer>();
    Stack<Integer>tempstack=new Stack<Integer>();
    ArrayList<Integer> result = new ArrayList<>(numbers.length);
    int tmp1;
    int tmp2;
    for(int i=numbers.length-1;i>=0;i--){
        initstack.push(numbers[i]);
    }
    while(!initstack.empty()){
        if(tempstack.empty()){
            tempstack.push(initstack.pop());
        }
        else{
            tmp1=initstack.pop();
            tmp2=tempstack.pop();
           while(tmp1<tmp2){
                if(!tempstack.empty()) {
                    initstack.push(tmp2);
                    tmp2 = tempstack.pop();

                }
                else{
                    break;
                }
            }
            if(tmp1>tmp2) {
                tempstack.push(tmp2);
                tempstack.push(tmp1);
            }
            else {
                tempstack.push(tmp1);
                tempstack.push(tmp2);
            }


        }
    }
    while (!tempstack.empty()) {
            result.add(tempstack.pop());
        }
        return result;

    }
    public static ArrayList<Integer> twoStacksSort2(int[] numbers) {
        Stack<Integer> initstack = new Stack<Integer>();
        Stack<Integer> tempstack = new Stack<Integer>();
        ArrayList<Integer> result = new ArrayList<>(numbers.length);
        int tmp1;
        int tmp2;
        for (int i = numbers.length - 1; i >= 0; i--) {
            initstack.push(numbers[i]);
        }
        while (!initstack.empty()) {
            if (tempstack.empty()) {
                tempstack.push(initstack.pop());
            } else {
                tmp1 = initstack.pop();
                tmp2 = tempstack.pop();
                if (tmp1 < tmp2) {
                    initstack.push(tmp2);
                    //���ж���������ɸ�ֵ(tmp2=tempstack.pop())
                    while (!tempstack.empty() && tmp1 < (tmp2 = tempstack.pop())) {
                        initstack.push(tmp2);
                    }
                }
          if(tmp1>=tmp2){
                    tempstack.push(tmp2);
                    }
                tempstack.push(tmp1);

                }


            }


            while (!tempstack.empty()) {
                result.add(tempstack.pop());
            }
            return result;


    }

    public static void main(String[]args){
        int[] num={8,1,3,4,6,2,5,3,7};
//        ArrayList result=twoStacksSort1(num);
        ArrayList result=twoStacksSort2(num);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }

    }
}
