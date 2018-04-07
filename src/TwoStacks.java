import org.omg.PortableInterceptor.INACTIVE;
/**
 双栈排序

 请编写一个程序，按升序对栈进行排序（即最大元素位于栈顶），要求最多只能使用一个额外的栈存放临时数据，但不得将元素复制到别的数据结构中。

 给定一个int[] numbers(C++中为vector&ltint>)，其中第一个元素为栈顶，请返回排序后的栈。请注意这是一个栈，意味着排序过程中你只能访问到第一个元素。

 第二种解法思路较清晰一些（其实第一种（我做的）也还好）
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
                    //在判断条件中完成赋值(tmp2=tempstack.pop())
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
