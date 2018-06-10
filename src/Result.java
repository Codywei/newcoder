/**
 珠玑妙算

 我们现在有四个槽，每个槽放一个球，颜色可能是红色(R)、黄色(Y)、绿色(G)或蓝色(B)。例如，可能的情况为RGGB(槽1为红色，槽2、3为绿色，槽4为蓝色)，作为玩家，你需要试图猜出颜色的组合。比如，你可能猜YRGB。

 要是你猜对了某个槽的颜色，则算一次“猜中”。要是只是猜对了颜色但槽位猜错了，则算一次“伪猜中”。注意，“猜中”不能算入“伪猜中”。

 给定两个string A和guess。分别表示颜色组合，和一个猜测。请返回一个int数组，第一个元素为猜中的次数，第二个元素为伪猜中的次数。

 将四个字母的组合和猜测的个数分别统计，并取小。
 * */
public class Result {
    public static int[] calcResult(String A, String guess) {
        int[] array1 = new int[4];
        int[] array2 = new int[4];
        int[] result = new int[2];
        for(int i = 0; i < 4; i++) {
            if(A.charAt(i) == guess.charAt(i)) {
                result[0] += 1;
            }else {
                switch(A.charAt(i)){
                    case 'R':
                        array1[0]++;
                        break;
                    case 'Y':
                        array1[1]++;
                        break;
                    case 'G':
                        array1[2]++;
                        break;
                    case 'B':
                        array1[3]++;
                        break;
                    default:
                        System.out.println("not in ");
                }

                switch(guess.charAt(i)){
                    case 'R':
                        array2[0]++;
                        break;
                    case 'Y':
                        array2[1]++;
                        break;
                    case 'G':
                        array2[2]++;
                        break;
                    case 'B':
                        array2[3]++;
                        break;
                    default:
                        System.out.println("do nothing");
                }
            }
        }
        for(int i= 0; i < 4; i++) {
            result[1] += Math.min(array1[i], array2[i]);
        }
        return result;
    }
    public static void main(String[]args){
        String A="RGBY";
        String guess="GGRR";
        int []res=calcResult(A,guess);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

}
