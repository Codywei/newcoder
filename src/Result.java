/**
 ��������

 �����������ĸ��ۣ�ÿ���۷�һ������ɫ�����Ǻ�ɫ(R)����ɫ(Y)����ɫ(G)����ɫ(B)�����磬���ܵ����ΪRGGB(��1Ϊ��ɫ����2��3Ϊ��ɫ����4Ϊ��ɫ)����Ϊ��ң�����Ҫ��ͼ�³���ɫ����ϡ����磬����ܲ�YRGB��

 Ҫ����¶���ĳ���۵���ɫ������һ�Ρ����С���Ҫ��ֻ�ǲ¶�����ɫ����λ�´��ˣ�����һ�Ρ�α���С���ע�⣬�����С��������롰α���С���

 ��������string A��guess���ֱ��ʾ��ɫ��ϣ���һ���²⡣�뷵��һ��int���飬��һ��Ԫ��Ϊ���еĴ������ڶ���Ԫ��Ϊα���еĴ�����

 ���ĸ���ĸ����ϺͲ²�ĸ����ֱ�ͳ�ƣ���ȡС��
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
