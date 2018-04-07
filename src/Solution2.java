import java.util.Stack;
/**
 用两个栈实现一个队列

 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

 本题较简单，其中一个栈用来倒序，不过要注意弹出后要记得把stack2中的值重新倒回stack1中;解法二先判断Stack2是否为空，巧妙地避免了stack来回两次存放
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