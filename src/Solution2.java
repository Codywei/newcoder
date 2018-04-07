import java.util.Stack;
/**
 ������ջʵ��һ������

 ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�

 ����ϼ򵥣�����һ��ջ�������򣬲���Ҫע�ⵯ����Ҫ�ǵð�stack2�е�ֵ���µ���stack1��;�ⷨ�����ж�Stack2�Ƿ�Ϊ�գ�����ر�����stack�������δ��
 * */

public class Solution2 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop1() {
        int pop;
        if(stack1.empty()&&stack2.empty()){
           throw new RuntimeException("Queue is empty!");
        }
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        pop=stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return pop;
    }

    public int pop2() {
        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue is empty!");
        }

        if(stack2.empty()){
              while(!stack1.empty()){
                  stack2.push(stack1.pop());
              }
        }
            return stack2.pop();
    }

    public static void main(String[]args){
        Solution2 solution2=new Solution2();
        solution2.push(2);
        solution2.push(3);
        solution2.push(4);
        System.out.println(solution2.pop1());
        System.out.println(solution2.pop2());
    }


}