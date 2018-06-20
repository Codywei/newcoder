import java.util.LinkedList;
/**
 约瑟夫问题II(链表)

 约瑟夫问题是一个著名的趣题。这里我们稍稍修改一下规则。有n个人站成一列。并从头到尾给他们编号，第一个人编号为1。然后从头开始报数，第一轮依次报1，2，1，2...然后报到2的人出局。

 接着第二轮再从上一轮最后一个报数的人开始依次报1，2，3，1，2，3...报到2，3的人出局。以此类推直到剩下以后一个人。现在需要求的即是这个人的编号。

 给定一个int n，代表游戏的人数。请返回最后一个人的编号.

 要注意两点 1.size会随着节点被移出而减小，要注意边界条件的判断 ；2.按题目要求要将最后一个元素移到链表的首位
 * */
public class Joseph2 {
    public static int getResult(int n) {
        if (n < 1) {
            return -1;
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        int round = 2, i, curr = 0;
        for (i = 1; i <= n; i++) {
            list.add(i);
        }
        while (list.size() > 1) {
            i = 0;
            //如果节点被移除size也同样减小，不用增加i，否则i++
            while (list.size() > 1 && i < list.size()) {
                curr = (curr + 1) % round;
                if (curr != 1) {
                    list.remove(i);
                } else {
                    i++;
                }
            }
            // 下一轮的最大报数
            round++;
            // 将下一轮的位置置零
            curr = 0;
            // 将最后报数的元素移动到链表首部，即确保每次报数从链表首部开始。
            int last = list.removeLast();
            list.addFirst(last);

        }
        // 返回最后一个元素
        return list.pop();
    }

    public static void main(String[]args){
        System.out.println(getResult(5));
    }
}